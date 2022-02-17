import java.util.Scanner;

public class vetor5 {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);

      int chi = 10; 
      int vetA[] = new int[chi]; 
      int vetB[] = new int[chi];
      int pos; 

      for (pos=0; pos<chi; pos++) {
        System.out.printf("Relate o %2d°. elemento das %d posições: ", (pos+1), chi);
        vetA[pos] = ler.nextInt();
      }

      for (pos=0; pos<chi; pos++) {
        vetB[pos] = vetA[pos] * pos;
      }

      System.out.printf("\n\npos- vetA |  vetB = vetA x a posição do elemento\n");
      for (pos=0; pos<chi; pos++) {
        System.out.printf("%d- %4d  = %2d\n", pos, vetA[pos], vetB[pos]);
      }
    }

}