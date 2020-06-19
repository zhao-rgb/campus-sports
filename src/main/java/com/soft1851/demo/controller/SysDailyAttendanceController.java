package com.soft1851.demo.controller;

import com.soft1851.demo.common.ResponseResult;
import com.soft1851.demo.domain.entity.SysDailyAttendance;
import com.soft1851.demo.service.SysDailyAttendanceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zxl
 * @since 2020-06-19
 */
@RestController
@RequestMapping("/sysDailyAttendance")
public class SysDailyAttendanceController {

    @Resource
    private SysDailyAttendanceService sysDailyAttendanceService;

    /**
     * 插或者更新数据
     * @param sysDailyAttendance
     * @return
     */
    @PostMapping("/updateOrInsert")
    public ResponseResult updateInfo(@RequestBody SysDailyAttendance sysDailyAttendance) {
        return ResponseResult.success(sysDailyAttendanceService.updateOrInsert(sysDailyAttendance));
    }
}
