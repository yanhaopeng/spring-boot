package com.yan.controller;

import com.alibaba.fastjson.JSONObject;
import com.yan.common.Result;
import com.yan.common.ResultGenerator;
import com.yan.domian.CadreInfo;
import com.yan.service.CadreInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * Created by hp yan on 2017/11/1.
 *
 * @author hp yan
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. hp yan All Rights Received
 */
@RestController
@RequestMapping("/cadreInfo")
public class CadreController {

    private final CadreInfoService cadreInfoService;

    @Autowired
    public CadreController(CadreInfoService cadreInfoService) {
        this.cadreInfoService = cadreInfoService;
    }

    @RequestMapping(value = "all/{id}")
    public Result getAll(@PathVariable("id") String personId) {
        Objects.requireNonNull(personId);
        Result result = ResultGenerator.genSuccessResult();

        JSONObject personalInfo = cadreInfoService.getAll(personId);
        result.setData(personalInfo);

        return result;
    }

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping(value = "/redis/string", method = RequestMethod.GET)
    public void insertString() {
        stringRedisTemplate.opsForValue().set("stringKey", "stringValue");
    }


    @RequestMapping(value = "redis/get")
    public Result getRedis(){
        Result result =ResultGenerator.genSuccessResult();
        String str = stringRedisTemplate.opsForValue().get("stringKey");
        result.setData(str);
        return result;
    }


}
