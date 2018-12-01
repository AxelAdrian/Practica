package Clase_211118.Herencia;

public class Personas {

    public String nombre;
    public int dni;

    public Personas(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void mostrar() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Dni: " + this.dni);
    }
}
