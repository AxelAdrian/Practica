package Clase_081118;

import java.util.Scanner;

public class Metodo_carga_vector {
//variables globales

    public static Scanner teclado;
    public static int vec[];

    public static void cargar() {
        teclado = new Scanner(System.in);
        System.out.println("cuantos elementos tendra el vector");
        int cant;
        cant = teclado.nextInt();
        vec = new int[cant];
        for (int f = 0; f < vec.length; f++) {
            System.out.println("ingrese elemento");
            vec[f] = teclado.nextInt();
        }
    }

    public static void ordenar() {
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

    public static void imprimir() {
        System.out.println("salida del vector");
        for (int f = 0; f < vec.length; f++) {
            System.out.println(vec[f]);
        }
    }

    public static void main(String[] args) {
        cargar();
        ordenar();
        imprimir();
    }

}
