package org.example;

public class Lanchonete {
    private String situacaoHamburguer;

    public Lanchonete() {
    }

    public void prepararHamburguer() {
        this.situacaoHamburguer = "Hambúrguer preparado";
    }

    public void cancelarPreparoHamburguer() {
        this.situacaoHamburguer = "Hambúrguer não preparado";
    }

    public String getSituacaoHamburguer() {
        return situacaoHamburguer;
    }
}