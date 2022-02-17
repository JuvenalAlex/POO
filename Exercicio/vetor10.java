import java.util.Scanner;

public class vetor10 {

    public static void main(String[] args) {
      Scanner lendo = new Scanner(System.in);

      int chi = 10; 
      int vetA[] = new int[chi]; 
      int vetB[] = new int[chi];
      int pos; 
      for (pos=0; pos<chi; pos++) {
        System.out.printf("Relate o %2d°. elemento das %d do vetor 'vetA': ", (pos+1), chi);
        vetA[pos] = lendo.nextInt();
      }

      for (pos=0; pos<chi; pos++) {
        vetB[pos] = vetA[pos] % 2;
      }

      System.out.printf("\n\npos- vetA  |  vetB = vetA %% 2\n");
      for (pos=0; pos<chi; pos++) {
        System.out.printf("%d- %2d / 2 resto %2d\n", pos, vetA[pos], vetB[pos]);
      }
    }

}

