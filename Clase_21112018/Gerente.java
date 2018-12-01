package Clase_21112018;

public class Gerente extends Empleado {

    private final String departamento;

    public Gerente(String departamento, String nombre, int legajo) {
        super(nombre, legajo);
        this.departamento = departamento;
    }

    @Override
    public void mostrar() {
        System.out.println("Departamento: " + departamento);
        super.mostrar();
    }

}
