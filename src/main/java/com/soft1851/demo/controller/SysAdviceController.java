package com.soft1851.demo.controller;

import com.soft1851.demo.common.ResponseResult;
import com.soft1851.demo.domain.entity.SysAdvice;
import com.soft1851.demo.service.SysAdviceService;
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
 * @since 2020-06-17
 */
@RestController
@RequestMapping("/sysAdvice")
public class SysAdviceController {

    @Resource
    private SysAdviceService sysAdviceService;

    @PostMapping("/adcive")
    public ResponseResult getAdvice(@RequestBody SysAdvice sysAdvice) {
        sysAdviceService.advice(sysAdvice);
        return ResponseResult.success();
    }

    /**
     * 根据用户id查用户过去发表的意见
     * @param userId
     * @return
     */
    @GetMapping("/adviceList")
    public List<SysAdvice> getAdviceList(@Param("userId") Long userId) {
        return sysAdviceService.adviceList(userId);
    }

}
