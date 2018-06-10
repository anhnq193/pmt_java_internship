package com.tokuda.pmt.service.model;

import com.tokuda.pmt.entity.StockEntity;
import com.tokuda.pmt.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StockService {
    private final StockRepository stockRepository;

    @Autowired
    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public List<StockEntity> find(){
        return stockRepository.findAll();
    }

    public void save(StockEntity stockEntity){
        stockRepository.saveAndFlush(stockEntity);
    }

    public void update(StockEntity stockEntity){
        stockRepository.saveAndFlush(stockEntity);
    }

    public void delete(StockEntity stockEntity){
        stockRepository.delete(stockEntity);
    }
}
