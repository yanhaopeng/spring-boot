package com.yan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by hp yan on 2017/11/1.
 *
 * @author hp yan
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. hp yan All Rights Received
 */
@SpringBootApplication
@EnableJpaRepositories
public class OpsDvpApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpsDvpApplication.class, args);
    }
}
