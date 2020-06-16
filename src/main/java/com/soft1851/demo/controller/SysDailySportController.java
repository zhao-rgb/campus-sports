package com.soft1851.demo.controller;

import com.soft1851.demo.domain.dto.SysDailySportDto;
import com.soft1851.demo.domain.entity.SysDailySport;
import com.soft1851.demo.service.SysDailySportService;
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
 * @since 2020-06-13
 */
@RestController
@RequestMapping("/sysDailySport")
public class SysDailySportController {
    @Resource
    private SysDailySportService sysDailySportService;

    /**
     * 本月统计步数
     * @param userId
     * @param totalSportNumber
     * @return
     */
    @GetMapping("/selectSport/stepNumber")
    public int getMonthStepNumber(@Param("userId") Long userId, @Param("totalSportNumber") int totalSportNumber){
        return sysDailySportService.monthStepNumber(userId,totalSportNumber);
    }

    /**
     * 返回一个星期内的步数
     * @param userId
     * @return
     */
    @GetMapping("/week")
    public List<SysDailySport> getStepNumber(@Param("userId") Long userId) {
        return sysDailySportService.stepNumber(userId);
    }

    /**
     * 统计本月全部步数和距离
     * @param userId
     * @return
     */
    @GetMapping("/numSport")
    public List<SysDailySportDto> getNumSport(@Param("userId") Long userId){
        return sysDailySportService.getNumSport(userId);
    }
}
