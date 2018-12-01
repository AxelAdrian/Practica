/*
Metodos con retorno de datos
 */
package Ejemplo_metodos.Ejercicio6;

public class DatosPersona {

    String nombre; //atributo de la clase datos persona
    //metodo para dar nombre

    public void DameNombre(String nom) //parametro del metodo Dame nombr
    {
        nombre = nom;
    }
    public String devuelveNombre()
    {
    return nombre;
    }
}
