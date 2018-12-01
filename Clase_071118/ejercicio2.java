/*
realizar un metodo/ funcion al que se le pase como parametro un numero n y muestre
por pantalla n veces el mensaje "modulo ejecutandose"
 */
package Clase_071118;

import java.util.Scanner;


public class ejercicio2 {

public static void mostrar (int n)
{
for (int i=0; i<n; i++)
{
    System.out.println("modulo ejecutandose!");
}
}
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n;
        System.out.println("digite un numero");
        n=sc.nextInt();
        mostrar(n);

    }
    
}
