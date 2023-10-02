package com.satc.satcloja.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QServico is a Querydsl query type for Servico
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QServico extends EntityPathBase<Servico> {

    private static final long serialVersionUID = -2140590905L;

    public static final QServico servico = new QServico("servico");

    public final QItemVendavel _super = new QItemVendavel(this);

    //inherited
    public final StringPath descricao = _super.descricao;

    //inherited
    public final BooleanPath estocavel = _super.estocavel;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final NumberPath<Double> quantidadeHoras = createNumber("quantidadeHoras", Double.class);

    //inherited
    public final NumberPath<Double> valorUnitario = _super.valorUnitario;

    public QServico(String variable) {
        super(Servico.class, forVariable(variable));
    }

    public QServico(Path<? extends Servico> path) {
        super(path.getType(), path.getMetadata());
    }

    public QServico(PathMetadata metadata) {
        super(Servico.class, metadata);
    }

}

