package Clase_081118;

import java.util.Scanner;

public class Metodo_carga {
    //public static Scanner teclado;
    //public static int vec[];

    public static void cargar(int vector[]) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < vector.length; i++) {
            System.out.println("ingrese elemento");
            vector[i] = teclado.nextInt();
        }

        teclado.close();
    }

    public static void ordenar(int vec[]) {
        for (int k = 0; k < vec.length; k++) {
            for (int f = 0; f < vec.length - 1 - k; f++) {
                if (vec[f] > vec[f + 1]) {
                    int aux;
                    aux = vec[f];
                    vec[f] = vec[f + 1];
                    vec[f + 1] = aux;
                }
            }
        }
    }

    public static void imprimir(int vector[]) {
        System.out.println("salida del vector");

        for (int f = 0; f < vector.length; f++) {
            System.out.println(vector[f]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("ingrese el largo del vector");
        int n = scn.nextInt();
        int vector[] = new int[n];
        cargar(vector);
        ordenar(vector);
        imprimir(vector);
    }

}
