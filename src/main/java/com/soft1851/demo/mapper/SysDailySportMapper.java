package com.soft1851.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft1851.demo.domain.dto.SysDailySportDto;
import com.soft1851.demo.domain.entity.SysDailySport;
import org.apache.ibatis.annotations.Param;

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

    /**
     * 批量插入每天运动的数据（sum求和）
     * @param sysDailySports
     * @return
     */
    int batchInsertSport(@Param("sports") List<SysDailySport> sysDailySports);

    /**
     * 统计本月全部步数和距离
     * @param userId
     * @return
     */
    List<SysDailySportDto> numSport(Long userId);
}