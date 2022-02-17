import java.util.Scanner;

public class vetor6 {

    public static void main(String[] args) {
      Scanner lendo = new Scanner(System.in);

      int chi = 10; 
      int vetA[] = new int[chi]; 
      int vetB[] = new int[chi];
      int vetC[] = new int[chi];
      int pos; 

      for (pos=0; pos<chi; pos++) {
        System.out.printf("Relate o %2d°. elemento das %d do vetor 'vetA': ", (pos+1), chi);
        vetA[pos] = lendo.nextInt();
      }

      System.out.printf("\n\n");

      for (pos=0; pos<chi; pos++) {
        System.out.printf("Relate o %2d°. elemento das %d do vetor 'vetB': ", (pos+1), chi);
        vetB[pos] = lendo.nextInt();
      }

      for (pos=0; pos<chi; pos++) {
        vetC[pos] = vetA[pos] + vetB[pos];
      }

      System.out.printf("\n\npos- vetA | vetB | vetC = vetA + vetB\n");
      for (pos=0; pos<chi; pos++) {
        System.out.printf("%d- %4d + %d  = %d\n", pos, vetA[pos], vetB[pos], vetC[pos]);
      }
    }

}
