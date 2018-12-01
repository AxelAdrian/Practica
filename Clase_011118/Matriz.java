package Clase_011118;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        
        //FILA0
        System.out.println("");
        System.out.println("Ingrese el valor [0][0]");
        matriz[0][0] = sc.nextInt();
        System.out.println("Ingrese el valor [0][1]");
        matriz[0][1] = sc.nextInt();
        System.out.println("Ingrese el valor [0][2]");
        matriz[0][2] = sc.nextInt();

        //FILA1
        System.out.println("");
        System.out.println("Ingrese el valor [1][0]");
        matriz[1][0] = sc.nextInt();
        System.out.println("Ingrese el valor [1][1]");
        matriz[1][1] = sc.nextInt();
        System.out.println("Ingrese el valor [1][2]");
        matriz[1][2] = sc.nextInt();

        //FILA2
        System.out.println("");
        System.out.println("Ingrese el valor [2][0]");
        matriz[2][0] = sc.nextInt();
        System.out.println("Ingrese el valor [2][1]");
        matriz[2][1] = sc.nextInt();
        System.out.println("Ingrese el valor [2][2]");
        matriz[2][2] = sc.nextInt();

//        System.out.println("Matriz [" + matriz[0][0] + "]");
//        System.out.println("Matriz [" + matriz[0][1] + "]");
//        System.out.println("Matriz [" + matriz[0][2] + "]");
//
//        System.out.println("Matriz [" + matriz[1][0] + "]");
//        System.out.println("Matriz [" + matriz[1][1] + "]");
//        System.out.println("Matriz [" + matriz[1][2] + "]");
//
//        System.out.println("Matriz [" + matriz[2][0] + "]");
//        System.out.println("Matriz [" + matriz[2][1] + "]");
//        System.out.println("Matriz [" + matriz[2][2] + "]");

        System.out.println("");
        System.out.println("matriz [0][0] = " + matriz[0][0]);
        System.out.println("matriz [0][1] = " + matriz[0][1]);
        System.out.println("matriz [0][2] = " + matriz[0][2]);

        System.out.println("matriz [1][0] = " + matriz[1][0]);
        System.out.println("matriz [1][1] = " + matriz[1][1]);
        System.out.println("matriz [1][2] = " + matriz[1][2]);

        System.out.println("matriz [2][0] = " + matriz[2][0]);
        System.out.println("matriz [2][1] = " + matriz[2][1]);
        System.out.println("matriz [2][2] = " + matriz[2][2]);

    }

}
