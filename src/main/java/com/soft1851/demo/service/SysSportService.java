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
 * @since 2020-06-09
 */
public interface SysSportService extends IService<SysSport> {

    List<SysSport> stepNumber(int userId);
}
