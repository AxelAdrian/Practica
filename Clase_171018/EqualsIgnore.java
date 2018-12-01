
package Clase_171018;

import java.util.Scanner;

public class EqualsIgnore {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduzca s o S");
        
        String respuesta = sc.nextLine();
        
        String resp1 = "s";
        
        if (respuesta.equalsIgnoreCase(resp1))
        {
            System.out.println("Caracteres iguales");
        }
        else
        {
            System.out.println("Caracteres distintos");
        }
    }
    
}
