package com.kopolabs.catalogservice.service;

import com.kopolabs.catalogservice.jpa.CatalogEntity;
import com.kopolabs.catalogservice.jpa.CatalogRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by soomin on 2022/08/01
 */
@Data
@Slf4j
@Service
public class CatalogServiceImpl implements CatalogService {
    CatalogRepository catalogRepository;

    @Autowired
    public CatalogServiceImpl(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    @Override
    public Iterable<CatalogEntity> getAllCatalogs() {
        return catalogRepository.findAll();
    }
}
