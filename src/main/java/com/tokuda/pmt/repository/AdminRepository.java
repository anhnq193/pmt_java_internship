package com.tokuda.pmt.repository;

import com.tokuda.pmt.entity.AdminEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AdminRepository extends CrudRepository<AdminEntity, Integer> {
    Optional<AdminEntity> findByUsername (String userName);
}
