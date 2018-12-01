
package Ejemplos01;
import java.util.Scanner;

public class Ramo_flores {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int monto;
        double ramoflores = 23.5;
        int cantidad;
        
        System.out.println("Introducir el monto de dinero ");
        monto = sc.nextInt();
        
        
        //proceso
        cantidad = (int) (monto/ramoflores);
        
        //salida
        System.out.println("La cantidad de ramos que se puede comprar son: "+cantidad);
    }
    
}
