package Ejemplo_metodos.Ejercicio8;

public class Seleccion {

    int suma, resta, multi, div;

    public void Suma(int num1, int num2) {
        suma = num1 + num2;
        System.out.println("la suma es: " + suma);
    }

    public void Resta(int num1, int num2) {
        resta = num1 - num2;
        System.out.println("la resta es: " + resta);
    }

    public void Multi(int num1, int num2) {
        multi = num1 * num2;
        System.out.println("la multiplicacion es es: " + multi);
    }

    public void Div(int num1, int num2) {
        div = num1 / num2;
        System.out.println("la division es: " + div);
    }
}
