package com.kopolabs.userservice.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by soomin on 2022/07/29
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Greeting {
    @Value("${greeting.message}")
    private String message;
}
