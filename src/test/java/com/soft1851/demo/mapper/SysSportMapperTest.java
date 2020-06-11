package com.soft1851.demo.mapper;

import com.soft1851.demo.domain.entity.SysSport;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class SysSportMapperTest {

    @Resource
    private SysSportMapper sysSportMapper;

    @Test
    void getStepNumber() {
        List<SysSport> sysSports = sysSportMapper.getStepNumber(1l);
        sysSports.forEach(System.out::println);
    }
}