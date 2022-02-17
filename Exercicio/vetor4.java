import java.util.Scanner;

public class vetor4 {

    public static void main(String[] args) {
      Scanner lendo = new Scanner(System.in);

      int chi = 15; 
      int vetA[] = new int[chi]; 
      double vetB[] = new double[chi]; 
      int pos; 

      for (pos=0; pos<chi; pos++) {
        System.out.printf("Relate o %2d°. elemento das %d posições: ", (pos+1), chi);
        vetA[pos] = lendo.nextInt();
      }

      for (pos=0; pos<chi; pos++) {
        vetB[pos] = Math.sqrt(vetA[pos]);
      }

      System.out.printf("\n\npos-  vetA |  vetB = raiz(vetA)\n");
      for (pos=0; pos<chi; pos++) {
        System.out.printf("%2d- %4d  = %10.5f\n", pos, vetA[pos], vetB[pos]);
      }
    }

}