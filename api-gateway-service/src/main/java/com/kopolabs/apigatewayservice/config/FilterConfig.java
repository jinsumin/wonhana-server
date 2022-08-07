package com.kopolabs.apigatewayservice.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by soomin on 2022/07/28
 */
//@Configuration
public class FilterConfig {
    //@Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/v2/api-docs/api")
                        .filters(f -> f.rewritePath("/v2/api-docs/api", "/v2/api-docs"))
                        .uri("lb://wonhana-api"))
                .route(r -> r.path("/first-service/**")
                        .uri("lb://first-service"))
                .route(r -> r.path("/users/**")
                        .uri("lb://user-service"))
                .build();
    }
}
