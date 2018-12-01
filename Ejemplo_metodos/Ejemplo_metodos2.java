package Ejemplo_metodos;

public class Ejemplo_metodos2 {

    String nombre = "Axel";
    double sueldo = 12000;

    public static void main(String[] args) {
        Ejemplo_metodos2 obj = new Ejemplo_metodos2();
        System.out.println("El nombre es: " + obj.mostrandoNombre());
        System.out.println("El sueldo es: " + obj.mostrandoSueldo());

    }
//metodo con retorno
    String mostrandoNombre() {
        return nombre;
    }

    double mostrandoSueldo() {
        return sueldo;
    }

}
