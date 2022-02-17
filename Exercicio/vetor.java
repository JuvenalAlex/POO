import java.util.Scanner;


public class vetor {
    
    
    public static void main(String[] args) {
        
        Scanner lendo = new Scanner(System.in);
        int vetA[] = new int[5];
        int vetB[]= new int[5];
        
        for(int i = 0; i < vetA.length; i++){
            System.out.println("Digite o valor da posição de vetA: " + i);
            vetA[i] = lendo.nextInt();
        }
        
        for(int i = 0; i < vetA.length; i++){
            vetB[i] = vetA[i];
            System.out.println("O valor vetB é igual :" + vetB[i]);
        }
    
      }
}
