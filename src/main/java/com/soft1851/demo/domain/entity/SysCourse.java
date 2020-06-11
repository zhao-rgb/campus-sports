package com.soft1851.demo.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

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
@TableName("sys_course")
@Builder
public class SysCourse extends Model<SysCourse> {

    private static final long serialVersionUID = 1L;

    /**
     * 流水id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 课程名字
     */
    @TableField("course_name")
    private String courseName;

    /**
     * 头像
     */
    @TableField("avatar")
    private String avatar;

    /**
     * 地方
     */
    @TableField("local")
    private String local;

    /**
     * 哪种类型
     */
    @TableField("type")
    private String type;

    /**
     * 节数
     */
    @TableField("lesson_number")
    private Long lessonNumber;

    /**
     * 上课的时间
     */
    @TableField("time")
    private String time;

    /**
     * 燃脂
     */
    @TableField("fat_burning")
    private String fatBurning;

    /**
     * 难度
     */
    @TableField("difficulty")
    private String difficulty;

    /**
     * 上课老师
     */
    @TableField("teacher_name")
    private String teacherName;

    /**
     * 上课老师简介
     */
    @TableField("teacher_description")
    private String teacherDescription;

    /**
     * 视频的url
     */
    @TableField("url")
    private String url;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
