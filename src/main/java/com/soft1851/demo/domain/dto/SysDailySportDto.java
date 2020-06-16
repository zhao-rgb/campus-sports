package com.soft1851.demo.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhao
 * @className SysDailySportDto
 * @Description TODO
 * @Date 2020/6/16
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysDailySportDto {
    private Long userId;
    private Integer totalSportNumber;
    private String totalSportDistance;
}
