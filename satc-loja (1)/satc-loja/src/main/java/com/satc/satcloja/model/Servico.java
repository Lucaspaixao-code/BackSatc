package com.satc.satcloja.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue("servico")
public class Servico extends ItemVendavel {
    @Column(name = "qtde_horas", nullable = true)
    private Double quantidadeHoras;

    public Servico(String descricao, Double quantidadeHoras, Double valor) {
        super.setDescricao(descricao);
        this.quantidadeHoras = quantidadeHoras;
        super.setValorUnitario(valor);
    }

    public Double getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(Double quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    @Override
    public Boolean getEstocavel() {
        return false;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "descricao=" + super.getDescricao() + ", "+
                "quantidadeHoras=" + quantidadeHoras +
                '}';
    }
}




