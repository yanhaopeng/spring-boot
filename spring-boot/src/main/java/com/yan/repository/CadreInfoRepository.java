package com.yan.repository;

import com.yan.domian.CadreInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * Created by hp yan on 2017/11/1.
 *
 * @author hp yan
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. hp yan All Rights Received
 */
public interface CadreInfoRepository extends JpaRepository<CadreInfo, String>, QueryDslPredicateExecutor<CadreInfo> {
}
