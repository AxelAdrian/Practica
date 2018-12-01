package Clase_081118;

import java.util.Scanner;

public class Metodo_prom {

    public static void ingreso(int vector[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("ingrese dato [" + i + "]");
            vector[i] = sc.nextInt();
        }
        sc.close();
    }

    public static double promedio(int vector[]) {
        int suma = 0;
        double promedio = 0;
        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];
        }
        promedio = (double) suma / vector.length;
        return promedio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el largo del vector: ");
        int n = sc.nextInt();
        int vector[] = new int[n];
        ingreso(vector);
        double pro = promedio(vector);
        System.out.println("el promedio es: " + pro);
        sc.close();
    }

}
