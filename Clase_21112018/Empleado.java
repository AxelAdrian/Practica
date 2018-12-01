package Clase_21112018;

public class Empleado {

    private final String nombre;
    private final int legajo;

    public Empleado(String nom, int leg) {
        this.nombre = nom;
        this.legajo = leg;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + "\nLegajo: " + legajo);
    }

}
