import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lendo = new Scanner(System.in);

        Quadrado chakra = new Quadrado();
                 chakra.construtor();
                 chakra.imprimir();
        Retangulo aura = new Retangulo();
        aura.construtor();
        aura.imprimir();     
    }  
}