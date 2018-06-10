package com.tokuda.pmt.service.model;

import com.tokuda.pmt.entity.InStockEntity;
import com.tokuda.pmt.repository.InStockRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InStockService {
    private final InStockRepository inStockRepository;

    @Autowired
    public InStockService(InStockRepository inStockRepository) {
        this.inStockRepository = inStockRepository;
    }

    public List<InStockEntity> find(){
        return inStockRepository.findAll();
    }

    public void save(InStockEntity inStockEntity){
        inStockRepository.saveAndFlush(inStockEntity);
    }

    public void update(InStockEntity inStockEntity){
        inStockRepository.saveAndFlush(inStockEntity);
    }

    public void delete(InStockEntity inStockEntity){
        inStockRepository.delete(inStockEntity);
    }
}
