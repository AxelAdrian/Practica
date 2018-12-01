package Clase_311018;

import java.util.Scanner;

public class LlenadoVectorScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[8];
        
        System.out.println("****LLENADO DEL VECTOR****");
        System.out.println("");
        
        for (int i = 0; i < 8; i++)
        {
            System.out.println("Ingrese valores del vector["+i+"]");
            a[i] = sc.nextInt();
        }
        
        System.out.println("****IMPRESION DEL VECTOR****");
        System.out.println("");
        
        for (int i = 0; i < 8; i++)
        {
            System.out.println("Posicion a["+i+"] es: "+ a[i]);
        }
    }

}
