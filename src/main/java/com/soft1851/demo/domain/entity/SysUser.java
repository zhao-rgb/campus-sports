package com.soft1851.demo.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author zxl
 * @since 2020-06-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_user")
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId("id")
    private Long id;

    /**
     * 账号
     */
    @TableField("user_account")
    private String userAccount;

    /**
     * 用户名
     */
    @TableField("user_name")
    private String userName;
    /**
     * 密码
     */
    @TableField("password")
    private String password;
    /**
     * 加密盐
     */
    @TableField("salt")
    private String salt;

    /**
     * 地址
     */
    @TableField("address")
    private String address;

    /**
     * 性别
     */
    @TableField("gender")
    private String gender;

    /**
     * 用户头像
     */
    @TableField("avatar")
    private String avatar;

    /**
     * 步数
     */
    @TableField("step_number")
    private Long stepNumber;

    /**
     * 个签
     */
    @TableField("signature")
    private String signature;

    /**
     * 关注
     */
    @TableField("follow")
    private Long follow;

    /**
     * 粉丝
     */
    @TableField("fans")
    private Long fans;

    /**
     * 创建时间
     */
    @TableField("gmt_create")
    private LocalDateTime gmtCreate;

    /**
     * 更新时间
     */
    @TableField("gmt_modified")
    private LocalDateTime gmtModified;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
