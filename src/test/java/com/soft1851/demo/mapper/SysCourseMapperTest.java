package com.soft1851.demo.mapper;

import com.soft1851.demo.domain.entity.SysCourse;
import com.soft1851.demo.util.DataUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SysCourseMapperTest {

    @Resource
    private SysCourseMapper sysCourseMapper;

    @Test
    void testinsert() {
        List<SysCourse> sysCourses = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            SysCourse sysCourse = SysCourse.builder()
                    .courseName("平衡提升")
                    .avatar("http://static.ouj.com/hiyd_cms/0265b91b62714721a3df915b4de8c196.jpg")
                    .local("校内")
                    .type("瑜伽")
                    .lessonNumber((long) 3)
                    .time(DataUtil.getTime())
                    .fatBurning(DataUtil.getfat())
                    .difficulty("K4")
                    .teacherName("马来周杰伦")
                    .teacherDescription("深蹲是非常好的训练方式，可以刺激睾酮素分泌，促进全身各部位的发展。")
                    .url("http://static.ouj.com/hiyd_cms/49fef528a17b4bd89f280684a78a75a5.mp4")
                    .build();
            sysCourses.add(sysCourse);
            System.out.println(sysCourses);
        }
//        sysCourseMapper.batchInsert(sysCourses);
    }
}