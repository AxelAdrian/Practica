package Empleado;

public class Estudiante {

    private String nombre, apellido;
    private int calificacion;

    public Estudiante(String nombre, String apellido, int calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

}
