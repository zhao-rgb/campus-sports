package com.soft1851.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft1851.demo.domain.entity.SysAdvice;
import com.soft1851.demo.mapper.SysAdviceMapper;
import com.soft1851.demo.service.SysAdviceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zxl
 * @since 2020-06-17
 */
@Service
public class SysAdviceServiceImpl extends ServiceImpl<SysAdviceMapper, SysAdvice> implements SysAdviceService {

    @Resource
    private SysAdviceMapper sysAdviceMapper;

    @Override
    public boolean advice(SysAdvice sysAdvice) {
        sysAdviceMapper.insert(sysAdvice);
        return true;
    }

    @Override
    public List<SysAdvice> adviceList(Long userId) {
        return sysAdviceMapper.getSysAdviceList(userId);
    }

}
