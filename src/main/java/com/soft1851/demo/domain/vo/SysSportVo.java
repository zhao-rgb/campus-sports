package com.soft1851.demo.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * @author zhao
 * @className SysSportVo
 * @Description TODO
 * @Date 2020/6/16
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysSportVo {
    private Long userId;
    private Integer totalSportNumber;
    private String totalSportTime;
    private String totalSportDistance;
    private String totalSportAverageSpeed;
    private Date sportDate;
}
