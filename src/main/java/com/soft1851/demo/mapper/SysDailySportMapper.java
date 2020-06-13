package com.soft1851.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft1851.demo.domain.entity.SysDailySport;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zxl
 * @since 2020-06-13
 */
public interface SysDailySportMapper extends BaseMapper<SysDailySport> {

    /**
     * 本月统计步数
     * @param userId
     * @param totalSportNumber
     * @return
     */
    int getMonthStepNumber(Long userId, int totalSportNumber);

    /**
     * 一个星期内的步数
     * @param userId
     * @return
     */
    List<SysDailySport> getStepNumber(Long userId);
}