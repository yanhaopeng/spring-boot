package com.yan.domian;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCadreInfo is a Querydsl query type for CadreInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCadreInfo extends EntityPathBase<CadreInfo> {

    private static final long serialVersionUID = 21005794L;

    public static final QCadreInfo cadreInfo = new QCadreInfo("cadreInfo");

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final DateTimePath<java.util.Date> birthday = createDateTime("birthday", java.util.Date.class);

    public final StringPath birthPlace = createString("birthPlace");

    public final StringPath domicilePlace = createString("domicilePlace");

    public final StringPath duty = createString("duty");

    public final StringPath gender = createString("gender");

    public final StringPath grassrootsWork = createString("grassrootsWork");

    public final StringPath grassrootsWorkDepartment = createString("grassrootsWorkDepartment");

    public final NumberPath<Integer> grassrootsWorkTime = createNumber("grassrootsWorkTime", Integer.class);

    public final StringPath growthPlace = createString("growthPlace");

    public final StringPath health = createString("health");

    public final StringPath hobby = createString("hobby");

    public final StringPath id = createString("id");

    public final StringPath identityNumber = createString("identityNumber");

    public final StringPath leadershipDivision = createString("leadershipDivision");

    public final StringPath leadershipId = createString("leadershipId");

    public final StringPath leadershipLevel = createString("leadershipLevel");

    public final StringPath leadershipName = createString("leadershipName");

    public final StringPath maritalStatus = createString("maritalStatus");

    public final StringPath name = createString("name");

    public final StringPath nation = createString("nation");

    public final StringPath nativePlace = createString("nativePlace");

    public final StringPath personManageCategory = createString("personManageCategory");

    public final StringPath personStatus = createString("personStatus");

    public final BooleanPath personType = createBoolean("personType");

    public final BooleanPath retire = createBoolean("retire");

    public final StringPath specialIdentification = createString("specialIdentification");

    public final StringPath specialty = createString("specialty");

    public final DateTimePath<java.util.Date> workDate = createDateTime("workDate", java.util.Date.class);

    public QCadreInfo(String variable) {
        super(CadreInfo.class, forVariable(variable));
    }

    public QCadreInfo(Path<? extends CadreInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCadreInfo(PathMetadata metadata) {
        super(CadreInfo.class, metadata);
    }

}

