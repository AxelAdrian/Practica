package Ejemplo_metodos.Ejercicio5;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        CapturarNumeros op = new CapturarNumeros();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero");
        double n1 = sc.nextDouble();
        System.out.println("Digite otro numero");
        double n2 = sc.nextDouble();
        op.divide(n1, n2);
        op.multiplica(n1, n2);
        op.muestraResultados();

    }

}
