public class Main {
    public static void main(String[] args) {
        CadastroMilitar cadastro = new CadastroMilitar();

        Militar milt1 = new MilitarAeronautica(9495764, "Cabo", 10, 700);
        Militar milt2 = new MilitarAeronautica(7945767, "Tenente", 2, 105);
        Militar milt3 = new MilitarMarinha(747589, "Soldado", true);
        Militar milt4 = new MilitarMarinha(4997576, "Soldado", false);
        Militar milt5 = new MilitarExercito(7475798, "Cabo", true, false);
        Militar milt6 = new MilitarExercito(6594854, "Tenente", true, true);


        cadastro.adicionarMilitares(milt1);
        cadastro.adicionarMilitares(milt2);
        cadastro.adicionarMilitares(milt3);
        cadastro.adicionarMilitares(milt4);
        cadastro.adicionarMilitares(milt5);
        cadastro.adicionarMilitares(milt6);
        cadastro.podeProgredir();
        cadastro.realizarProgressao();

    }
}

