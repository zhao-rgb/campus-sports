package com.soft1851.demo.service;

import com.soft1851.demo.domain.entity.SysCourse;
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

    @Test
    void blurSelect() {
        List<SysCourse> maps = sysCourseService.blurSelect("体能");
        System.out.println(maps);
    }

//    @Test
//    void batchInsert() {
//        boolean ints = sysCourseService.saveBatch(Spider.getCourses());
//    }
}