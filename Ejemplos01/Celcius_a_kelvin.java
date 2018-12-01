
package Ejemplos01;

import java.util.Scanner;

public class Celcius_a_kelvin {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double celcius, kelvin;
        System.out.println("Introduzca grados celcius a convertir");
        celcius = sc.nextInt();
        kelvin = celcius + 273.15;
        System.out.println("Los grados kelvin son: "+kelvin);
    }
    
}
