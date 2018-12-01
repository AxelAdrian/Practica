// hacer una funcion que ingrese 2 numeros y sacar su promdio
package Clase_071118;

import java.util.Scanner;

public class funcion_promedio {

    public static double promedioSuma(int a, int b) /*metodo promedio*/
    {
        int resultado;
        float promedio;

        resultado = a + b;
        promedio = (float) resultado / 2; //casteo de double a float
        //System.out.println("el promedio es: " + promedio);
        return promedio;

    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese primer valor: ");
        int a = sc.nextInt();
        System.out.println("ingrese segundo valor");
        int b = sc.nextInt();
        double salida = promedioSuma(a, b);
        System.out.println("el promedio de la suma es: "+salida);
    }



}
