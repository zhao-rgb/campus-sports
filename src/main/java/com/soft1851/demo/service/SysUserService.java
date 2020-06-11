package com.soft1851.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soft1851.demo.domain.dto.LoginDto;
import com.soft1851.demo.domain.dto.SysUserDto;
import com.soft1851.demo.domain.entity.SysUser;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zxl
 * @since 2020-06-10
 */
public interface SysUserService extends IService<SysUser> {

    /**
     * 根据主键查询用户信息
     * @param id
     * @return
     */
    SysUser findSysUserById(Long id);

    /**
     * 登录
     * @param loginDto
     * @return
     */
    Map<String,Object> login(LoginDto loginDto);

    /**
     * 修改用户信息
     * @param sysAdminDto
     * @return boolean
     */
    boolean updateInfo(SysUserDto sysAdminDto);
}
