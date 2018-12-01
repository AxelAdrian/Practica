package Clase_151118.Tarea;

public class Celular {

    private double peso;
    private double precio;
    private String marca;
    private int tamaño;
    private String color;

    public Celular(double peso, double precio, String marca, int tamaño, String color) {
        this.peso = peso;
        this.precio = precio;
        this.marca = marca;
        this.tamaño = tamaño;
        this.color = color;
    }

    public void Mostrar() {
        System.out.println("peso: " + this.peso);
        System.out.println("precio:" + this.precio);
        System.out.println("marca: " + this.marca);
        System.out.println("tamaño: " + this.tamaño);
        System.out.println("color: " + this.color);
    }
}
