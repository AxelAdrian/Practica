package Clase_151118;

public class Test_lapiz1 {

    public static void main(String[] args) {
        Lapiz1 s = new Lapiz1();
        s.setColor("amarillo");
        s.setTamaño(5);
        s.setMaterial("plastico");
        
        System.out.println("color: " + s.getColor());
        System.out.println("tamaño: "+s.getTamaño());
        System.out.println("material: "+s.getMaterial());
    }

}
