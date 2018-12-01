package Clase_081118;

import java.util.Scanner;

public class MetodoBoolean {

    public static boolean EsPar(int num) {
        if ((num % 2) == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca numero: ");
        int a = sc.nextInt();
        if (EsPar(a) == true) {
            System.out.println("su numero es par ...");
        } else {
            System.out.println("su numero no es par ...");
        }
        sc.close();
    }

}
