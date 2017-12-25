package com.yan.aspect;

import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by hp yan on 2017/11/1.
 *
 * @author hp yan
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. hp yan All Rights Received
 */

@Aspect
@Component
public class ControllerAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(ControllerAspect.class);

    @Pointcut(value = "execution(* com.yan.controller.*.*(..))")
    public void log() {
    }

    @Before("log()")
    public void doBefore() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        JSONObject logInfos = new JSONObject();

        String requestURI = request.getRequestURL().toString();
        Map<String, String[]> parameterMap = request.getParameterMap();

        logInfos.put("url", requestURI);
        logInfos.put("parameters", parameterMap);
        LOGGER.info(logInfos.toJSONString());
    }
}
