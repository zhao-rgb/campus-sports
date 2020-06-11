package com.soft1851.demo.controller;


import com.soft1851.demo.domain.entity.SysCourse;
import com.soft1851.demo.service.SysCourseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zxl
 * @since 2020-06-10
 */
@RestController
@RequestMapping("/sysCourse")
public class SysCourseController {

    @Resource
    private SysCourseService sysCourseService;

    /**
     * 根据类型分类
     * @return
     */
    @GetMapping("/type")
    public List<Map<String,Object>> getByType(){
        return sysCourseService.getCourseByType();
    }

    /**
     * 模糊查询
     * @param field
     * @return
     */
    @GetMapping("/blurSelect")
    public List<SysCourse> blurSelectSysCourse(@Param("field") String field) {
        return sysCourseService.blurSelect(field);
    }

}
