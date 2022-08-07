package com.kopolabs.catalogservice.service;

import com.kopolabs.catalogservice.jpa.CatalogEntity;

/**
 * Created by soomin on 2022/08/01
 */
public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
