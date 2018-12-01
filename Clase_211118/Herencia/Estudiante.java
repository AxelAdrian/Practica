package Clase_211118.Herencia;

public class Estudiante extends Personas {

    public String email;
    public double estatura;

    public Estudiante(String email, double estatura, String nombre, int dni) {
        super(nombre, dni);
        this.email = email;
        this.estatura = estatura;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("email= " + this.email);
        System.out.println("estatura= " + this.estatura);
    }

}
