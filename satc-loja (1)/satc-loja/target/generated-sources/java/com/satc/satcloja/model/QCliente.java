package com.satc.satcloja.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCliente is a Querydsl query type for Cliente
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCliente extends EntityPathBase<Cliente> {

    private static final long serialVersionUID = 1030810626L;

    public static final QCliente cliente = new QCliente("cliente");

    public final QPessoa _super = new QPessoa(this);

    public final StringPath cpf = createString("cpf");

    //inherited
    public final StringPath email = _super.email;

    //inherited
    public final StringPath endereco = _super.endereco;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath nome = _super.nome;

    public final StringPath rg = createString("rg");

    //inherited
    public final StringPath telefone = _super.telefone;

    public QCliente(String variable) {
        super(Cliente.class, forVariable(variable));
    }

    public QCliente(Path<? extends Cliente> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCliente(PathMetadata metadata) {
        super(Cliente.class, metadata);
    }

}

