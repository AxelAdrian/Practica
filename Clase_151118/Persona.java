package Clase_151118;

public class Persona {

    private String nombre;
    private int edad;
    private int dni;

    public Persona(String nombre, int edad ,int dni) { //metodo constructor
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public void mostrar() {
        System.out.println("El nombre es: " + this.nombre);
        System.out.println("La edad es: " + this.edad);
        System.out.println("dni: " + this.dni);
    }
}
