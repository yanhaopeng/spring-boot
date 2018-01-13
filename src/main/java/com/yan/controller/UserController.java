package com.yan.controller;

import com.alibaba.fastjson.JSONObject;
import com.yan.aspect.ControllerAspect;
import com.yan.common.Result;
import com.yan.common.ResultGenerator;
import com.yan.domian.User;
import com.yan.repository.UserRepository;
import com.yan.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
/**
 * Created by hp yan on 2017/11/1.
 *
 * @author hp yan
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. hp yan All Rights Received
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    private final UserService userService;

    private static final Logger LOGGER = LoggerFactory.getLogger(ControllerAspect.class);

    //private final UserRepository userRepository;



    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
        //this.userRepository=userRepository;
    }
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping(value = "one/{id}")
    public Result getOne(@PathVariable("id") Integer id) {
        Objects.requireNonNull(id);
        Result result = ResultGenerator.genSuccessResult();

        JSONObject user = userService.getOne(id);
        result.setData(user);

        return result;
    }
    @RequestMapping(value = "all")
    public Result getAll(@RequestParam(value="pn", defaultValue="1") Integer pn) throws InterruptedException {
        Result result = ResultGenerator.genSuccessResult();

        JSONObject user = userService.getAll(pn);
        LOGGER.info(pn.toString());
        LOGGER.info(user.toString());

        //result.setData(user);

        //ValueOperations<String, JSONObject> operations=redisTemplate.opsForValue();
        //JSONObject users =operations.get("users");

        result.setData(user);
        return result;
    }

//    public Page<User> findAllwitPage() {
//        Pageable pageable = new PageRequest(1, 20);
//        // 通常使用Specification 的匿名内部类，
//        Specification<User> specification = new Specification<User>() {
//            /*
//             * @param root:代表的查询的实体类
//             *
//             * @param query：可以从中得到Root对象，即告知JPA Criteria查询要查询哪一个实体类，
//             * 还可以来添加查询条件，还可以结合EntityManager对象得到最终查询的TypedQuery 对象
//             *
//             * @Param
//             * cb:criteriabuildre对象，用于创建Criteria相关的对象工程，当然可以从中获取到predicate类型
//             *
//             * @return:代表一个查询条件
//             */
//            @Override
//            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//                // Predicate p1 = cb.like(root.get("id").as(String.class), "%" +
//                // "1" + "%");
//                Predicate p2 = cb.like(root.get("name").as(String.class), "%" + "howell" + "%");
//                // Predicate p3 = cb.like(root.get("email").as(String.class),
//                // "%s%");
//                // 构建组合的Predicate示例：
//                Predicate p = cb.and(p2);
//                return p;
//            }
//        };
//        return userRepository.findAll( specification, pageable);
//    }

    @RequestMapping(value = "setredis")
    public Result setRedis() throws InterruptedException {
        Result result = ResultGenerator.genSuccessResult();


        Optional<List> users = userService.setRedis();
        //result.setData(users);
        RedisTemplate<String, Object> redis = new RedisTemplate<String, Object>();
        //redis.setConnectionFactory(connectionFactory);
        //redis.setKeySerializer(ApplicationConfig.StringSerializer.INSTANCE);
        redis.setValueSerializer(new Jackson2JsonRedisSerializer<User>(User.class));
        redis.afterPropertiesSet();

        ValueOperations<String, Object> operations=redisTemplate.opsForValue();
        operations.set("users", users);
        //operations.set("com.users", users,1, TimeUnit.SECONDS);
        Thread.sleep(1000);
        //redisTemplate.delete("com.neo.f");
        boolean exists=redisTemplate.hasKey("users");
        if(exists){
            result.setMessage("所有数据已经缓存至redis");
            result.setData("ok");
        }else{
            result.setMessage("缓存失败");
            result.setData("no");
        }
        return result;
    }


}
