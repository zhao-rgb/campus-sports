package com.soft1851.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft1851.demo.domain.entity.SysSport;
import com.soft1851.demo.mapper.SysSportMapper;
import com.soft1851.demo.service.SysSportService;
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


}
