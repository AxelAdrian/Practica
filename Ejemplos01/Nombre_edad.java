
package Ejemplos01;

import java.util.Scanner;

public class Nombre_edad {


    public static void main(String[] args) {
        
        byte edad;
        String nombre;
        double sueldo;
        
        Scanner sc=new Scanner(System.in); //creamos un objeto de tipo scanner
        
        System.out.println("Ingrese el nombre ");
        nombre=sc.nextLine();
        System.out.println("Ingrese la edad ");
        edad=sc.nextByte();
        System.out.println("Ingrese el sueldo ");
        sueldo=sc.nextDouble();
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
        System.out.println("El sueldo es: "+sueldo);
        
    }
    
}
