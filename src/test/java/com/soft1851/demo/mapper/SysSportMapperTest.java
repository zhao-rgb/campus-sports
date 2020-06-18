package com.soft1851.demo.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SysSportMapperTest {

    @Resource
    private SysSportMapper sysSportMapper;

    @Resource
    private SysDailySportMapper sysDailySportMapper;


    @Test
    void selectSport() {
//        System.out.println("定时任务开始");
//        List<SysDailySport> sysDailySports = sysSportMapper.selectSport();
//        if(sysDailySports == null) {
//            System.out.println("空值异常");
//        } else {
//            List<SysDailySport> list = new ArrayList<>();
//            for (SysDailySport sysDailySport: sysDailySports){
//                List<SysSport> sysSports = sysSportMapper.selectTodayTime(sysDailySport.getUserId());
//                String[] timeList = new String[sysSports.size()];
//                for (int i = 0; i < sysSports.size(); i++) {
//                    timeList[i] = sysSports.get(i).getSportTime();
//                }
//                sysDailySport.setTotalSportTime(TimeDemo.getTotal(timeList));
//                list.add(sysDailySport);
//                System.out.println(list);
//            }
//            sysDailySportMapper.batchInsertSport(list);
//            System.out.println("定时任务结束");
//        }
    }

//    @Test
//    void getStepNumber() {
//        List<SysSport> sysSports = sysSportMapper.getStepNumber(1l);
//        sysSports.forEach(System.out::println);
//    }
}