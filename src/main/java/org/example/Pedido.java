package org.example;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Comando> comandos = new ArrayList<>();

    public void adicionarComando(Comando comando) {
        this.comandos.add(comando);
        comando.executar();
    }


    public void cancelarUltimoPedido() {
        if (!comandos.isEmpty()) {
            Comando ultimoComando = comandos.remove(comandos.size() - 1);
            ultimoComando.desfazer();
        }
    }
}