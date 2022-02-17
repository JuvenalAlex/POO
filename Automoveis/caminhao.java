public class caminhao extends automovel{
    private double cargasuportada, comprimento;
    
    public caminhao(int velocidade, String descricao, String placa, int ano, double cargasuportada, double valor, double comprimento) {
        super(velocidade, valor, descricao, placa, ano);
        this.cargasuportada = cargasuportada;
        this.comprimento = comprimento;
    }

    public double getCargasuportada() {
        return cargasuportada;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void acelerar() {
        acelerarCaminhaoOuOnibus(this.velocidade);
    }

    public void frear() {
        frearCaminhaoOuOnibus(this.velocidade);
    }

    public String toString() {
        return "Caminhão: " + "Velocidade: " + velocidade + ", Descrição: " + descricao + ", Ano: " + ano;
    }

}