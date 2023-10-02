package com.satc.satcloja.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItemCompra is a Querydsl query type for ItemCompra
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItemCompra extends EntityPathBase<ItemCompra> {

    private static final long serialVersionUID = 297811817L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItemCompra itemCompra = new QItemCompra("itemCompra");

    public final QEntityId _super = new QEntityId(this);

    public final QCompra compra;

    public final NumberPath<Double> desconto = createNumber("desconto", Double.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final QProduto produto;

    public final NumberPath<Double> quantidade = createNumber("quantidade", Double.class);

    public final NumberPath<Double> valorUnitario = createNumber("valorUnitario", Double.class);

    public QItemCompra(String variable) {
        this(ItemCompra.class, forVariable(variable), INITS);
    }

    public QItemCompra(Path<? extends ItemCompra> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QItemCompra(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QItemCompra(PathMetadata metadata, PathInits inits) {
        this(ItemCompra.class, metadata, inits);
    }

    public QItemCompra(Class<? extends ItemCompra> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.compra = inits.isInitialized("compra") ? new QCompra(forProperty("compra"), inits.get("compra")) : null;
        this.produto = inits.isInitialized("produto") ? new QProduto(forProperty("produto")) : null;
    }

}

