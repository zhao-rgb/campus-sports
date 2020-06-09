package com.soft1851.demo.exception;

import com.soft1851.demo.common.ResultCode;

/**
 * @author zhao
 * @className CustomException
 * @Description 用户自定义异常
 * @Date 2020/4/21
 * @Version 1.0
 **/
public class CustomException extends RuntimeException {
    protected ResultCode resultCode;

    public CustomException(String msg, ResultCode resultCode) {
        super(msg);
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }
}
