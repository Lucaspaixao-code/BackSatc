package com.satc.satcloja.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPessoa is a Querydsl query type for Pessoa
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QPessoa extends EntityPathBase<Pessoa> {

    private static final long serialVersionUID = -1124743009L;

    public static final QPessoa pessoa = new QPessoa("pessoa");

    public final QEntityId _super = new QEntityId(this);

    public final StringPath email = createString("email");

    public final StringPath endereco = createString("endereco");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath nome = createString("nome");

    public final StringPath telefone = createString("telefone");

    public QPessoa(String variable) {
        super(Pessoa.class, forVariable(variable));
    }

    public QPessoa(Path<? extends Pessoa> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPessoa(PathMetadata metadata) {
        super(Pessoa.class, metadata);
    }

}

