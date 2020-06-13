package com.soft1851.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft1851.demo.domain.entity.SysSport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zxl
 * @since 2020-06-10
 */
@Repository
public interface SysSportMapper extends BaseMapper<SysSport> {

    /**
     * 一个星期内的步数
     * @param userId
     * @return
     */
    List<SysSport> getStepNumber(Long userId);

    /**
     * 根据userId查用户运动的记录
     * @param userId
     * @return
     */
    List<SysSport> getSelectSport(Long userId);

    /**
     * 本月统计步数
     * @param userId
     * @param stepNumber
     * @return
     */
    int getMonthStepNumber(Long userId, int stepNumber);
}
