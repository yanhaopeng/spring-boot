package com.yan.service;

import com.alibaba.fastjson.JSONObject;
import com.yan.domian.User;

import java.util.List;
import java.util.Optional;


public interface UserService {
    /**
     * 获取个人信息
     *
     * @param id 唯一标识
     * @return JSON对象的个人信息概览
     */
    JSONObject getOne(Integer id);

    /**
     * 获取个人基本信息如姓名，年龄，民族等
     *
     * @param id 唯一标识
     * @return Optional包装的PersonalInfo对象
     */
    Optional<User> getBaseInfo(Integer id);

    JSONObject getAll(Integer pn);

    Optional<List> setRedis();



}
