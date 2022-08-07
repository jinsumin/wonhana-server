package com.kopolabs.catalogservice.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by soomin on 2022/08/01
 */
@Data
public class CatalogDto implements Serializable {
    private String productId;
    private Integer qty;
    private Integer unitPrice;
    private Integer totalPrice;

    private String orderId;
    private String userId;
}
