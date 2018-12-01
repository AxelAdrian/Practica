package Ejemplo_metodos.Ejercicio;

import java.util.Scanner;

public class DatosPersona {
//atributos: Variable

    String nombre, estadoCivil;
    int edad;

    public void leeDatos() //metodos sin retorno sin parametros
    {
        System.out.println("Se ha ejecutado el metodo leeDatos");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese edad: ");
        edad = teclado.nextInt();
        System.out.println("Estado civil: ");
        estadoCivil = teclado.next();
    }
    
    public void mostrarDatos()
    {
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
        System.out.println("Estado civil: "+estadoCivil);
    }
}
