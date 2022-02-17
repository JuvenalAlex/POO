import java.util.Scanner;

public class vetor3 {

    public static void main(String[] args) {
      Scanner lendo = new Scanner(System.in);

      int chi = 15;
      int vetA[] = new int[chi]; 
      int vetB[] = new int[chi];
      int pos; 

      for (pos=0; pos<chi; pos++) {
        System.out.printf("Relate o %2d°. elemento das %d posições: ", (pos+1), chi);
        vetA[pos] = lendo.nextInt();
      }

      for (pos=0; pos<chi; pos++) {
        vetB[pos] = vetA[pos] * vetA[pos];
      }

      System.out.printf("\n\npos- vetA | vetB = vetA x vetA\n");
      for (pos=0; pos<chi; pos++) {
        System.out.printf("%2d- %4d = %2d\n", pos, vetA[pos], vetB[pos]);
      }
    }
}