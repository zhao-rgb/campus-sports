package com.soft1851.demo.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhao
 * @className SysUserDto
 * @Description TODO
 * @Date 2020/6/11
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysUserDto {
    private String userAccount;
    private String userName;
    private String userPassword;
    private String address;
    private String gender;
    private String avatar;
    private Long stepNumber;
    private Long goStepNumber;
    private Long goStepTime;
    private String signature;
    private Long dailyAttendance;
}
