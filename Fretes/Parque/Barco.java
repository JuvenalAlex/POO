public class Barco extends Brinquedo{

    public Barco(int velocidade, int aceleracao) {
        super(velocidade, aceleracao);
    }


    public void mover(){
        int velocidade = (getVelocidade() * 3) + 10;
        System.out.println("Barco:"+velocidade);
    }
}
