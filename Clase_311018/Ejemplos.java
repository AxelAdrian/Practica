package Clase_311018;

public class Ejemplos {

    public static void main(String[] args) {
        
        int a[]={1,2,3,4,5,6,7,8};//declarar el vector
        System.out.println("Longitud del vector a[] es: " + a.length);
        System.out.println("Valor inicial del vector a[0] es: " + a[0]);
        System.out.println("Valor final del valor num [7] es:" + a[7]);
        System.out.println("sizeof[int] dato entero longitud de = " + Integer.SIZE + " bits o" + Integer.SIZE / 8 + " bytes");
        System.out.println("Posiciones x tipo dato: " + a.length + " posiciones X " + Integer.SIZE / 8 + "bytes = " + (Integer.SIZE / 8) * a.length + "bytes");
    }

}
