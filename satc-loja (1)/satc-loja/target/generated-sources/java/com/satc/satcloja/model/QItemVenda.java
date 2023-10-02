package com.satc.satcloja.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItemVenda is a Querydsl query type for ItemVenda
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItemVenda extends EntityPathBase<ItemVenda> {

    private static final long serialVersionUID = -1774258927L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItemVenda itemVenda = new QItemVenda("itemVenda");

    public final QEntityId _super = new QEntityId(this);

    public final NumberPath<Double> desconto = createNumber("desconto", Double.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final QItemVendavel produtoServico;

    public final NumberPath<Double> quantidade = createNumber("quantidade", Double.class);

    public final NumberPath<Double> valorUnitario = createNumber("valorUnitario", Double.class);

    public final QVenda venda;

    public QItemVenda(String variable) {
        this(ItemVenda.class, forVariable(variable), INITS);
    }

    public QItemVenda(Path<? extends ItemVenda> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QItemVenda(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QItemVenda(PathMetadata metadata, PathInits inits) {
        this(ItemVenda.class, metadata, inits);
    }

    public QItemVenda(Class<? extends ItemVenda> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.produtoServico = inits.isInitialized("produtoServico") ? new QItemVendavel(forProperty("produtoServico")) : null;
        this.venda = inits.isInitialized("venda") ? new QVenda(forProperty("venda"), inits.get("venda")) : null;
    }

}

