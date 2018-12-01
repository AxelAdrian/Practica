/*
realizar un metodo q calcule (muestre en pantalla) el area de un cilindro;
 */
package Clase_071118;
import java.lang.Math;
import java.util.Scanner;

public class ejercicio {

public static double areaCilindro(double r, double h)
{
    double a;
    a = 2*Math.PI*r*h;
    return a;

}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el radio");
        double r = sc.nextDouble();
        System.out.println("ingrese la altura");
        double h = sc.nextDouble();
        
        double resultado = areaCilindro(r, h);
        System.out.println("el resultado es: "+resultado);
        
    }
    
}
