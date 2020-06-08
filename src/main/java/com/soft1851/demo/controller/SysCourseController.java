package com.soft1851.demo.controller;


import com.soft1851.demo.common.ResponseResult;
import com.soft1851.demo.service.SysCourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zxl
 * @since 2020-06-08
 */
@RestController
@RequestMapping("/sysCourse")
public class SysCourseController {
    @Resource
    private SysCourseService sysCourseService;

    @GetMapping("/type")
    public ResponseResult getByType(){
        return ResponseResult.success(sysCourseService.getCourseByType());
    }

}
