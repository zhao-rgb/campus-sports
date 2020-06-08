package com.soft1851.demo.controller;


import com.soft1851.demo.common.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zxl
 * @since 2020-06-08
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {
@GetMapping("hello")
    public ResponseResult hello(){
    return ResponseResult.success();
}
}
