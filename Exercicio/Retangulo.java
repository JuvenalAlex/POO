import java.util.Scanner;

public class Retangulo {
    
    Scanner entrada = new Scanner(System.in);

    double comprimento, largura, area, perimetro;
    
    double calcularArea (){
        area = comprimento*largura;
        return area;
    }
     double calcularPerimetro (){
        perimetro = (2*comprimento) + (2*largura);
        return perimetro;
    }
     
    void imprimir(){
        
        System.out.println("O comprimento do retângulo é de:"+comprimento+" e largura de:" +largura+" \nPossuindo área de:"+calcularArea()
                +"\nE o perímetro de:"+calcularPerimetro());
    }
    
    void construtor(){
   System.out.println("Relate o valor do comprimento do retângulo:");
        comprimento = entrada.nextDouble();
   System.out.println("Relate a largura do retângulo:");    
        largura = entrada.nextDouble();
    }
    
}