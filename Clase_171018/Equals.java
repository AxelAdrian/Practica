
package Clase_171018;


public class Equals {


    public static void main(String[] args) {
        String cadena1 = "Hola"; //cadenas iguales y desiguales
        String cadena2 = "hola";
        
        if (cadena2.equals(cadena1)) //no se utiliza (==)
        {
            System.out.println("Cadenas iguales");
        }
        else 
        {
            System.out.println("Cadenas distintas");
        }
    }
    
}
