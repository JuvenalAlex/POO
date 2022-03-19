public class Historico {
    private String tipoMovimento;
    private String data;
    private Double valor;
    private Integer conta;

    public Historico(String tipoMovimento, String data, Double valor, Integer conta) {
        this.tipoMovimento = tipoMovimento;
        this.data = data;
        this.valor = valor;
        this.conta = conta;
    }
    public Historico(String tipoMovimento, String data, Double valor) {
        this.tipoMovimento = tipoMovimento;
        this.data = data;
        this.valor = valor;
    }
    public String gettipoMovimento() {
        return tipoMovimento;
    }
    public String getData() {
        return data;
    }
    public Double getValor() {
        return valor;
    }
    public Integer getConta() {
        return conta;
    }
    public String toString() {
        return "Tipo do Movimento: " + tipoMovimento + "\nData: " + data +  "\nValor: R$" + valor +  "!";
    }
}
