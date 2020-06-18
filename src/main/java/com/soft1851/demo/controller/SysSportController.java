package com.soft1851.demo.controller;


import com.soft1851.demo.common.ResponseResult;
import com.soft1851.demo.domain.entity.SysSport;
import com.soft1851.demo.domain.vo.SysSportVo;
import com.soft1851.demo.service.SysSportService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zxl
 * @since 2020-06-10
 */
@RestController
@RequestMapping("/sysSport")
public class SysSportController {

    @Resource
    private SysSportService sysSportService;


    /**
     * 查用户运动的记录
     * @param userId
     * @return
     */
    @GetMapping("/selectSport")
    public List<SysSport> findSysSportByUserId(@Param("userId") Long userId){
        return sysSportService.getSysSportByUserId(userId);
    }


    /**
     * 插入运动的记录
     * @param sysSport
     * @return
     */
    @PostMapping("/insertSport")
    public ResponseResult addRole(@RequestBody SysSport sysSport) {
        sysSportService.save(sysSport);
        return ResponseResult.success();
    }

    /**
     * 查找用户每天运动的步数等（求和）
     * @param userId
     * @return
     */
    @GetMapping("/sumSport")
    public SysSportVo getSumSport(@Param("userId") Long userId){
        return sysSportService.getSumSport(userId);
    }

}
