package com.satc.satcloja.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QFornecedor is a Querydsl query type for Fornecedor
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFornecedor extends EntityPathBase<Fornecedor> {

    private static final long serialVersionUID = 70983261L;

    public static final QFornecedor fornecedor = new QFornecedor("fornecedor");

    public final QPessoa _super = new QPessoa(this);

    public final StringPath cnpj = createString("cnpj");

    //inherited
    public final StringPath email = _super.email;

    //inherited
    public final StringPath endereco = _super.endereco;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath incricaoEstadual = createString("incricaoEstadual");

    //inherited
    public final StringPath nome = _super.nome;

    //inherited
    public final StringPath telefone = _super.telefone;

    public QFornecedor(String variable) {
        super(Fornecedor.class, forVariable(variable));
    }

    public QFornecedor(Path<? extends Fornecedor> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFornecedor(PathMetadata metadata) {
        super(Fornecedor.class, metadata);
    }

}

