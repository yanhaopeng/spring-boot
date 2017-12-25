package com.yan.exception;

/**
 * Created by hp yan on 2017/11/1.
 *
 * @author hp yan
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. hp yan All Rights Received
 */
public interface OpsException {

    /**
     * 获取错误编码
     *
     * @return 错误编码
     */
    String getErrCode();

    /**
     * 获取错误详细信息
     *
     * @return 错误详细信息
     */
    String getErrDtlMsg();

    /**
     * 获取错误描述信息
     *
     * @return 错误描述信息
     */
    String getErrMsg();
}
