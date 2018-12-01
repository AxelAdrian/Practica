package Clase_141118;

public class Test_empleado {

    public static void main(String[] args) {
        Empleado obj = new Empleado();
        obj.nombre = "axel";
        obj.apellido = "dojas";
        obj.legajo = 123456;
        obj.sueldo = 30000;

        System.out.println("nombre: " + obj.nombre);
        System.out.println("apellido: " + obj.apellido);
        System.out.println("legajo: " + obj.legajo);
        System.out.println("sueldo: " + obj.sueldo);
    }

}
