package com.soft1851.demo.mapper;

import com.soft1851.demo.domain.entity.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class SysUserMapperTest {

    @Resource
    private SysUserMapper sysUserMapper;

    @Test
    void cha() {
        List<SysUser> sysUsers = sysUserMapper.selectList(null);
        sysUsers.forEach(System.out::println);
    }

}