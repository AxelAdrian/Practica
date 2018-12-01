package Clase_151118.Tarea;

public class CuentaBancaria {

    private String tipo;
    private int codigo;
    private String nombre;
    private double saldo;

    public CuentaBancaria(String tipo, int codigo, String nombre, double saldo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public void Mostrar() {
        System.out.println("tipo: " + this.tipo);
        System.out.println("codigo: " + this.codigo);
        System.out.println("nombre: " + this.nombre);
        System.out.println("saldo: " + this.saldo);
    }
}
