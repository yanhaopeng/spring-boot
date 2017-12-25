package com.yan.exception;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Properties;


/**
 * Created by hp yan on 2017/11/1.
 *
 * @author hp yan
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. hp yan All Rights Received
 */
public class ExceptionConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionConfig.class);

    public static String mm(String moduleName, String errCode, String... args) {
        return mm(moduleName, true, errCode, args);
    }

    /**
     * 格式化异常信息
     *
     * @param moduleName 异常模块名称
     * @param isCache    是否缓存异常信息
     * @param errCode    异常编码
     * @param args       异常信息参数
     * @return 格式化替换后的异常信息描述
     */
    public static String mm(String moduleName, boolean isCache, String errCode, String... args) {
        String message = null;
        final String ERROR_MESSAGE_PROPERTIES = "message.properties";
        Properties properties = null;
        if (moduleName != null) {
            try {
                String propertiesFileName = moduleName + "-" + ERROR_MESSAGE_PROPERTIES;
                properties = PropertiesLoaderUtils.loadAllProperties(propertiesFileName);
            } catch (IOException e) {
                LOGGER.error("文件[{}]读取出现异常！", moduleName + "-" + ERROR_MESSAGE_PROPERTIES, e);
            }
        } else {
            String defaultPropFileName = "ops-" + ERROR_MESSAGE_PROPERTIES;
            try {
                properties = PropertiesLoaderUtils.loadAllProperties(defaultPropFileName);
            } catch (IOException e) {
                LOGGER.error("文件[{}]读取出现异常！", "ops-" + ERROR_MESSAGE_PROPERTIES, e);
            }
        }
        if (properties != null) {
            message = properties.getProperty(errCode);
        }
        if (message == null || StringUtils.isEmpty(message)) {
            if (StringUtils.isNotEmpty(moduleName)) {
                LOGGER.error("请检查[{}]配置文件是否存在！配置项[{}]是否存在！", moduleName + "-" + ERROR_MESSAGE_PROPERTIES, errCode);
            } else {
                LOGGER.error("请检查[{}]配置文件是否存在！配置项[{}]是否存在！", "ops-message.properties", errCode);
            }
        }
        if (message != null && args != null) {
            message = MessageFormat.format(message, (Object[]) args);
        }
        return message;
    }
}
