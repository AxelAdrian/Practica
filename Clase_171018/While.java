
package Clase_171018;
import java.util.Scanner;

public class While {


    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        int valores=0, cont=1;
        
        
        while (valores != 7549 ){
            
            System.out.println("Ingrese los valores "+cont);
            valores = sc.nextInt();
            ++cont;
            
            
        }
        
        System.out.println("El valor ingesado es igual a: "+valores);
    }
    
}
