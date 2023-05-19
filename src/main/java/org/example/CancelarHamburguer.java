package org.example;

public class CancelarHamburguer implements Comando {
    private Lanchonete lanchonete;

    public CancelarHamburguer(Lanchonete lanchonete) {
        this.lanchonete = lanchonete;
    }

    public void executar() {
        lanchonete.cancelarPreparoHamburguer();
    }

    public void desfazer() {
        lanchonete.prepararHamburguer();
    }
}