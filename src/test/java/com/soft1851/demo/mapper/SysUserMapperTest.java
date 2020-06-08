package com.soft1851.demo.mapper;

import com.soft1851.demo.entity.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SysUserMapperTest {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    void cha() {
        List<SysUser> sysUsers = sysUserMapper.selectList(null);
        sysUsers.forEach(System.out::println);
    }

}