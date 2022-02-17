public class onibus extends automovel{
    private double comprimento;
    private int capacidadepassageiro;

    public onibus(int velocidade, double valor, double comprimento, String descricao, String placa, int ano,
            int capacidadepassageiro) {
        super(velocidade, valor, descricao, placa, ano);
        this.comprimento = comprimento;
        this.capacidadepassageiro = capacidadepassageiro;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getCapacidadepassageiro() {
        return capacidadepassageiro;
    }

    public void setCapacidadepassageiro(int capacidadepassageiro) {
        this.capacidadepassageiro = capacidadepassageiro;
    }

    

    public void acelerar() {
        acelerarCaminhaoOuOnibus(this.velocidade);
    }

    public void frear() {
        frearCaminhaoOuOnibus(this.velocidade);
    }
    
    public String toString() {
        return "Onibus: " + "velocidade: " + velocidade + ", descricao: " + descricao + ", ano: " + ano ;
    }
}