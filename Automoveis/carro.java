public class carro extends automovel {
    private int potencia, qtdeportas;

    public carro(int velocidade, double valor, String descricao, String placa, int ano, int potencia, int qtdeportas) {
        super(velocidade, valor, descricao, placa, ano);
        this.potencia = potencia;
        this.qtdeportas = qtdeportas;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getQtdeportas() {
        return qtdeportas;
    }

    public void acelerar() {
        acelerarCarroOuMoto(this.velocidade);
    }

    public void frear() {
        frearCarroOuMoto(this.velocidade);
    }

    public String toString() {
        return "Carro: " + "Velocidade: " + velocidade + ", Descrição: " + descricao + ", Ano: " + ano;
    }
}