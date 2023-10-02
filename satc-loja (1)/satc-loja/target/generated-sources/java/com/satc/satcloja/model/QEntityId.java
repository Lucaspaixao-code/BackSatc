package com.satc.satcloja.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QEntityId is a Querydsl query type for EntityId
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QEntityId extends EntityPathBase<EntityId> {

    private static final long serialVersionUID = -1120150698L;

    public static final QEntityId entityId = new QEntityId("entityId");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QEntityId(String variable) {
        super(EntityId.class, forVariable(variable));
    }

    public QEntityId(Path<? extends EntityId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEntityId(PathMetadata metadata) {
        super(EntityId.class, metadata);
    }

}

