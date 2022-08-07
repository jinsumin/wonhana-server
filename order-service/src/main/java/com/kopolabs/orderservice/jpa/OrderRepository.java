package com.kopolabs.orderservice.jpa;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by soomin on 2022/08/01
 */
public interface OrderRepository extends CrudRepository<OrderEntity, Long> {
    OrderEntity findByOrderId(String orderId);
    Iterable<OrderEntity> findByUserId(String userId);
}
