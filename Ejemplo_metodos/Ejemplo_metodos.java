package Ejemplo_metodos;

public class Ejemplo_metodos {

    public static void main(String[] args) //metodo principal
    {
        Ejemplo_metodos ob = new Ejemplo_metodos();
        ob.metodoMensaje();
        ob.metodoMensaje2();
        System.out.println("Main ejecutandose");
    }
//metodo void sin parametro sin retorno
    void metodoMensaje() {
        System.out.println("Mostrando mensaje");
    }

    void metodoMensaje2() {
        System.out.println("Mostrando mensaje 2");
    }

}
