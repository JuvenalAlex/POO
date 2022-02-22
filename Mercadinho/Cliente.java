public abstract class Cliente {
    private String nome;
    private double valorDaCompra;

    public Cliente(double valorDaCompra, String nome){
        this.nome = nome;
        this.valorDaCompra = valorDaCompra;
    }

    public String getNome() {
        return nome;
    }

    public double getValorDaCompra() {
        return this.valorDaCompra;
    }

    public abstract double calcularPagamento();

    public String toString() {
        return "Cliente:" +
                "Nome:'" + nome + '\'' +
                ",Preço das mercadorias:" + valorDaCompra 
                ;
    }
}