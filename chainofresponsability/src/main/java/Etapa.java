public abstract class Etapa {
    private Etapa proximaEtapa;
    private Pedido pedido;

    public Etapa getProximaEtapa() {
        return proximaEtapa;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public boolean finalizada;

    public void setProximaEtapa(Etapa proximaEtapa) {
        this.proximaEtapa = proximaEtapa;
    }

    public abstract String getDescricao();

    public String mover() {
        if(this.finalizada == true){
            if (proximaEtapa != null) {
                return proximaEtapa.mover();
            }
            else {
                return "Pedido entregue!";
            }
        } else{
            return this.getDescricao();
        }

    }
}