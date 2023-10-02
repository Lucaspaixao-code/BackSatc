package com.satc.satcloja.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCompra is a Querydsl query type for Compra
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCompra extends EntityPathBase<Compra> {

    private static final long serialVersionUID = -1487868298L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCompra compra = new QCompra("compra");

    public final QEntityId _super = new QEntityId(this);

    public final DatePath<java.time.LocalDate> dataCompra = createDate("dataCompra", java.time.LocalDate.class);

    public final QFornecedor fornecedor;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final ListPath<ItemCompra, QItemCompra> itens = this.<ItemCompra, QItemCompra>createList("itens", ItemCompra.class, QItemCompra.class, PathInits.DIRECT2);

    public final StringPath observacao = createString("observacao");

    public QCompra(String variable) {
        this(Compra.class, forVariable(variable), INITS);
    }

    public QCompra(Path<? extends Compra> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCompra(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCompra(PathMetadata metadata, PathInits inits) {
        this(Compra.class, metadata, inits);
    }

    public QCompra(Class<? extends Compra> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.fornecedor = inits.isInitialized("fornecedor") ? new QFornecedor(forProperty("fornecedor")) : null;
    }

}

