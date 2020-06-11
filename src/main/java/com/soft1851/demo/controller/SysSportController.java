package com.soft1851.demo.controller;


import com.soft1851.demo.common.ResponseResult;
import com.soft1851.demo.domain.entity.SysSport;
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
     * 返回一个星期内的步数
     * @param userId
     * @return
     */
    @GetMapping("/week")
    public List<SysSport> getStepNumber(@Param("userId") Long userId) {
        return sysSportService.stepNumber(userId);
    }

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
     * 本月统计步数
     * @param userId
     * @param stepNumber
     * @return
     */
    @GetMapping("/selectSport/stepNumber")
    public int getMonthStepNumber(@Param("userId") Long userId, @Param("stepNumber") int stepNumber){
        return sysSportService.monthStepNumber(userId,stepNumber);
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

}
