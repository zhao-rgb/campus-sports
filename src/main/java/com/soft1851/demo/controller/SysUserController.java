package com.soft1851.demo.controller;


import com.soft1851.demo.domain.dto.LoginDto;
import com.soft1851.demo.domain.entity.SysUser;
import com.soft1851.demo.service.SysUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
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
@RequestMapping("/sysUser")
public class SysUserController {

    @Resource
    private SysUserService sysUserService;

    @GetMapping("/select")
    public SysUser findSysUserById(@Param("id") Long id) {
        return sysUserService.findSysUserById(id);
    }

    @PostMapping("/login")
    public Map<String,Object> login(@RequestBody LoginDto loginDto){
        return sysUserService.login(loginDto);
    }
}
