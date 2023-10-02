package com.satc.satcloja.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItemLocacao is a Querydsl query type for ItemLocacao
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItemLocacao extends EntityPathBase<ItemLocacao> {

    private static final long serialVersionUID = 30133893L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItemLocacao itemLocacao = new QItemLocacao("itemLocacao");

    public final QEntityId _super = new QEntityId(this);

    public final NumberPath<Double> desconto = createNumber("desconto", Double.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final QLocacao locacao;

    public final QProduto produto;

    public final NumberPath<Double> quantidade = createNumber("quantidade", Double.class);

    public final NumberPath<Double> valorUnitario = createNumber("valorUnitario", Double.class);

    public QItemLocacao(String variable) {
        this(ItemLocacao.class, forVariable(variable), INITS);
    }

    public QItemLocacao(Path<? extends ItemLocacao> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QItemLocacao(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QItemLocacao(PathMetadata metadata, PathInits inits) {
        this(ItemLocacao.class, metadata, inits);
    }

    public QItemLocacao(Class<? extends ItemLocacao> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.locacao = inits.isInitialized("locacao") ? new QLocacao(forProperty("locacao"), inits.get("locacao")) : null;
        this.produto = inits.isInitialized("produto") ? new QProduto(forProperty("produto")) : null;
    }

}

