import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {
    @Test
    void deveRetornarPedidoEmSelecao() {
        Pedido pedido = new Pedido(10, "Hamburguer");
        Entrega entrega = new Entrega(null, pedido, true);
        Preparacao preparacao = new Preparacao(entrega, pedido, true);
        Pagamento pagamento = new Pagamento(preparacao, pedido, true);
        SelecionarPedido selecionarPedido = new SelecionarPedido(pagamento, pedido, false);
        assertEquals("Pedido sendo selecionado", selecionarPedido.mover());
    }

    @Test
    void deveRetornarPedidoEmPagamento() {
        Pedido pedido = new Pedido(10, "Hamburguer");
        Entrega entrega = new Entrega(null, pedido, true);
        Preparacao preparacao = new Preparacao(entrega, pedido, true);
        Pagamento pagamento = new Pagamento(preparacao, pedido, false);
        SelecionarPedido selecionarPedido = new SelecionarPedido(pagamento, pedido, true);
        assertEquals("Pedido em pagamento", selecionarPedido.mover());
    }

    @Test
    void deveRetornarPedidoEmPreparacao() {
        Pedido pedido = new Pedido(10, "Hamburguer");
        Entrega entrega = new Entrega(null, pedido, true);
        Preparacao preparacao = new Preparacao(entrega, pedido, false);
        Pagamento pagamento = new Pagamento(preparacao, pedido, true);
        SelecionarPedido selecionarPedido = new SelecionarPedido(pagamento, pedido, true);
        assertEquals("Pedido em preparação", selecionarPedido.mover());
    }

    @Test
    void deveRetornarPedidoEmEntrega() {
        Pedido pedido = new Pedido(10, "Hamburguer");
        Entrega entrega = new Entrega(null, pedido, false);
        Preparacao preparacao = new Preparacao(entrega, pedido, true);
        Pagamento pagamento = new Pagamento(preparacao, pedido, true);
        SelecionarPedido selecionarPedido = new SelecionarPedido(pagamento, pedido, true);
        assertEquals("Pedido em entrega", selecionarPedido.mover());
    }

    @Test
    void deveRetornarPedidoEntregue() {
        Pedido pedido = new Pedido(10, "Hamburguer");
        Entrega entrega = new Entrega(null, pedido, true);
        Preparacao preparacao = new Preparacao(entrega, pedido, true);
        Pagamento pagamento = new Pagamento(preparacao, pedido, true);
        SelecionarPedido selecionarPedido = new SelecionarPedido(pagamento, pedido, true);
        assertEquals("Pedido entregue!", selecionarPedido.mover());
    }
}