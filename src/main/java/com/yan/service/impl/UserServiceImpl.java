package com.yan.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.yan.domian.User;
import com.yan.repository.UserRepository;
import com.yan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("UserService")
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public JSONObject getOne(Integer id) {
        JSONObject userJsonObject = new JSONObject();

        Optional<User> baseInfo = this.getBaseInfo(id);
        baseInfo.ifPresent(e -> userJsonObject.put("baseInfo", e));

        return userJsonObject;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Optional<User> getBaseInfo(Integer id) {
        return Optional.ofNullable(userRepository.findOne(id));
    }

    @Override
    public JSONObject getAll(Integer pn) {
        JSONObject userJsonObject = new JSONObject();

        Pageable pageable = new PageRequest(pn, 100);
        Page<User> baseInfo =  userRepository.findAll(pageable);
        userJsonObject.put("baseInfo",baseInfo);
        return userJsonObject;
    }

    @Override
    public Optional<List> setRedis() {
        Optional<List> list = Optional.ofNullable(userRepository.findAll());
        return list;
    }

}
