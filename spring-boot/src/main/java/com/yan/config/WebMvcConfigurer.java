package com.yan.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.nio.charset.Charset;
import java.util.List;

/**
 * Created by hp yan on 2017/11/1.
 *
 * @author hp yan
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. hp yan All Rights Received
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebMvcConfigurer.class);

    @Value("${spring.profiles.active}")
    private String env;

    /**
     * 使用fastJson作为JSON序列化和反序列化框架
     */

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter4 converter = new FastJsonHttpMessageConverter4();
        FastJsonConfig config = new FastJsonConfig();
        //保留空的字段
        config.setSerializerFeatures(SerializerFeature.WriteMapNullValue,
                //String null -> ""
                SerializerFeature.WriteNullStringAsEmpty,
                //Number null -> 0
                SerializerFeature.WriteNullNumberAsZero);
        converter.setFastJsonConfig(config);
        converter.setDefaultCharset(Charset.forName("UTF-8"));
        converters.add(converter);
    }

    //统一异常处理
//    @Override
//    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
//        exceptionResolvers.add((request, response, handler, ex) -> {
//            Result result = new Result();
//            if (ex instanceof BusinessException) {
//                result.setCode(ResultCode.FAIL).setMessage(((BusinessException) ex).getErrMsg());
//                LOGGER.info(((BusinessException) ex).getErrMsg());
//                return null;
//            }
//            responseResult(response, result);
//            return new ModelAndView();
//        });
//    }
//
//    private void responseResult(HttpServletResponse response, Result result) {
//        response.setCharacterEncoding("UTF-8");
//        response.setHeader("Content-type", "application/json;charset=UTF-8");
//        response.setStatus(200);
//        try {
//            response.getWriter().write(JSON.toJSONString(result));
//        } catch (IOException ex) {
//            LOGGER.error(ex.getMessage());
//        }
//    }
}
