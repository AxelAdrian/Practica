package Clase_151118.Tarea;

public class Test_perro {

    public static void main(String[] args) {
        Perro obj = new Perro();
        obj.setNombre("rocco");
        obj.setRaza("beagle");
        obj.setColor("marron");
        obj.setTipo("macho");

        System.out.println("nombre: " + obj.getNombre());
        System.out.println("raza: " + obj.getRaza());
        System.out.println("color: " + obj.getColor());
        System.out.println("tipo: " + obj.getTipo());
    }

}
