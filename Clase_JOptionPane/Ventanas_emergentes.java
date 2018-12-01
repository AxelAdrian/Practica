package Clase_JOptionPane;

import javax.swing.JOptionPane;

public class Ventanas_emergentes {

    public static void main(String[] args) {
        //mostrar mensaje
        //JOptionPane.showMessageDialog(null, "Mensaje mostrado", "Error", JOptionPane.ERROR_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Mensaje mostrado", "Advertencia", JOptionPane.WARNING_MESSAGE);
        
        int n, multi;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
        multi = n*2;
        JOptionPane.showMessageDialog(null,"El numero "+n+" al doble es: "+multi);

    }

}
