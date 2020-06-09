package com.soft1851.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft1851.demo.domain.entity.SysSport;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zxl
 * @since 2020-06-09
 */
public interface SysSportMapper extends BaseMapper<SysSport> {

    List<SysSport> getStepNumber(int userId);

}
