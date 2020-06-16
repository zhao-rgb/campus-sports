package com.soft1851.demo.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhao
 * @className RegisterDto
 * @Description TODO
 * @Date 2020/6/16
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterDto {
    private String userAccount;
    private String userName;
    private String userPassword;
}
