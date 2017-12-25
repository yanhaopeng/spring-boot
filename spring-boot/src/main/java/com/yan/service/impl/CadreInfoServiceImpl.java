package com.yan.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.yan.domian.CadreInfo;
import com.yan.repository.CadreInfoRepository;
import com.yan.service.CadreInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Created by hp yan on 2017/11/1.
 *
 * @author hp yan
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. hp yan All Rights Received
 */
@Service("CadreInfoService")
public class CadreInfoServiceImpl implements CadreInfoService {

    private final CadreInfoRepository cadreInfoRepository;

    @Autowired
    public CadreInfoServiceImpl(CadreInfoRepository cadreInfoRepository) {
        this.cadreInfoRepository = cadreInfoRepository;
    }

    @Override
    public JSONObject getAll(String id) {
        JSONObject personJsonObject = new JSONObject();

        Optional<CadreInfo> baseInfo = this.getBaseInfo(id);
        baseInfo.ifPresent(e -> personJsonObject.put("baseInfo", e));

        return personJsonObject;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Optional<CadreInfo> getBaseInfo(String id) {
        return Optional.ofNullable(cadreInfoRepository.findOne(id));
    }

    @Override
    public boolean insertCadre(CadreInfo cadreInfo) {

        cadreInfoRepository.save(cadreInfo);
        return true;
    }

}
