package Clase_151118;

public class Lapiz {

    private String color;
    private int tamaño;
    private String material;

    public Lapiz(String color, int tamaño, String material) {
        this.color = color;
        this.tamaño = tamaño;
        this.material = material;
    }

    public void mostrar() {
        System.out.println("color: " + this.color);
        System.out.println("tamaño: " + this.tamaño);
        System.out.println("material: " + this.material);
    }
}
