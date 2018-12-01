
package Clase_171018;
import java.util.Scanner;

public class While2 {


    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        int num, acum, cont;
        
        cont=1;
        acum=0;
        
        while (cont <=3)
        {
            System.out.println("Ingrese un numero positivo");
            num=sc.nextInt();
            
            acum=acum+num;
            
            System.out.println("El valor de acumulador es "+acum);
            
            System.out.println("El valor de contador es "+cont);
            
            ++cont;
        }
            
     
    }
    
}
