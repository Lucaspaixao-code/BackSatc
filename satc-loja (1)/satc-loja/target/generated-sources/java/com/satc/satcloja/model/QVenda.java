package com.satc.satcloja.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QVenda is a Querydsl query type for Venda
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QVenda extends EntityPathBase<Venda> {

    private static final long serialVersionUID = 1770369124L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QVenda venda = new QVenda("venda");

    public final QEntityId _super = new QEntityId(this);

    public final QCliente cliente;

    public final DatePath<java.time.LocalDate> dataVenda = createDate("dataVenda", java.time.LocalDate.class);

    public final EnumPath<FormaPagamento> formaPagamento = createEnum("formaPagamento", FormaPagamento.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final ListPath<ItemVenda, QItemVenda> itens = this.<ItemVenda, QItemVenda>createList("itens", ItemVenda.class, QItemVenda.class, PathInits.DIRECT2);

    public final StringPath observacao = createString("observacao");

    public QVenda(String variable) {
        this(Venda.class, forVariable(variable), INITS);
    }

    public QVenda(Path<? extends Venda> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QVenda(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QVenda(PathMetadata metadata, PathInits inits) {
        this(Venda.class, metadata, inits);
    }

    public QVenda(Class<? extends Venda> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cliente = inits.isInitialized("cliente") ? new QCliente(forProperty("cliente")) : null;
    }

}

