package com.soft1851.demo.mapper;

import com.soft1851.demo.domain.entity.SysDailySport;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SysSportMapperTest {

    @Resource
    private SysSportMapper sysSportMapper;

    @Resource
    private SysDailySportMapper sysDailySportMapper;


    @Test
    void selectSport() {
        List<SysDailySport> sysDailySports = sysSportMapper.selectSport();
        List<SysDailySport> list = new ArrayList<>();
        for (SysDailySport sysDailySport: sysDailySports){
            list.add(sysDailySport);
            System.out.println(list);
        }
        sysDailySportMapper.batchInsertSport(list);
    }

//    @Test
//    void getStepNumber() {
//        List<SysSport> sysSports = sysSportMapper.getStepNumber(1l);
//        sysSports.forEach(System.out::println);
//    }
}