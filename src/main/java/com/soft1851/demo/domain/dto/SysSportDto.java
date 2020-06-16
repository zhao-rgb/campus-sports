package com.soft1851.demo.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhao
 * @className sportdto
 * @Description TODO
 * @Date 2020/6/9
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysSportDto {
    private Long userId;
    private Integer stepNumber;
    private String sportTime;
    private String sportDistance;
    private String sportAverageSpeed;
    private String sportUrl;
    private String sportPattern;
}
