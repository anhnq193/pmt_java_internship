package com.tokuda.pmt.repository;

import com.tokuda.pmt.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

    Optional<ProductEntity> findByProductCodeAndShopEntity_Id (String productCode, int shopId);

    <S extends ProductEntity> S sav(S entity);
}
