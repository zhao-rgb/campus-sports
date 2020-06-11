package com.soft1851.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft1851.demo.domain.entity.SysCourse;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zxl
 * @since 2020-06-10
 */
public interface SysCourseMapper extends BaseMapper<SysCourse> {

    /**
     * 批量插入
     * @param sysCourses
     * @return
     */
    int batchInsert(@Param("courses") List<SysCourse> sysCourses);
}
