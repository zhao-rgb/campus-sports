package com.soft1851.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soft1851.demo.domain.entity.SysAdvice;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zxl
 * @since 2020-06-17
 */
public interface SysAdviceService extends IService<SysAdvice> {

    /**
     * 意见反馈
     * @param sysAdvice
     * @return
     */
    boolean advice(SysAdvice sysAdvice);

    /**
     * 根据用户id查用户过去发表的意见
     * @param userId
     * @return
     */
    List<SysAdvice> adviceList(Long userId);
}
