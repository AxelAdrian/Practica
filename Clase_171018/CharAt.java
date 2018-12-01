package Clase_171018;

import java.util.Scanner;

public class CharAt {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca s o S: ");
        String respuesta = sc.nextLine();
        
        if (respuesta.equals("s") || respuesta.equals("S")) {
            System.out.println("Caracteres iguales");
        } else {
            System.out.println("Caracteres distintos");
        }

    }

}
