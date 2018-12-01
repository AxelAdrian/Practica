package Clase_141118;

public class Test_Persona {

    public static void main(String[] args) {
        Persona per1 = new Persona(); //variable de referencia;
        //inicializando

        per1.nombre = "axel";
        per1.apellido = "dojas";
        per1.dni = 36170918;

        Persona per2 = new Persona();

        per2.nombre = "vicky";
        per2.apellido = "martinez";
        per2.dni = 34949895;

        System.out.println("El nombre es: " + per1.nombre);
        System.out.println("El apellido es: " + per1.apellido);
        System.out.println("Dni: " + per1.dni);
        System.out.println("");
        System.out.println("El nombre es: " + per2.nombre);
        System.out.println("El apellido es: " + per2.apellido);
        System.out.println("Dni: " + per2.dni);

    }

}
