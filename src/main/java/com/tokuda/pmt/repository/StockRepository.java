package com.tokuda.pmt.repository;

import com.tokuda.pmt.entity.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StockRepository extends JpaRepository<StockEntity, Integer> {
    Optional<StockEntity> findByProductId(int productId);

    void
}
