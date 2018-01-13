package com.yan.domian;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 737413584L;

    public static final QUser user = new QUser("user");

    public final NumberPath<Integer> agent = createNumber("agent", Integer.class);

    public final StringPath agentPass = createString("agentPass");

    public final NumberPath<Integer> certStatus = createNumber("certStatus", Integer.class);

    public final DateTimePath<java.sql.Timestamp> createTime = createDateTime("createTime", java.sql.Timestamp.class);

    public final NumberPath<Double> credit = createNumber("credit", Double.class);

    public final StringPath email = createString("email");

    public final StringPath gid = createString("gid");

    public final StringPath headPhoto = createString("headPhoto");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> isFalse = createNumber("isFalse", Integer.class);

    public final StringPath loginIp = createString("loginIp");

    public final DateTimePath<java.sql.Timestamp> loginTime = createDateTime("loginTime", java.sql.Timestamp.class);

    public final StringPath mobile = createString("mobile");

    public final StringPath password = createString("password");

    public final StringPath paySecret = createString("paySecret");

    public final NumberPath<Integer> pid = createNumber("pid", Integer.class);

    public final NumberPath<Integer> roles = createNumber("roles", Integer.class);

    public final StringPath sessionId = createString("sessionId");

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final StringPath trueName = createString("trueName");

    public final NumberPath<Integer> type = createNumber("type", Integer.class);

    public final StringPath username = createString("username");

    public final StringPath userNo = createString("userNo");

    public final NumberPath<Integer> vip = createNumber("vip", Integer.class);

    public final NumberPath<Integer> yewu = createNumber("yewu", Integer.class);

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

