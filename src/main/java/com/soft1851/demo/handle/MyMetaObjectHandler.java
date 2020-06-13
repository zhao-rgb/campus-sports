package com.soft1851.demo.handle;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author zhao
 * @className MyMetaObjectHandler
 * @Description 时间自动处理
 * @Date 2020/6/12
 * @Version 1.0
 **/
@Component
@Slf4j
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert field....");
        Date date = new Date();
        long time = date.getTime();
        this.setFieldValByName("sportDate", new java.sql.Date(time),metaObject);
        this.setFieldValByName("gmtCreate", LocalDateTime.now(),metaObject);
        this.setFieldValByName("gmtModified", LocalDateTime.now(),metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("gmtModified", LocalDateTime.now(),metaObject);
    }
}
