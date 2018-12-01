package Clase_281118;

import java.util.ArrayList;

public class TestPersona {

    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList();
        Persona pedro = new Persona("pedro", "romero", 545646);
        Persona pablo = new Persona("pablo", "escobar", 988976);
        lista.add(0, pedro);
        lista.add(1, pablo);
//lista.add(0, new Persona("pedro"));
//lista.add(1, new Persona ("pablo"));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("nombre: " + lista.get(i).getNombre());
            System.out.println("apellido: " + lista.get(i).getApellido());
            System.out.println("edad: " + lista.get(i).getDni());
            System.out.println("");
        }

    }

}
