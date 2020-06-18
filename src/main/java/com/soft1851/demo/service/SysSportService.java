package com.soft1851.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soft1851.demo.domain.entity.SysSport;
import com.soft1851.demo.domain.vo.SysSportVo;

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
     * 根据userId查用户运动的记录
     * @param userId
     * @return
     */
    List<SysSport> getSysSportByUserId(Long userId);


    /**
     * 查找用户每天运动的步数等（求和）
     * @param userId
     * @return
     */
    SysSportVo getSumSport(Long userId);

}
