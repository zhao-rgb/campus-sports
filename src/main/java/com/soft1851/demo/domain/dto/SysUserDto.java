package com.soft1851.demo.domain.dto;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

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
    private String address;
    private String gender;
    private String avatar;
    private Long stepNumber;
    private Long goStepNumber;
    private Long goStepTime;
    private String signature;
    private Long dailyAttendance;
    private String height;
    private String weight;
    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime gmtModified;
}
