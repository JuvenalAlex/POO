public class Aviao extends Brinquedo {

    public Aviao(int velocidade, int aceleracao) {
        super(velocidade, aceleracao);
    }


    public void mover() {
        int velocidade = (getVelocidade() * 100) + 50;
        System.out.println("Avião:"+ velocidade);
    }
}
