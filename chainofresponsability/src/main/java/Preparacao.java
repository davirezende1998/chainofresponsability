public class Preparacao extends Etapa{

    public Preparacao(Etapa proximaEtapa, Pedido pedido, boolean finalizada) {
        setProximaEtapa(proximaEtapa);
        setPedido(pedido);
        this.finalizada = finalizada;
    }

    public String getDescricao() {
        return "Pedido em preparação";
    }
}