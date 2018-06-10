package com.tokuda.pmt.repository;

import com.tokuda.pmt.entity.MstColorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepository extends JpaRepository<MstColorEntity, Integer> {
}
