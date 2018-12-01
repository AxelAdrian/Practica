
package Clase_171018;

import java.util.Scanner;

public class Suma {


    public static void main(String[] args) {
    
        Scanner sc=new Scanner (System.in); //declaracion del scanner
        
        int suma, num, contador; //declaracion de variables
        float prom;
        
        suma = 0;
        
        for (contador = 1; contador <= 5; ++contador)
        
        {
            System.out.println("Ingrese numero ["+contador+"]: "); //escribir
            
            num = sc.nextInt(); //leer
            
            suma = suma + num; //operacion
            
        }
        prom = suma/5;
        
        System.out.println("La suma es: "+suma); //salida o escribir 
        System.out.println("El promedio es: "+prom);
    }
    
}
