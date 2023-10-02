package com.satc.satcloja.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QProduto is a Querydsl query type for Produto
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProduto extends EntityPathBase<Produto> {

    private static final long serialVersionUID = -139250431L;

    public static final QProduto produto = new QProduto("produto");

    public final QItemVendavel _super = new QItemVendavel(this);

    public final DatePath<java.time.LocalDate> dataPrazo = createDate("dataPrazo", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> dataValidade = createDate("dataValidade", java.time.LocalDate.class);

    //inherited
    public final StringPath descricao = _super.descricao;

    //inherited
    public final BooleanPath estocavel = _super.estocavel;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath nome = createString("nome");

    public final NumberPath<Double> precoCompra = createNumber("precoCompra", Double.class);

    public final EnumPath<Status> status = createEnum("status", Status.class);

    //inherited
    public final NumberPath<Double> valorUnitario = _super.valorUnitario;

    public QProduto(String variable) {
        super(Produto.class, forVariable(variable));
    }

    public QProduto(Path<? extends Produto> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProduto(PathMetadata metadata) {
        super(Produto.class, metadata);
    }

}

