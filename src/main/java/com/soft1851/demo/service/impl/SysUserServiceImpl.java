package com.soft1851.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft1851.demo.common.ResultCode;
import com.soft1851.demo.domain.dto.LoginDto;
import com.soft1851.demo.domain.dto.RegisterDto;
import com.soft1851.demo.domain.dto.SysUserDto;
import com.soft1851.demo.domain.entity.SysUser;
import com.soft1851.demo.exception.CustomException;
import com.soft1851.demo.mapper.SysUserMapper;
import com.soft1851.demo.service.SysUserService;
import com.soft1851.demo.util.Md5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zxl
 * @since 2020-06-10
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;


    @Override
    public SysUser findSysUserById(Long id) {
        return sysUserMapper.selectById(id);
    }

    @Override
    public Map<String, Object> login(LoginDto loginDto) {
        Map<String, Object> map = new HashMap<>(3);
        SysUser user = sysUserMapper.getSysUserByUserAccount(loginDto.getUserAccount());
        // 若此账号查找不存在，在返回账号不存在异常
        if (user == null) {
            throw new CustomException("账号不存在", ResultCode.USER_ACCOUNT_ERROR);
        }
        // 开始比对密码是否正确
        String password = Md5Util.getMd5(loginDto.getUserPassword(), true, 32);
        if(user.getUserPassword().equals(password)) {
            map.put("user",user);
            return map;
        } else {
            throw new CustomException("密码错误", ResultCode.USER_PASSWORD_ERROR);
        }
    }

    @Override
    public boolean updateInfo(SysUserDto sysUserDto) {
        SysUser sysUser = sysUserMapper.getSysUserByUserAccount(sysUserDto.getUserAccount());
        UpdateWrapper<SysUser> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("user_account",sysUserDto.getUserAccount());
        sysUser.setUserName(sysUserDto.getUserName());
        sysUser.setAddress(sysUserDto.getAddress());
        sysUser.setGender(sysUserDto.getGender());
        sysUser.setAvatar(sysUserDto.getAvatar());
        sysUser.setStepNumber(sysUserDto.getStepNumber());
        sysUser.setGoStepNumber(sysUserDto.getGoStepNumber());
        sysUser.setGoStepTime(sysUserDto.getGoStepTime());
        sysUser.setSignature(sysUserDto.getSignature());
        sysUser.setDailyAttendance(sysUserDto.getDailyAttendance());
        sysUser.setHeight(sysUserDto.getHeight());
        sysUser.setWeight(sysUserDto.getWeight());
        sysUser.setGmtModified(sysUserDto.getGmtModified());
        sysUserMapper.update(sysUser,updateWrapper);
        return true;
    }

    @Override
    public boolean register(RegisterDto registerDto) {
        SysUser user = sysUserMapper.getSysUserByUserAccount(registerDto.getUserAccount());
        //如果账号不为空，直接返回用户已经存在
        if (user != null){
            throw new CustomException("用户已经存在",ResultCode.USER_FOUND);
        } else {
            RegisterDto registerDto1 = RegisterDto.builder()
                    .userAccount(registerDto.getUserAccount())
                    .userName(registerDto.getUserName())
                    .userPassword(Md5Util.getMd5(registerDto.getUserPassword(),true,32))
                    .avatar("https://kkkksslls.oss-cn-beijing.aliyuncs.com/campus/头像.png")
                    .goStepNumber((long) 0)
                    .gmtCreate(LocalDateTime.now())
                    .gmtModified(LocalDateTime.now())
                    .build();
            sysUserMapper.insertUser(registerDto1);
        }
        return true;
    }

    @Override
    public List<SysUser> stepRanking() {
        QueryWrapper<SysUser> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("go_step_number");
        return sysUserMapper.selectList(wrapper);
    }


}
