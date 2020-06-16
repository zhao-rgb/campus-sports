package com.soft1851.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soft1851.demo.domain.dto.SysDailySportDto;
import com.soft1851.demo.domain.entity.SysDailySport;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zxl
 * @since 2020-06-13
 */
public interface SysDailySportService extends IService<SysDailySport> {

    /**
     * 本月统计步数
     * @param userId
     * @param totalSportNumber
     * @return
     */
    int monthStepNumber(Long userId, int totalSportNumber);

    /**
     * 一个星期内的步数
     * @param userId
     * @return
     */
    List<SysDailySport> stepNumber(Long userId);

    /**
     * 统计本月全部步数和距离
     * @param userId
     * @return
     */
    List<SysDailySportDto> getNumSport(Long userId);
}
