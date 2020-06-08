package com.soft1851.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soft1851.demo.entity.SysCourse;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zxl
 * @since 2020-06-08
 */
public interface SysCourseService extends IService<SysCourse> {

    /**
     * 根据课程类型分组
     * @return
     */
    List<Map<String, Object>> getCourseByType();
}
