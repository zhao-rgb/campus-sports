package com.soft1851.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soft1851.demo.domain.entity.SysDailyAttendance;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zxl
 * @since 2020-06-19
 */
public interface SysDailyAttendanceService extends IService<SysDailyAttendance> {

    /**
     * 插或者更新数据
     * @param sysDailyAttendance
     * @return
     */
    boolean updateOrInsert(SysDailyAttendance sysDailyAttendance);

    /**
     * 根据userId，type去查
     * @param userId
     * @param type
     * @return
     */
    SysDailyAttendance selectUserIdAndType(Long userId, String type);
}