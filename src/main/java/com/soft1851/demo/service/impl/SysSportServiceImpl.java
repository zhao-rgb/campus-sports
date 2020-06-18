package com.soft1851.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft1851.demo.domain.entity.SysSport;
import com.soft1851.demo.domain.vo.SysSportVo;
import com.soft1851.demo.mapper.SysSportMapper;
import com.soft1851.demo.service.SysSportService;
import com.soft1851.demo.util.TimeDemo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zxl
 * @since 2020-06-10
 */
@Service
public class SysSportServiceImpl extends ServiceImpl<SysSportMapper, SysSport> implements SysSportService {

    @Resource
    private SysSportMapper sysSportMapper;


    @Override
    public List<SysSport> getSysSportByUserId(Long userId) {
        return sysSportMapper.getSelectSport(userId);
    }

    @Override
    public SysSportVo getSumSport(Long userId) {
        SysSportVo sysSportVos = sysSportMapper.sumSport(userId);
        List<SysSport> sysSports = sysSportMapper.selectTodayTime(userId);
        String[] timeList = new String[sysSports.size()];
        for (int i = 0; i < sysSports.size(); i++) {
            timeList[i] = sysSports.get(i).getSportTime();
        }
        sysSportVos.setTotalSportTime(TimeDemo.getTotal(timeList));
        return sysSportVos;
    }


}
