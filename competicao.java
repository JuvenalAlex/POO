public class competicao {
    private Veiculo[] veiculos;
    private int indice;

    public competicao(int tamanho) {
        veiculos = new Veiculo[tamanho];
        indice = 0;
    }

    public void adicionarVeiculos(Veiculo a) {
        if (indice < veiculos.length) {
            veiculos[indice] = a;
            indice++;
        }
    }

    public void listarTodos() {
        System.out.println("\nTodos os Veículos:");
        for (int cont = 0; cont < veiculos.length; cont++) {
            System.out.println(veiculos[cont].toString());
        }
    }

    public void acelerarTodos() {
        System.out.println("\nAcelerando todos os Veículos:");
        for (int i = 0; i < veiculos.length; i++) {
            veiculos[i].acelerar();
        }
    }

    public void frearTodos() {
        System.out.println("\nFreando todos os Veículos:");
        for (int i = 0; i < veiculos.length; i++) {
            veiculos[i].frear();
        }
    }
}