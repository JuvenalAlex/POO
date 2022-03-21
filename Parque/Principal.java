public class Principal {
    public static void main(String[] args){
        CadastroBrinquedo brinquedos = new CadastroBrinquedo(6);

        Carro carro1 = new Carro(10, 46);
        Barco barco1 = new Barco(20,15);
        Aviao aviao1 = new Aviao(60,99);
        Aviao aviao2 = new Aviao(90,50);
        Barco barco2 = new Barco(40,70);
        Carro carro2 = new Carro(55, 60);

        brinquedos.adicionarBrinquedos(carro1);
        brinquedos.adicionarBrinquedos(barco1);
        brinquedos.adicionarBrinquedos(aviao1);

        brinquedos.adicionarBrinquedos(carro2);
        brinquedos.adicionarBrinquedos(barco2);
        brinquedos.adicionarBrinquedos(aviao2);

        brinquedos.todoMundoSeMovendo();
        System.out.println("\nPodemos ver o polimorfismo acontecer nas mudanças \nfeitas nos métodos pela " +
                "interface utilizando métodos diferenciados\n" +
                "para o desempenho de diversas atividades.");
    }
}
