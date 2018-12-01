package Ejemplo_metodos.Ejercicio3;

import javax.swing.JOptionPane;

public class Datos_alumno {

    String nombre;
    double calificacion;

    public void pideDatos() {
        nombre = JOptionPane.showInputDialog(null, "ingrese nombre");
        calificacion = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese calificacion"));
    }

    public void estado() {
        if (calificacion >= 6) {
            JOptionPane.showMessageDialog(null, "El alumno aprobo");
        } else {
            JOptionPane.showMessageDialog(null, "El alumno reprobo");
        }
    }

    public void muestraDatos() {
        JOptionPane.showMessageDialog(null, "El alumno: " + nombre);
        JOptionPane.showMessageDialog(null, "La calificacion es: " + calificacion);
    }

}
