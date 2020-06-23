package com.soft1851.demo.service;

import com.soft1851.demo.mapper.SysSportMapper;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SysSportServiceTest {

    @Resource
    private SysSportMapper sysSportMapper;

//    @Test
//    void getSumSport() {
//        SysSportVo sysSportVos = sysSportMapper.sumSport(1l);
//        List<SysSport> sysSports = sysSportMapper.selectTodayTime(1l);
//        String[] timeList = new String[sysSports.size()];
//        for (int i = 0; i < sysSports.size(); i++) {
//            timeList[i] = sysSports.get(i).getSportTime();
//        }
//        sysSportVos.setTotalSportTime(TimeDemo.getTotal(timeList));
//        System.out.println(sysSportVos);
//    }
}