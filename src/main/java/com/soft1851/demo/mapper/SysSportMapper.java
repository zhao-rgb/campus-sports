package com.soft1851.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft1851.demo.domain.entity.SysDailySport;
import com.soft1851.demo.domain.entity.SysSport;
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

}
