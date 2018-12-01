package Clase_011118;

import java.util.Scanner;

public class Matriz_con_for {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introducir n° de filas: ");
        int f = sc.nextInt();
        System.out.println("introducir n° de columnas");
        int c = sc.nextInt();

        int num[][] = new int[f][c];

        System.out.println("introducir valores de matriz [" + f + "] x [" + c + "] :");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num[i][j] = sc.nextInt();
                System.out.println("valor [" + i + "][" + j + "] es:" + num[i][j]);
            }
        }
        System.out.println("\nSu salida es: \n");

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.println("[" + i + "][" + j + "]=" + num[i][j] + " ");
            }
            System.out.println("");
        }
        sc.close();
    }

}
