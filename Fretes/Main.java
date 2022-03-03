public class Main {
    public static void main(String[] args){
        CadastroFrete cadastroFrete = new CadastroFrete();

        Frete PrimeiroFrete  = new FreteExpresso(2, 4, 35);
        Frete SegundoFrete = new FretePadrao(5, 15);
        Frete TerceiroFrete = new FreteSuperExpresso(8, 25, 3, 4);

        cadastroFrete.adicionarFrete(PrimeiroFrete);
        cadastroFrete.adicionarFrete(SegundoFrete);
        cadastroFrete.adicionarFrete(TerceiroFrete);

        cadastroFrete.valorTotalFretes();

        System.out.println("\nPodemos ver o polimorfismo acontecer nas mudanças \nfeitas nos métodos pela interface utilizando métodos diferenciados\npara o desempenho de diversas atividades.");

    }
}
