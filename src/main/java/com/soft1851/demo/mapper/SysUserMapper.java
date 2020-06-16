package com.soft1851.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft1851.demo.domain.dto.RegisterDto;
import com.soft1851.demo.domain.entity.SysUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zxl
 * @since 2020-06-10
 */
@Repository
public interface SysUserMapper extends BaseMapper<SysUser> {

    /**
     * 根据用户账号查询所有信息
     * @param userAccount
     * @return
     */
    @Select("SELECT * FROM sys_user WHERE user_account = #{userAccount}")
    SysUser getSysUserByUserAccount(@Param("userAccount") String userAccount);

    /**
     * 用户注册
     * @param registerDto
     */
    @Insert("INSERT INTO sys_user(user_account,user_name,user_password) VALUES (#{userAccount}, #{userName}, #{userPassword})")
    void insert(RegisterDto registerDto);
}
