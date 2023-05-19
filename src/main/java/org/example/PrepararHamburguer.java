package org.example;

public class PrepararHamburguer implements Comando {
    private Lanchonete lanchonete;

    public PrepararHamburguer(Lanchonete lanchonete) {
        this.lanchonete = lanchonete;
    }

    public void executar() {
        lanchonete.prepararHamburguer();
    }

    public void desfazer() {
        lanchonete.cancelarPreparoHamburguer();
    }
}