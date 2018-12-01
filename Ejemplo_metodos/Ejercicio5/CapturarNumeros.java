package Ejemplo_metodos.Ejercicio5;

public class CapturarNumeros {

    double division, multiplicacion;

    public void divide(double num1, double num2) {
        division = num1 / num2;
    }

    public void multiplica(double num1, double num2) {
        multiplicacion = num1 * num2;
    }

    public void muestraResultados() {
        System.out.println("Resultado Division: " + division);
        System.out.println("Resltado Multiplicacion: " + multiplicacion);
    }
}
