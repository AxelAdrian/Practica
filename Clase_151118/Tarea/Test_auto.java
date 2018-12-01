package Clase_151118.Tarea;

public class Test_auto {

    public static void main(String[] args) {
        Auto obj = new Auto();
        obj.setColor("rojo");
        obj.setMarca("ford");
        obj.setCc(300);
        obj.setPeso(1000);
        obj.setPatente(123456);
        System.out.println("marca: " + obj.getMarca());
        System.out.println("color: " + obj.getColor());
        System.out.println("cc: " + obj.getCc());
        System.out.println("peso: " + obj.getPeso());
        System.out.println("patente: " + obj.getPatente());
    }

}
