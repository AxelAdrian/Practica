package ArrayObjetos;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        String nombre, apellido;
        int clave;
        System.out.println("tamaño el arreglo");
        Scanner sc = new Scanner(System.in);
        int tamanio = sc.nextInt();
        Persona personas[] = new Persona[tamanio];
        System.out.println("************");
        for (int i = 0; i < personas.length; i++) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("nombre: ");
            nombre = sc1.nextLine();
            System.out.println("apellido: ");
            apellido = sc1.nextLine();
            System.out.println("clave: ");
            clave = sc1.nextInt();
            personas[i] = new Persona(nombre, apellido, clave);
            System.out.println("******************");
        }
        System.out.println("****************");
        for (Persona persona : personas) {
            System.out.println("nombre: " + persona.getNombre() + "\napellido: " + persona.getApellido() + "\nclave: " + persona.getClave());
        }

    }
}


