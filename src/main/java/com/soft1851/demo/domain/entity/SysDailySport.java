package com.soft1851.demo.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author zhao
 * @className SysDailySport
 * @Description TODO
 * @Date 2020/6/13
 * @Version 1.0
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_daily_sport")
public class SysDailySport extends Model<SysDailySport> {

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
     * 总步数
     */
    @TableField("total_sport_number")
    private Integer totalSportNumber;

    /**
     * 总时间
     */
    @TableField("total_sport_time")
    private String totalSportTime;

    /**
     * 总距离
     */
    @TableField("total_sport_distance")
    private String totalSportDistance;

    /**
     * 总平均速度
     */
    @TableField("total_sport_average_speed")
    private String totalSportAverageSpeed;

    /**
     * 运动的日期
     */
    @TableField("sport_date")
    private LocalDate sportDate;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

