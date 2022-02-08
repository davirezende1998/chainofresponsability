public class SelecionarPedido extends Etapa{

    public SelecionarPedido(Etapa proximaEtapa, Pedido pedido, boolean finalizada) {
        setProximaEtapa(proximaEtapa);
        setPedido(pedido);
        this.finalizada = finalizada;
    }

    public String getDescricao() {
        return "Pedido sendo selecionado";
    }

}