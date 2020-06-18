package com.soft1851.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft1851.demo.domain.entity.SysDailySport;
import com.soft1851.demo.domain.entity.SysSport;
import com.soft1851.demo.domain.vo.SysSportVo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zxl
 * @since 2020-06-10
 */
@Repository
public interface SysSportMapper extends BaseMapper<SysSport> {


    /**
     * 根据userId查用户运动的记录
     * @param userId
     * @return
     */
    List<SysSport> getSelectSport(Long userId);

    /**
     * 查找用户每天运动的步数等（求和）
     * @return
     */
    List<SysDailySport> selectSport();

    /**
     * 查找用户每天运动的步数等（求和）
     * @return
     */
    SysSportVo sumSport(Long userId);

    /**
     * 根据用户id查找今天运动的距离
     * @param userId
     * @return
     */
    @Select("SELECT * FROM sys_sport WHERE user_id = #{userId} AND TO_DAYS(gmt_create) = TO_DAYS(NOW())")
    List<SysSport> selectTodayTime(Long userId);
}
