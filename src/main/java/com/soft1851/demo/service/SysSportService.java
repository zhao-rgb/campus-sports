package com.soft1851.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soft1851.demo.domain.entity.SysSport;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zxl
 * @since 2020-06-10
 */
public interface SysSportService extends IService<SysSport> {

    /**
     * 一个星期内的步数
     * @param userId
     * @return
     */
    List<SysSport> stepNumber(Long userId);

    /**
     * 根据userId查用户运动的记录
     * @param userId
     * @return
     */
    List<SysSport> getSysSportByUserId(Long userId);

    /**
     * 本月统计步数
     * @param userId
     * @param stepNumber
     * @return
     */
    int monthStepNumber(Long userId, int stepNumber);
}
