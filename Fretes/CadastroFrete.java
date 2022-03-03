import java.util.ArrayList;
import java.util.List;


public class CadastroFrete {
    private List<Frete> objeto = new ArrayList<>();

    public void adicionarFrete(Frete item){
        if (this.objeto.size() <= 10){
            this.objeto.add(item);
            if(this.objeto.size() == 10){
                System.out.println("Limite máximo de 10 fretes");
            }
        }
        else{
            this.objeto.remove(10);
        }
    }

    public void valorTotalFretes(){
        double aju = 0;
        for (int i = 0; i < objeto.size(); i++){
            aju += objeto.get(i).calcularFrete(objeto.get(i).getDistancia(), objeto.get(i).getValorPorKm());
        }
        System.out.println("\nA soma total de todos os fretes: " + aju);
    }
    
}
