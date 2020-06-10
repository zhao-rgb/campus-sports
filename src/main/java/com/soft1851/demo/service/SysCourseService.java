package com.soft1851.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soft1851.demo.domain.entity.SysCourse;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zxl
 * @since 2020-06-10
 */
public interface SysCourseService extends IService<SysCourse> {

    /**
     * 根据类型分组
     * @return
     */
    List<Map<String, Object>> getCourseByType();

    /**
     * 模糊查询
     * @return
     */
    List<SysCourse> blurSelect(String filed);
}
