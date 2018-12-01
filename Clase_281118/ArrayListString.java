package Clase_281118;

import java.util.ArrayList;

public class ArrayListString {
    
    public static void main(String[] args) {
        ArrayList<String> paises = new ArrayList<>();
        paises.add(0, "Argentina");
        paises.add(1, "Brasil");
        paises.add(2, "Venezuela");
        
        System.out.println("Largo de la lista: [" + paises.size() + "]");
        System.out.println("Posicion[1]: " + paises.get(1));
        
        System.out.println("Imprimiento lista:");
        for (int i = 0; i < paises.size(); i++) {
            String get = paises.get(i);
            System.out.println(get);
            System.out.println("" + paises.get(i));
        }
    }
    
}
