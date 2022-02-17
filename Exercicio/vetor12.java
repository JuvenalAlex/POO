
public class vetor12 {

    public static void main(String[] args) {
      int chi = 10; 
      int vetA[] = new int[chi];
      int pos; 
      int calculo = 0; 

      for (pos=0; pos<chi; pos++) {
        vetA[pos] = (int)Math.round(Math.random() * 100);

        calculo = calculo + vetA[pos]; 

        System.out.printf("vetA[%d] = %2d\n", pos, vetA[pos]);
      }

      System.out.printf("\nA soma dos elementos existentes no vetor é de = %d.\n", calculo);
    }

}