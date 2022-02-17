public class moto extends automovel {
    private int potencia;

    public moto(int velocidade, double valor, String descricao, String placa, int ano, int potencia) {
        super(velocidade, valor, descricao, placa, ano);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void acelerar() {
        acelerarCarroOuMoto(this.velocidade);
    }

    public void frear() {
        frearCarroOuMoto(this.velocidade);
    }

    public String toString() {
        return "Moto: " + "Velocidade: " + velocidade + ", Descrição: " + descricao + ", Ano: " + ano;
    }
}