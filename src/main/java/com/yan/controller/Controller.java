package com.yan.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hp yan on 2017/11/1.
 *
 * @author hp yan
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. hp yan All Rights Received
 */
@RestController
@RequestMapping("/cadre")
public class Controller {
    @RequestMapping("/hello")
    public String hello(){
        return "";
    }
}
