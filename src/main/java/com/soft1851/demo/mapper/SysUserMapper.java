package com.soft1851.demo.mapper;

import com.soft1851.demo.domain.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zxl
 * @since 2020-06-10
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    /**
     * 根据用户账号查询所有信息
     * @param userAccount
     * @return
     */
    @Select("SELECT * FROM sys_user WHERE user_account = #{userAccount}")
    SysUser getSysUserByUserAccount(@Param("userAccount") String userAccount);
}
