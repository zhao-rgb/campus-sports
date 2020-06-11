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
    List<SysSport> stepNumber(int userId);

    void insertSport(SysSport sportDto);
}
