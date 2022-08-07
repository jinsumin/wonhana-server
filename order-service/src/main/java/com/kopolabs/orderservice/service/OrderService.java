package com.kopolabs.orderservice.service;

import com.kopolabs.orderservice.dto.OrderDto;
import com.kopolabs.orderservice.jpa.OrderEntity;

/**
 * Created by soomin on 2022/08/02
 */
public interface OrderService {
    OrderDto createOrder(OrderDto orderDetail);
    OrderDto getOrderByOrderId(String orderId);
    Iterable<OrderEntity> getOrdersByUserId(String userId);
}
