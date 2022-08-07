package com.kopolabs.orderservice.dto;

import lombok.Data;

/**
 * Created by soomin on 2022/08/01
 */
@Data
public class OrderDto {
    private String productId;
    private Integer qty;
    private Integer unitPrice;
    private Integer totalPrice;

    private String orderId;
    private String userId;
}
