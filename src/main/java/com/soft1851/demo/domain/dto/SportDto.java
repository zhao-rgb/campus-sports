package com.soft1851.demo.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

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
public class SportDto {
    private Long userId;
    private Integer stepNumber;
    private LocalDateTime sportTime;
    private Long sportDistance;
}
