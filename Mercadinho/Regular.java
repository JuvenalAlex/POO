public class Regular extends Cliente {

    public Regular(double valorDaCompra, String nome){
        super(valorDaCompra, nome);
    }

    public double calcularPagamento(){
        return this.getValorDaCompra();
    }

}