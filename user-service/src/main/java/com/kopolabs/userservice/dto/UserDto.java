package com.kopolabs.userservice.dto;

import com.kopolabs.userservice.vo.ResponseOrder;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by soomin on 2022/07/29
 */
@Data
public class UserDto {
    private String email;
    private String name;
    private String pwd;
    private String userId;
    private Date createdAt;

    private String encryptedPwd;

    private List<ResponseOrder> orders;
}
