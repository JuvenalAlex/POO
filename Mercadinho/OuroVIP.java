public class OuroVIP extends Cliente {
    private String endereço;

    public OuroVIP(double valorDaCompra, String nome, String endereço){
        super(valorDaCompra, nome);
        this.endereço = endereço;
    }

    public String getEndereço() {
        return endereço;
    }

    public double calcularPagamento(){
        double desconto = (this.getValorDaCompra() * 15) / 100;
        return this.getValorDaCompra() - desconto;
    }

    public String toString() {
        return "OuroVip:" +
                "Endereço:'" + endereço + '\'' 
                ;
    }
}