package com.soft1851.demo.entity;

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
 * @since 2020-06-08
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
    @TableId("id")
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
     * 具体运动日期
     */
    @TableField("gmt_create")
    private LocalDateTime gmtCreate;

    /**
     * 运动的时间
     */
    @TableField("sport_time")
    private LocalDateTime sportTime;

    /**
     * 运动的距离
     */
    @TableField("sport_distance")
    private Long sportDistance;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
