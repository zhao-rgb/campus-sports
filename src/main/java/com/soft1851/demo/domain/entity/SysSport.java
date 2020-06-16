package com.soft1851.demo.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

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
@TableName("sys_sport")
public class SysSport extends Model<SysSport> {

    private static final long serialVersionUID = 1L;

    /**
     * 流水id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 步数
     */
    @TableField("step_number")
    private Integer stepNumber;

    /**
     * 运动日期
     */
    @TableField(fill = FieldFill.INSERT)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date sportDate;

    /**
     * 运动的时间
     */
    @TableField("sport_time")
    private String sportTime;

    /**
     * 运动的距离
     */
    @TableField("sport_distance")
    private String sportDistance;

    /**
     * 运动平均速度
     */
    @TableField("sport_average_speed")
    private String sportAverageSpeed;

    /**
     * 运动轨迹
     */
    @TableField("sport_url")
    private String sportUrl;

    /**
     * 运动的模式
     */
    @TableField("sport_pattern")
    private String sportPattern;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime gmtCreate;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
