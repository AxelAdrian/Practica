package Ejemplo_metodos.Ejercicio7;

public class Datos {

    public static int[] RellenarArreglo(int numero) {
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = numero;
            numero = numero + 5;

        }
        return array;
    }
    public static void imprimirAreglo (int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }
    }
}
