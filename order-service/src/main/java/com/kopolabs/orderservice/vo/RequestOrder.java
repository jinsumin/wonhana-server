package com.kopolabs.orderservice.vo;

import lombok.Data;

/**
 * Created by soomin on 2022/08/02
 */
@Data
public class RequestOrder {
    private String productId;
    private Integer qty;
    private Integer unitPrice;
}
