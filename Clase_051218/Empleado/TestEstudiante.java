package Empleado;

import java.util.ArrayList;
import java.util.Scanner;

public class TestEstudiante {

    public static void main(String[] args) {
        ArrayList<Estudiante> lista = new ArrayList<>();
        String nombre, apellido;
        int calificacion;
        System.out.println("tamaño lista");
        Scanner sc = new Scanner(System.in);
        int tamanio = sc.nextInt();
        for (int i = 0; i < tamanio; i++) {
            Scanner scn = new Scanner(System.in);
            System.out.println("introduzca nombre");
            nombre = scn.next();
            System.out.println("introduzca apellido");
            apellido = scn.next();
            System.out.println("introduzca calficacion");
            calificacion = scn.nextInt();
            Estudiante est = new Estudiante(nombre, apellido, calificacion);
            lista.add(est);
            System.out.println("");
        }
        System.out.println("************");
        for (int i = 0; i < lista.size(); i++) {
            Estudiante get = lista.get(i);
            System.out.println("nombre: " + get.getNombre() + "\napellido: " + get.getApellido() + "\ncalficacion: " + get.getCalificacion());
            System.out.println("");
        }
    }

}
