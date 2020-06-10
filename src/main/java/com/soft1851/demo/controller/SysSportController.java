package com.soft1851.demo.controller;


import com.soft1851.demo.domain.entity.SysSport;
import com.soft1851.demo.service.SysSportService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/week")
    public List<SysSport> getStepNumber(@Param("userId") int userId) {
        return sysSportService.stepNumber(userId);
    }
}
