package com.soft1851.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft1851.demo.entity.SysCourse;
import com.soft1851.demo.mapper.SysCourseMapper;
import com.soft1851.demo.service.SysCourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zxl
 * @since 2020-06-08
 */
@Service
@Slf4j
public class SysCourseServiceImpl extends ServiceImpl<SysCourseMapper, SysCourse> implements SysCourseService {

    @Resource
    private SysCourseMapper sysCourseMapper;

    @Override
    public List<Map<String, Object>> getCourseByType() {
        QueryWrapper<SysCourse> wrapper = new QueryWrapper<>();
        wrapper.select("type").groupBy("type").orderByDesc("fat_burning");
        List<Map<String, Object>> maps = sysCourseMapper.selectMaps(wrapper);
        for (Map<String, Object> map : maps) {
                QueryWrapper<SysCourse> wrapper1 = new QueryWrapper<>();
                wrapper1.orderByDesc("fat_burning").eq("type", map.get("type"));
                List<Map<String, Object>> songLists = sysCourseMapper.selectMaps(wrapper1);
                map.put("child", songLists);
        }
        return maps;
    }

}
