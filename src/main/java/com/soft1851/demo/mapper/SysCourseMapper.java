package com.soft1851.demo.mapper;

import com.soft1851.demo.entity.SysCourse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zxl
 * @since 2020-06-09
 */
public interface SysCourseMapper extends BaseMapper<SysCourse> {

    int batchInsert(@Param("courses") List<SysCourse> sysCourses);

}
