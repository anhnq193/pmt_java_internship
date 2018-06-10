package com.tokuda.pmt.repository;

import com.tokuda.pmt.entity.InStockEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InStockRepository extends JpaRepository<InStockEntity, Integer> {
    List<InStockEntity> findByProductId (int productId);
}
