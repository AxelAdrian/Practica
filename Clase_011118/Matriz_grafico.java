package Clase_011118;

import java.util.Scanner;

public class Matriz_grafico {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de FILAS que desea");
        int fil = sc.nextInt(); //Cargo la cantidad de filas

        System.out.println("Ingrese la cantidad de COLUMNAS que desea");
        int col = sc.nextInt(); //cargo la cantidad de columnas

        int mat[][] = new int[fil][col]; //defino mi matriz

        for (int i = 0; i < fil; i++) { //cargo la matriz con los datos, por filas
            for (int j = 0; j < col; j++) {
                System.out.println("### Ingrese el elemento [" + i + "][" + j + "] de la matriz");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("### Su matriz es ###");
        for (int i = 0; i < fil; i++) { //imprimo la matriz por filas
            for (int j = 0; j < col; j++) {
                System.out.printf("%d \t", mat[i][j]);
            }
            System.out.printf("\n");
        }
        int acum = 0;

        for (int i = 0; i < fil; i++) {
            acum = acum + mat[i][0];
        }
        System.out.println("### La suma de la primer columna es " + acum + " ###");
    }

}
