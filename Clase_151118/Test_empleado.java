package Clase_151118;

public class Test_empleado {

    public static void main(String[] args) {
        Empleado obj = new Empleado();
        obj.setNombre("axel");
        obj.setGenero('m');
        obj.setNacimiento("01-07-91");
        obj.setProfesion("programador");

        System.out.println("nombre: " + obj.getNombre());
        System.out.println("genero: " + obj.getGenero());
        System.out.println("nacimiento: " + obj.getNacimiento());
        System.out.println("profesion: " + obj.getProfesion());
    }

}
