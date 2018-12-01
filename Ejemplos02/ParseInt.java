package Ejemplos02;

public class ParseInt {

    public static void main(String[] args) {
        // TODO code application logic here
        int a = 0, b = 0, suma = 0;
        String numero = "12.4";
        String valor1 = "63";
        String valor2 = "42";
        
        a = Integer.parseInt(valor1); //convierte la cadena a un numero entero
        b = Integer.parseInt(valor2);
        double c = Double.parseDouble(numero);
        
        suma = a + b;
        System.out.println("real: "+c);
        System.out.println("La suma es: " + a + " + " + b + " = " + suma);
    }

}
