package com.soft1851.demo.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

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

    @NotNull(message = "名字不能为空")
    @Size(max = 10,message = "名字不能大于10位")
    private String userName;

    @NotNull(message = "密码不能为空")
    @Size(min = 6,max = 20,message = "密码不能小于6位并且不能大于20位")
    private String userPassword;

    private String avatar;
    private Long goStepNumber;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
}
