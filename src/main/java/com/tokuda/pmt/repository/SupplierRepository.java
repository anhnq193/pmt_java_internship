package com.tokuda.pmt.repository;

import com.tokuda.pmt.entity.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<SupplierEntity, Integer> {
}
