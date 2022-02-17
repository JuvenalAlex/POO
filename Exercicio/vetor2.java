import java.util.Scanner;

public class vetor2 {
    public static void main(String[] args) {
      Scanner lendo = new Scanner(System.in);
      
      int chi = 8; 
      int vetA[] = new int[chi]; 
      int vetB[] = new int[chi];
      int pos; 

      for (pos=0; pos<chi; pos++) {
        System.out.printf("Relate o %d° elemento das %d posições: ", (pos+1), chi);
        vetA[pos] = lendo.nextInt();
      }

      for (pos=0; pos<chi; pos++) {
        vetB[pos] = vetA[pos] * 2;
      }

      System.out.printf("\n\npos- vetA | vetB = vetA x 2\n");
      for (pos=0; pos<chi; pos++) {
        System.out.printf("%d- %4d = %2d\n", pos, vetA[pos], vetB[pos]);
      }
    }

}
