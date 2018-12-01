package Ejemplo_metodos;

public class Ejemplo_metodos3 {

    public static void main(String[] args) {
        Ejemplo_metodos3 obj = new Ejemplo_metodos3();
        obj.mostrandoNombre("Axel");
        obj.mostrandoEdad(27);

    }
//Métodos con parámetros , tipo void.

    void mostrandoNombre(String nom) {
        System.out.println("El nombre es: " + nom);
    }

    void mostrandoEdad(int edad) {
        System.out.println("La edad es: " + edad);
    }

}
