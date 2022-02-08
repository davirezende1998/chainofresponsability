public class Entrega extends Etapa{
    public Entrega(Etapa proximaEtapa, Pedido pedido, boolean finalizada) {
        setProximaEtapa(proximaEtapa);
        setPedido(pedido);
        this.finalizada = finalizada;
    }

    public String getDescricao() {
        return "Pedido em entrega";
    }
}