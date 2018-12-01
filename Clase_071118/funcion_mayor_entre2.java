//realizar un metodo que tenga como parametro 2 numeros ingresados por teclado y que retorne el mayor
package Clase_071118;

import java.util.Scanner;

public class funcion_mayor_entre2 {

    public static int mayor(int a, int b) {
        int mayor;
        if (a > b) {
            mayor = a;
        } else {
            mayor = b;
        }
        return mayor;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("ingrese 2 numeros");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int salida = mayor (a,b);
        System.out.println("el mayor es: "+salida);
    }

}
