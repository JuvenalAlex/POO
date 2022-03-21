public class CadastroBrinquedo {

    private Brinquedo[] BrinquedosMoviveis;
    private int indice;

    public CadastroBrinquedo(int tamanho){
        BrinquedosMoviveis = new Brinquedo[tamanho];
        indice = 0;
    }

    public void adicionarBrinquedos(Brinquedo a){
        if(indice < BrinquedosMoviveis.length){

            BrinquedosMoviveis[indice] = a;
            indice++;
        }
    }

    public void todoMundoSeMovendo(){
        System.out.println("\nTodo mundo está se movendo:");
        for (Brinquedo brinquedosMov : BrinquedosMoviveis) {
            brinquedosMov.mover();
        }
    }
}
