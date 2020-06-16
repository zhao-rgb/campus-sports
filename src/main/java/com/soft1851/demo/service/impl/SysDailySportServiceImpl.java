package com.soft1851.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft1851.demo.domain.dto.SysDailySportDto;
import com.soft1851.demo.domain.entity.SysDailySport;
import com.soft1851.demo.mapper.SysDailySportMapper;
import com.soft1851.demo.service.SysDailySportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zxl
 * @since 2020-06-13
 */
@Service
public class SysDailySportServiceImpl extends ServiceImpl<SysDailySportMapper, SysDailySport> implements SysDailySportService {
    @Resource
    private SysDailySportMapper sysDailySportMapper;

    @Override
    public int monthStepNumber(Long userId, int totalSportNumber) {
        return sysDailySportMapper.getMonthStepNumber(userId,totalSportNumber);
    }

    @Override
    public List<SysDailySport> stepNumber(Long userId) {
        return sysDailySportMapper.getStepNumber(userId);
    }

    @Override
    public List<SysDailySportDto> getNumSport(Long userId) {
        return sysDailySportMapper.numSport(userId);
    }
}
