public class Principal {
    public static void main(String[] args){
        CadastroBrinquedo brinquedos = new CadastroBrinquedo(3);

        Carro carro1 = new Carro(10, 50);
        Barco barco1 = new Barco(20,60);
        Aviao aviao1 = new Aviao(60,79);

        brinquedos.adicionarBrinquedos(carro1);
        brinquedos.adicionarBrinquedos(barco1);
        brinquedos.adicionarBrinquedos(aviao1);

        brinquedos.todoMundoSeMovendo();
        System.out.println("\nPodemos ver o polimorfismo acontecer nas mudanças \nfeitas nos métodos pela " +
                "interface utilizando métodos diferenciados\n" +
                "para o desempenho de diversas atividades.");
    }
}
