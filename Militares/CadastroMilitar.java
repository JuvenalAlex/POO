import java.util.ArrayList;

public class CadastroMilitar{

    ArrayList<Militar> militares = new ArrayList<>();
    ArrayList<Carreira> militar = new ArrayList<>();

    public void adicionarMilitares(Militar m){
        militar.add((Carreira) m);
        militares.add(m);
    }

    public void podeProgredir(){
        for (int i = 0; i < militar.size(); i++){
            if (militar.get(i).podeProgredir()){
                System.out.println("Pode progredir");
            } else {
                System.out.println("Não pode progredir");
            }
        }
        System.out.println("--------------------------------------------");
    }
    
    public void realizarProgressao(){
        for (int i = 0; i < militares.size(); i++){
            if (militares.get(i).getPatente().equals("Soldado") && militar.get(i).podeProgredir()){
                System.out.println("Promoção de Soldado a Cabo");
            } if (militares.get(i).getPatente().equals("Cabo") && militar.get(i).podeProgredir()){
                System.out.println("Promoção de Cabo a Tenente");
            } if (militares.get(i).getPatente().equals("Tenente")){
                System.out.println("Patente Máxima atingida.");
            }

        }
        
    }
    
}