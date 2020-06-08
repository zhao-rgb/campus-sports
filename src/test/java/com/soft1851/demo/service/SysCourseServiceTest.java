package com.soft1851.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootTest
class SysCourseServiceTest {
    @Resource
    private SysCourseService sysCourseService;

    @Test
    void getCourseByType() {
        List<Map<String, Object>> maps = new ArrayList<>();
        maps = sysCourseService.getCourseByType();
        for (Map<String, Object> map : maps) {
            System.out.println(map);
        }
    }
}