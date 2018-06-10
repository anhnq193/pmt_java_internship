package com.tokuda.pmt.service.model;

import com.tokuda.pmt.entity.ProductEntity;
import com.tokuda.pmt.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final ShopRepository shopRepository;
    private final MakerRepository makerRepository;
    private final SupplierRepository supplierRepository;
    private final SizeRepository sizeRepository;
    private final ColorRepository colorRepository;

    @Autowired
    public ProductService(ProductRepository makerRepository, ShopRepository shopRepository, MakerRepository makerRepository1, SupplierRepository supplierRepository, SizeRepository sizeRepository, ColorRepository colorRepository) {
        this.productRepository = makerRepository;
        this.shopRepository = shopRepository;
        this.makerRepository = makerRepository1;
        this.supplierRepository = supplierRepository;
        this.sizeRepository = sizeRepository;
        this.colorRepository = colorRepository;
    }

    public List<ProductEntity> find(){
        return productRepository.findAll();
    }

    public Optional<ProductEntity> findByProductCodeAndShopId(String productCode, int shopId){
        return productRepository.findByProductCodeAndShopEntity_Id(productCode, shopId);
    }

    public void save(ProductEntity productEntity, int shopId, int makerId, int supplierId, int colorId, int sizeId){
        productEntity.setShop(shopRepository.findById(shopId).get());
        productEntity.setMaker(makerRepository.findById(makerId).get());
        productEntity.setSupplier(supplierRepository.findById(supplierId).get());
        productEntity.setColor(colorRepository.findById(colorId).get());
        productEntity.setSize(sizeRepository.findById(sizeId).get());
        productRepository.saveAndFlush(productEntity);
    }

    public void save(ProductEntity productEntity){
        productRepository.saveAndFlush(productEntity);
    }

    public void update(ProductEntity productEntity) throws ChangeSetPersister.NotFoundException {
        if (productRepository.findById(productEntity.getId()).isPresent()){
            productRepository.saveAndFlush(productEntity);
        }else {
            throw new ChangeSetPersister.NotFoundException();
        }
    }

    public void delete(ProductEntity productEntity){
        productRepository.delete(productEntity);
    }
}
