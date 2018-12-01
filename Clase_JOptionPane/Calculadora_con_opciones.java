package Clase_JOptionPane;

import javax.swing.JOptionPane;
//\n salto de linea

public class Calculadora_con_opciones {

    public static void main(String[] args) {
        int opcion = 0;
        double num1, num2, res;

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog("[1]Sumar "
                    + "\n"
                    + "[2]Restar\n"
                    + "[3]Dividir\n"
                    + "[4]Multiplicar\n"
                    + "[5]Salir\n"
                    + "Ingresa una opcion\n"));

            switch (opcion) {
                case 1:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo valor"));
                    res = num1 + num2;
                    JOptionPane.showMessageDialog(null, "El resultado es: " + res);
                    break;
                case 2:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo valor"));
                    res = num1 - num2;
                    JOptionPane.showMessageDialog(null, "El resultado es: " + res);
                    break;
                case 3:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo valor"));
                    res = num1 / num2;
                    JOptionPane.showMessageDialog(null, "El resultado es: " + res);
                    break;
                case 4:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo valor"));
                    res = num1 * num2;
                    JOptionPane.showMessageDialog(null, "El resultado es: " + res);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "El programa a finalizado con exito");
            }

        } while (opcion != 5);

    }

}
