package com.soft1851.demo.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zxl
 * @since 2020-06-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_user")
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId("id")
    private Long id;

    /**
     * 用户账号
     */
    @TableField("user_account")
    private String userAccount;

    /**
     * 用户名
     */
    @TableField("user_name")
    private String userName;

    /**
     * 用户密码
     */
    @TableField("user_password")
    private String userPassword;

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
     * 微信步数
     */
    @TableField("step_number")
    private Long stepNumber;

    /**
     * 总去运动步数
     */
    @TableField("go_step_number")
    private Long goStepNumber;

    /**
     * 总去运动时间
     */
    @TableField("go_step_time")
    private Long goStepTime;

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
     * 打卡次数
     */
    @TableField("daily_attendance")
    private Long dailyAttendance;

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
