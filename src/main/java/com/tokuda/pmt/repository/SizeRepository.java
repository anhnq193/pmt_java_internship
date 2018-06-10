package com.tokuda.pmt.repository;

import com.tokuda.pmt.entity.MstSizeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SizeRepository extends JpaRepository<MstSizeEntity, Integer> {
}
