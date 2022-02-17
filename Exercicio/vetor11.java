public class vetor11 {

    public static void main(String[] args) {
      int chi = 10; 
      int vetA[] = new int[chi]; 
      int pos;
      int contadorpar = 0; 

      for (pos=0; pos<chi; pos++) {
        vetA[pos] = (int)Math.round(Math.random() * 100); 

        if ((vetA[pos] % 2) == 0) {
           contadorpar = contadorpar + 1; 
           System.out.printf("vetA[%d] = %2d %d° número par\n", pos, vetA[pos], contadorpar);
        }
        else System.out.printf("vetA[%d] = %2d\n", pos, vetA[pos]);
      }

      System.out.printf("\n\nNos elementos do vetor existem %d números pares.\n", contadorpar);
    }

}
