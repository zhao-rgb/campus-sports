package com.soft1851.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft1851.demo.domain.entity.SysAdvice;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zxl
 * @since 2020-06-17
 */
public interface SysAdviceMapper extends BaseMapper<SysAdvice> {

    /**
     * 根据用户id查用户过去发表的意见
     * @param userId
     * @return
     */
    @Select("SELECT * FROM sys_advice WHERE user_id = #{userId} ORDER BY gmt_modified DESC")
    List<SysAdvice> getSysAdviceList(@Param("userId") Long userId);
}
