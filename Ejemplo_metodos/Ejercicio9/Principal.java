package Ejemplo_metodos.Ejercicio9;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = {10,2,300,105,120,2,8,9,0};

        //llenar array con numeros random        
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 300) + 1;
//        }
        //mostrar array
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]+"; ");
//        }
        System.out.println("ingrese un numero a buscar");
        int n = sc.nextInt();

        if (BuscarNumero(n, array)) {
            System.out.println("el numero se encontro");
        } else {
            System.out.println("el numero no se encontro");
        }
    }

    public static boolean BuscarNumero(int n, int arr[]) {
        int cont = 0;
        int k = 0;
        boolean encontrado = false;

        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                cont++;
            }
            if (cont > 0) {
                k++;
                System.out.println("se busco " + k + " veces");
                encontrado = true;
                break;
            } else {
                k++;
                System.out.println("se busco " + k + " veces");
                encontrado = false;
            }

        }
        return encontrado;

    }

}
