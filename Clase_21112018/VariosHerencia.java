package Clase_21112018;

public class VariosHerencia {

    public static void main(String[] args) {
        Gerente ger = new Gerente("25a", "pepe", 123);
        ger.mostrar();
        Empleado emp = new Empleado("dani", 3214);
        emp.mostrar();
    }

}
