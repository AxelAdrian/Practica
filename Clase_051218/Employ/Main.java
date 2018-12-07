package Employ;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Empleado> empleado = new ArrayList<>();
        Empleado pablo = new Empleado("pablo", "escobar", 25, 4500);
        Empleado joaquin = new Empleado("joaquin", "guzman", 32, 25000);
        Empleado daniel = new Empleado("daniel", "killer", 35, 23000);

        empleado.add(pablo);
        empleado.add(joaquin);
        empleado.add(daniel);

        Collections.sort(empleado);

        for (int i = 0; i < empleado.size(); i++) {
            Empleado get = empleado.get(i);
            System.out.println("nombre: " + get.getNombre() + " apelldio: " + get.getApellido() + " edad: " + get.getEdad() + " salario: " + get.getSalario());
        }
    }

}
