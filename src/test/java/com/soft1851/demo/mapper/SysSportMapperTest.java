package com.soft1851.demo.mapper;

import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SysSportMapperTest {

    @Resource
    private SysSportMapper sysSportMapper;

//    @Test
//    void getStepNumber() {
//        List<SysSport> sysSports = sysSportMapper.getStepNumber(1l);
//        sysSports.forEach(System.out::println);
//    }
}