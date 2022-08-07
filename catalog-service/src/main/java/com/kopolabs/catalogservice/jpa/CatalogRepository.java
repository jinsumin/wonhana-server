package com.kopolabs.catalogservice.jpa;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by soomin on 2022/08/01
 */
public interface CatalogRepository extends CrudRepository<CatalogEntity, Long> {
    CatalogEntity findByProductId(String productId);
}
