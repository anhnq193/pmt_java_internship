package com.tokuda.pmt.repository;

import com.tokuda.pmt.entity.OutStockEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutStockRepository extends JpaRepository<OutStockEntity, Integer> {
}
