package Clase_281118;

import java.util.ArrayList;
import java.util.Scanner;

public class TestPersona01 {

    public static void main(String[] args) {
        ArrayList<Persona01> lista = new ArrayList<>();
        String nombre, apellido;
        int edad;
        System.out.println("tamaño lista");
        Scanner sc = new Scanner(System.in);
        int tamanio = sc.nextInt();

        for (int i = 0; i < tamanio; i++) {
            Scanner scn = new Scanner(System.in);
            System.out.println("introduzca un nombre:");
            nombre = scn.nextLine();
            System.out.println("untroduzca un apellido: ");
            apellido = scn.nextLine();
            System.out.println("introduzca una edad: ");
            edad = scn.nextInt();
            Persona01 pers = new Persona01(nombre, apellido, edad);
            lista.add(pers);
        }
        System.out.println("************");
        for (int i = 0; i < lista.size(); i++) {
            Persona01 get = lista.get(i);
            System.out.println("nombre: " + get.getNombre() + "\napellido: " + get.getApellido() + "\nedad: " + get.getEdad());
        }
    }

}
