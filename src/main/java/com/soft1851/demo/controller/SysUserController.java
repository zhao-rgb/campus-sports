package com.soft1851.demo.controller;


import com.soft1851.demo.common.ResponseResult;
import com.soft1851.demo.domain.dto.LoginDto;
import com.soft1851.demo.domain.dto.RegisterDto;
import com.soft1851.demo.domain.dto.SysUserDto;
import com.soft1851.demo.domain.entity.SysUser;
import com.soft1851.demo.service.SysUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
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
@RequestMapping("/sysUser")
@Validated
public class SysUserController {

    @Resource
    private SysUserService sysUserService;

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    @GetMapping("/select")
    public SysUser findSysUserById(@Param("id") Long id) {
        return sysUserService.findSysUserById(id);
    }

    /**
     * 登录
     * @param loginDto
     * @return
     */
    @PostMapping("/login")
    public Map<String,Object> login(@RequestBody LoginDto loginDto){
        return sysUserService.login(loginDto);
    }

    /**
     * 更新用户的信息
     * @param sysUserDto
     * @return
     */
    @PostMapping("/update")
    public ResponseResult updateInfo(@RequestBody SysUserDto sysUserDto) {
        return ResponseResult.success(sysUserService.updateInfo(sysUserDto));
    }

    /**
     * 用户注册
     * @param registerDto
     * @return
     */
    @PostMapping("/register")
    public ResponseResult addRole(@RequestBody @Valid RegisterDto registerDto) {
        return ResponseResult.success(sysUserService.register(registerDto));
    }

    /**
     * 用户步数排行
     * @return
     */
    @GetMapping("/stepRanking")
    public List<SysUser> getStepRanking() {
        return sysUserService.stepRanking();
    }

}
