package com.yan.common;

import com.alibaba.fastjson.JSON;

/**
 * Created by hp yan on 2017/11/1.
 *
 * @author hp yan
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. hp yan All Rights Received
 */
public class Result {
    /**
     * 响应码 {@link ResultCode}
     */
    private String code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应时间
     */
    private String time;

    /**
     * 响应内容
     */
    private Object data;


    public String getCode() {
        return code;
    }

    public Result setCode(ResultCode resultCode) {
        this.code = resultCode.code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getTime() {
        return time;
    }

    public Result setTime(String time) {
        this.time = time;
        return this;
    }

    public Object getData() {
        return data;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }
    
    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
