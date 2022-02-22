public class Vip extends Cliente {
    private String numeroDoCartão;

    public Vip(double valorDaCompra, String nome, String numeroDoCartao){
        super(valorDaCompra, nome);
        this.numeroDoCartão = numeroDoCartao;

    }

    public String getNumeroDoCartão() {
        return numeroDoCartão;
    }

    public void setNumeroDoCartão(String numeroDoCartão) {
        this.numeroDoCartão = numeroDoCartão;
    }

    public double calcularPagamento(){
        double desconto = (this.getValorDaCompra() * 10) / 100;
        return this.getValorDaCompra() - desconto;
    }

    public String toString() {
        return "VIP:" +
                "NumeroDoCartão:'" + numeroDoCartão + '\'' 
                ;
    }
}