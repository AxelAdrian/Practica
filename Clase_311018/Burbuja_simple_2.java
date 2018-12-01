package Clase_311018;

import java.util.Scanner;

public class Burbuja_simple_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese largo del vector");
        int n = sc.nextInt();

        int vector[] = new int[n];

        for (int cont = 0; cont < n; cont++) {
            System.out.println("Ingrese valores del vector[" + cont + "]");
            vector[cont] = sc.nextInt();
        }

        int i, j;
        int aux;//variable aux temporal

        //***METODO BURBUJA****
        for (i = 0; i < vector.length - 1; i++) //pasadas segun largo
        {
            for (j = 0; j < vector.length - i - 1; j++) //decrece cant indice
            {
                if (vector[j] > vector[j + 1]) /* si numero actual > numero siguiente; cambiar*/
                /* comparar valores */
                /*Swapping*/ 
                {
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }

        System.out.println("");

        for (i = 0; i < vector.length; i++) 
        {
            System.out.println("la nueva posicion [" + i + "] = " + vector[i]);
        }
    }

}
