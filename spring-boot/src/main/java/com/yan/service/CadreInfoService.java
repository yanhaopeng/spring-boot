package com.yan.service;

import com.alibaba.fastjson.JSONObject;
import com.yan.domian.CadreInfo;

import java.util.Optional;

/**
 * Created by hp yan on 2017/11/1.
 *
 * @author hp yan
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. hp yan All Rights Received
 */
public interface CadreInfoService {

    /**
     * 获取干部个人概览信息
     *
     * @param id 干部唯一标识
     * @return JSON对象的个人信息概览
     */
    JSONObject getAll(String id);

    /**
     * 获取干部个人基本信息如姓名，年龄，民族等
     *
     * @param id 干部唯一标识
     * @return Optional包装的PersonalInfo对象
     */
    Optional<CadreInfo> getBaseInfo(String id);


    /**
     * 新增一个干部信息
     *
     * @param cadreInfo 干部唯一标识
     * @return bool
     */

    boolean insertCadre(CadreInfo cadreInfo);

}
