package com.satc.satcloja.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLocacao is a Querydsl query type for Locacao
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLocacao extends EntityPathBase<Locacao> {

    private static final long serialVersionUID = 508625176L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLocacao locacao = new QLocacao("locacao");

    public final QEntityId _super = new QEntityId(this);

    public final QCliente cliente;

    public final DatePath<java.time.LocalDate> dataDevolucao = createDate("dataDevolucao", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> dataLocacao = createDate("dataLocacao", java.time.LocalDate.class);

    public final StringPath endereco = createString("endereco");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final ListPath<ItemLocacao, QItemLocacao> itens = this.<ItemLocacao, QItemLocacao>createList("itens", ItemLocacao.class, QItemLocacao.class, PathInits.DIRECT2);

    public final StringPath observacao = createString("observacao");

    public QLocacao(String variable) {
        this(Locacao.class, forVariable(variable), INITS);
    }

    public QLocacao(Path<? extends Locacao> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLocacao(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLocacao(PathMetadata metadata, PathInits inits) {
        this(Locacao.class, metadata, inits);
    }

    public QLocacao(Class<? extends Locacao> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cliente = inits.isInitialized("cliente") ? new QCliente(forProperty("cliente")) : null;
    }

}

