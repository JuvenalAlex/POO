public abstract class automovel implements Veiculo{
    protected double valor;
    protected String descricao, placa;
    protected int ano, velocidade;
    
    public automovel(int velocidade, double valor , String descricao, String placa, int ano) {
        this.velocidade = velocidade;
        this.valor = valor;
        this.descricao = descricao;
        this.placa = placa;
        this.ano = ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public double getValor(){
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }
    
    protected void acelerarCarroOuMoto (int velocidade) {
        if (this. velocidade < 0){
            System.out.println("Velocidade mínima atingida");
        } else {
            this.velocidade += 10;
            System.out.println(this.velocidade);
    }
}

    protected void acelerarCaminhaoOuOnibus (int velocidade){
        if (this.velocidade < 0){
            System.out.println("Velocidade mínima atingida");
        } else {
            this.velocidade += 8;
            System.out.println(this.velocidade);
        }
    }

    protected void frearCarroOuMoto (int velocidade) {
        if (this.velocidade <= 0){
            System.out.println("O carro está parado");
        }  else {
            this.velocidade -= 10;
            System.out.println(this.velocidade);
        }
}

    protected void frearCaminhaoOuOnibus (int velocidade){
        if (this.velocidade <= 0){
            System.out.println("O carro está parado");
        } else {
            this.velocidade -= 8;
            System.out.println(this.velocidade);
        }
    }
}