package com.satc.satcloja.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QItemVendavel is a Querydsl query type for ItemVendavel
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItemVendavel extends EntityPathBase<ItemVendavel> {

    private static final long serialVersionUID = 1214934252L;

    public static final QItemVendavel itemVendavel = new QItemVendavel("itemVendavel");

    public final QEntityId _super = new QEntityId(this);

    public final StringPath descricao = createString("descricao");

    public final BooleanPath estocavel = createBoolean("estocavel");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final NumberPath<Double> valorUnitario = createNumber("valorUnitario", Double.class);

    public QItemVendavel(String variable) {
        super(ItemVendavel.class, forVariable(variable));
    }

    public QItemVendavel(Path<? extends ItemVendavel> path) {
        super(path.getType(), path.getMetadata());
    }

    public QItemVendavel(PathMetadata metadata) {
        super(ItemVendavel.class, metadata);
    }

}

