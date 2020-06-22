package com.soft1851.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft1851.demo.domain.entity.SysDailyAttendance;
import com.soft1851.demo.mapper.SysDailyAttendanceMapper;
import com.soft1851.demo.service.SysDailyAttendanceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zxl
 * @since 2020-06-19
 */
@Service
public class SysDailyAttendanceServiceImpl extends ServiceImpl<SysDailyAttendanceMapper, SysDailyAttendance> implements SysDailyAttendanceService {

    @Resource
    private SysDailyAttendanceMapper sysDailyAttendanceMapper;

    @Override
    public boolean updateOrInsert(SysDailyAttendance sysDailyAttendance) {
        SysDailyAttendance sysDailyAttendances = sysDailyAttendanceMapper.selectType(sysDailyAttendance.getUserId(), sysDailyAttendance.getType());
        //空值则插入，不空则去更新
        if (sysDailyAttendances == null) {
            sysDailyAttendanceMapper.insert(sysDailyAttendance);
            return true;
        }
        UpdateWrapper<SysDailyAttendance> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("user_id",sysDailyAttendance.getUserId()).eq("type",sysDailyAttendance.getType());
        sysDailyAttendances.setDailyArray(sysDailyAttendance.getDailyArray());
        sysDailyAttendanceMapper.update(sysDailyAttendances,updateWrapper);
        return true;

    }

    @Override
    public SysDailyAttendance selectUserIdAndType(Long userId, String type) {
        return sysDailyAttendanceMapper.selectType(userId,type);
    }
}
