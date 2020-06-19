package com.soft1851.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft1851.demo.domain.entity.SysDailyAttendance;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zxl
 * @since 2020-06-19
 */
public interface SysDailyAttendanceMapper extends BaseMapper<SysDailyAttendance> {

    /**
     * 根据userId，type去查
     * @param userId
     * @param type
     * @return
     */
    @Select("SELECT * FROM sys_daily_attendance WHERE user_id = #{userId} AND type = #{type}")
    SysDailyAttendance selectType(Long userId, String type);
}
