package Ejemplo_metodos.Ejercicio4;

import java.util.Scanner;

public class Calificaciones {

    double calif[] = new double[5];

    public void pideCalificaciones() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese las calificaciones");
        for (int i = 0; i < 5; i++) {
            System.out.print("[" + (i + 1) + "]: ");
            calif[i] = sc.nextDouble();
        }
    }

    public void mostrarCalificaciones() {
        int j = 0;
        System.out.println("las calificaciones son: ");
        while (j < 5) {
            System.out.println("[" + (j + 1) + "]: " + calif[j]);
            j++;
        }
    }

}
