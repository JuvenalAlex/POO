import java.util.Scanner;

public class Quadrado {
    
    Scanner lendo = new Scanner(System.in);
    
    double lado, area, perimetro;
    
    double calcularArea (){  
        area = lado*lado;  
        return area;
    }
     double calcularPerimetro (){  
        perimetro = 4*lado; 
        return perimetro;
    }
     
    void imprimir(){
        
        System.out.println("O valor do lado do quadrado: "
                +lado+"\nÁrea: "+calcularArea()
                +"\nPerimetro: "+calcularPerimetro());
    }
    
    void construtor(){
   System.out.println("Relate o valor do lado do quadrado:");
        lado = lendo.nextDouble();
    }
    
}