package Ejemplo_metodos.Ejercicio2;

import java.util.Scanner;

public class Operaciones_numericas {

    double num1, num2;
    double suma, resta;

    public void pideNumeros() //metodo sin retorno sin parametros
    {
        System.out.println("**** metodo pideNumeros EJECUTADO ***");
        Scanner ob = new Scanner(System.in);
        System.out.println("ingrese numero");
        num1 = ob.nextDouble();
        System.out.println("ingrese otro numero");
        num2 = ob.nextDouble();
    }

    public void suma() {
        System.out.println("**** metodo suma EJECUTADO ***");
        suma = num1 + num2;
    }

    public void resta() {
        System.out.println("**** metodo resta EJECUTADO ***");
        resta = num1 - num2;
    }

    public void muestraResultados() {
        System.out.println("**** metodo muestraResultados EJECUTADO ***");
        System.out.println("la suma es: " + suma);
        System.out.println("la resta es: " + resta);
    }
}
