package Clase_281118;

import java.util.ArrayList;

public class ArrayListDouble {

    public static void main(String[] args) {

        ArrayList<Double> precios = new ArrayList<>();
        //posicion, valor
        precios.add(0, 4.5);
        precios.add(0, 3.4);

        System.out.println("Largo de la lista: [" + precios.size() + "]");
        System.out.println(precios.get(1));//imprimiendo posicion

        System.out.println("Imprimiendo la lista: ");
        for (int i = 0; i < precios.size(); i++) {
            Double get = precios.get(i);
            System.out.println(get);
        }
    }

}
