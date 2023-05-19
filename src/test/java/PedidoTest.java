import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PedidoTest {

    Pedido pedido;
    Lanchonete lanchonete;

    @BeforeEach
    void setUp() {
        pedido = new Pedido();
        lanchonete = new Lanchonete ();
    }

    @Test
    void devePreperarHamburguer() {
        Comando prepararPedido = new PrepararHamburguer(lanchonete);
        pedido.adicionarComando(prepararPedido);

        assertEquals("Hambúrguer preparado", lanchonete.getSituacaoHamburguer());
    }

    @Test
    void deveCancelarHamburguer() {
        Comando cancelarPedido = new CancelarHamburguer(lanchonete);
        pedido.adicionarComando(cancelarPedido);

        assertEquals("Hambúrguer não preparado",  lanchonete.getSituacaoHamburguer());
    }

    @Test
    void deveCancelarUltimoPedido() {
        Comando prepararPedido = new PrepararHamburguer(lanchonete);
        Comando cancelarPedido = new CancelarHamburguer(lanchonete);

        pedido.adicionarComando(prepararPedido);
        pedido.adicionarComando(cancelarPedido);

        pedido.cancelarUltimoPedido();

        assertEquals("Hambúrguer preparado", lanchonete.getSituacaoHamburguer());
    }

}