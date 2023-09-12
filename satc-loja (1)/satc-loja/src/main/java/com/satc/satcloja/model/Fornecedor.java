package com.satc.satcloja.model;

import javax.persistence.*;

@Entity
public class Fornecedor extends Pessoa {
    @Column(name = "cnpj", nullable = false)
    private String cnpj;
    @Column(name = "incricao_estadual", nullable = false)
    private String incricaoEstadual;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIncricaoEstadual() {
        return incricaoEstadual;
    }

    public void setIncricaoEstadual(String incricaoEstadual) {
        this.incricaoEstadual = incricaoEstadual;
    }

    @Override
    public String getDocumentoPrincipal() {
        return this.getCnpj();
    }


}

