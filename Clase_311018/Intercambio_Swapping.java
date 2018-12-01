package Clase_311018;

import java.util.Scanner;

public class Intercambio_Swapping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese primer numero: ");
        int num1 = sc.nextInt();
        
        System.out.println("ingrese segundo numero ");
        int num2 = sc.nextInt();
        
        //INTERCAMBIO O SWAPPING
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("el primer numero es: " + num1);
        System.out.println("el segundo numero es: " + num2);
    }

}
