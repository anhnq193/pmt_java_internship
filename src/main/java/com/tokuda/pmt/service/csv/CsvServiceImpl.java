package com.tokuda.pmt.service.csv;

import com.tokuda.pmt.entity.InStockEntity;
import com.tokuda.pmt.entity.ProductEntity;
import com.tokuda.pmt.entity.StockEntity;
import com.tokuda.pmt.entity.api.CsvEntity;
import com.tokuda.pmt.repository.*;
import com.tokuda.pmt.service.model.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
public class CsvServiceImpl implements CsvService {

    private final CsvReader csvReader;
    private final ProductService productService;
    private final StockRepository stockRepository;
    private final InStockRepository inStockRepository;


    @Autowired
    public CsvServiceImpl(CsvReader csvReader, ProductService productService, StockRepository stockRepository, InStockRepository inStockRepository) {
        this.csvReader = csvReader;
        this.productService = productService;
        this.stockRepository = stockRepository;
        this.inStockRepository = inStockRepository;

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void csvAnalyze(String csvContent, int shopId, int supplerId) {
            List<CsvEntity> csvEntityList = csvReader.csvRead(csvContent);
            csvEntityList.forEach(csvEntity -> {
            productEntitySave(csvEntity, shopId, supplerId);
            stockEntitySave(csvEntity, shopId, supplerId);
            inStockEntitySave(csvEntity, shopId, supplerId);
        });

    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public int productEntitySave(CsvEntity csvEntity, int shopId, int supplerId) {
        int productId;
        Optional<ProductEntity> optionalProductEntity = productService.findByProductCodeAndShopId(csvEntity.getProductCode(), shopId);
        if(optionalProductEntity.isPresent()){
            ProductEntity productEntity = optionalProductEntity.get();
            productEntity.setIsEnable((byte) 1);
            productEntity.setStatus(1);
            productId = productEntity.getId();
            productService.save(productEntity);
        }else {
            ProductEntity productEntity = new ProductEntity();
            productEntity.setIsEnable((byte) 1);
            productEntity.setStatus(1);
            productEntity.setProductCode(csvEntity.getProductCode());
            productEntity.setProductName(csvEntity.getProductName());
            productEntity.setStockPrice(csvEntity.getStockPrice());
            productEntity.setNotaxPrice(csvEntity.getNotaxPrice());
            productEntity.setTaxPrice(csvEntity.getTaxPrice());
            productEntity.setMemberPrice(csvEntity.getMemberPrice());
            productEntity.setNotes(csvEntity.getNote());
            productEntity.setCreatedDate(Timestamp.from(Instant.now()));
            productEntity.setUpdatedDate(Timestamp.from(Instant.now()));
            productService.save(productEntity, shopId, csvEntity.getMakerId(), supplerId, csvEntity.getColorId(), csvEntity.getSizeId());
            productId = productEntity.getId();
        }
        return productId;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public void stockEntitySave(CsvEntity csvEntity, int shopId, int productId) {
        Optional<StockEntity> stockEntityOptional = stockRepository.findByProductId(productId);
        if(stockEntityOptional.isPresent()){
            StockEntity stockEntity = stockEntityOptional.get();
            stockEntity.setAvailableNumber(stockEntity.getAvailableNumber() + csvEntity.getAvailableNumber());
            stockEntity.setStockNumber(stockEntity.getStockNumber() + csvEntity.getAvailableNumber());
            stockEntity.setUpdatedDate(Timestamp.from(Instant.now()));
        }else {
            StockEntity stockEntity = new StockEntity();
            stockEntity.getProduct().(productId);
            stockEntity.setAvailableNumber(csvEntity.getAvailableNumber());
            stockEntity.setShopId(shopId);
            stockEntity.setStockNumber(csvEntity.getAvailableNumber());
            stockEntity.setCreatedDate(Timestamp.from(Instant.now()));
            stockEntity.setUpdatedDate(Timestamp.from(Instant.now()));
        }
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public void inStockEntitySave(CsvEntity csvEntity, int shopId, int productId) {
        InStockEntity inStockEntity = new InStockEntity();
        inStockEntity.setCreatedDate(Timestamp.from(Instant.now()));
        inStockEntity.setUpdatedDate(Timestamp.from(Instant.now()));
        inStockEntity.setInNumber(csvEntity.getAvailableNumber());
        inStockEntity.setProduct(productId);
        inStockEntity.setShop(shopId);
        inStockRepository.save(inStockEntity);
    }
}
