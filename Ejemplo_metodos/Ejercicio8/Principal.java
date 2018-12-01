package Ejemplo_metodos.Ejercicio8;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        Seleccion s1 = new Seleccion();
        System.out.print("ingrese num1: ");
        int n1 = sc.nextInt();
        System.out.print("ingrese num1: ");
        int n2 = sc.nextInt();
        System.out.println("");
        System.out.println("1.- suma\n2.- resta\n3.- multiplicacion\n4.- division");
        System.out.println("ingrese opcion");
        opc = sc.nextInt();
        switch (opc) {
            case 1:
                s1.Suma(n1, n2);
                break;
            case 2:
                s1.Resta(n1, n2);
                break;
            case 3:
                s1.Multi(n1, n2);
                break;
            case 4:
                s1.Div(n1, n2);
                break;
            default:
                System.out.println("opcion invalida");
        }
    }

}
