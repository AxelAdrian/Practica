package Ejemplo_metodos.Ejercicio6;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        DatosPersona dp = new DatosPersona();
        String n;
        n = JOptionPane.showInputDialog("ingresa nombre");
        dp.DameNombre(n);
        JOptionPane.showMessageDialog(null, "el nombre es: " + dp.devuelveNombre());
        System.out.println("el nombre es: " + dp.devuelveNombre());

    }

}
