package com.kopolabs.userservice.vo;

import lombok.Data;

import java.util.Date;

/**
 * Created by soomin on 2022/07/31
 */
@Data
public class ResponseOrder {
    private String productId;
    private Integer qty;
    private Integer unitPrice;
    private Integer totalPrice;
    private Date createdAt;

    private String orderId;
}
