package com.soft1851.demo.mapper;

import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SysDailyAttendanceMapperTest {

    @Resource
    private SysDailyAttendanceMapper sysDailyAttendanceMapper;

//    @Test
//    void selectType() {
//        SysDailyAttendance sysDailyAttendances = sysDailyAttendanceMapper.selectType(1l, "20206");
//        System.out.println(sysDailyAttendances);
//    }
}