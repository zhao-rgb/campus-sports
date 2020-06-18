package com.soft1851.demo.util;

import com.soft1851.demo.domain.entity.SysDailySport;
import com.soft1851.demo.domain.entity.SysSport;
import com.soft1851.demo.mapper.SysDailySportMapper;
import com.soft1851.demo.mapper.SysSportMapper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * @author zhao
 * @className ScheduledTask
 * @Description 定时每天插入记录
 * @Date 2020/6/14
 * @Version 1.0
 **/
@Component
public class ScheduledTask {

    @Resource
    private SysSportMapper sysSportMapper;

    @Resource
    private SysDailySportMapper sysDailySportMapper;

    @Scheduled(cron = "40 59 23 * * *")
    public void scheduledTask() {
        System.out.println("定时任务开始");
        List<SysDailySport> sysDailySports = sysSportMapper.selectSport();
        if(sysDailySports == null) {
            System.out.println("空值异常");
        } else {
            List<SysDailySport> list = new ArrayList<>();
            for (SysDailySport sysDailySport: sysDailySports){
                List<SysSport> sysSports = sysSportMapper.selectTodayTime(sysDailySport.getUserId());
                String[] timeList = new String[sysSports.size()];
                for (int i = 0; i < sysSports.size(); i++) {
                    timeList[i] = sysSports.get(i).getSportTime();
                }
                sysDailySport.setTotalSportTime(TimeDemo.getTotal(timeList));
                list.add(sysDailySport);
                System.out.println(list);
            }
            sysDailySportMapper.batchInsertSport(list);
            System.out.println("定时任务结束");
        }
    }

}

