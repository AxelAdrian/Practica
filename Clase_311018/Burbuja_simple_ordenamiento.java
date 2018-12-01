package Clase_311018;

public class Burbuja_simple_ordenamiento {

    public static void main(String[] args) 
    {
        int vector[] = {34, 78, 36, 23, 14, 11, 45, 56};
        int i, j;
        int aux;//variable aux temporal
        //***METODO BURBUJA****
        for (i = 0; i < vector.length - 1; i++) //pasadas segun largo
        {
            for (j = 0; j < vector.length - i - 1; j++) //decrece cant indice
            {
                if (vector[j] > vector[j + 1]) //comparar valores
                
                /*Swapping*/
                {
                    
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
        for (i = 0; i < vector.length; i++) 
        {
            System.out.println("la nueva posicion [" + i + "] = " + vector[i]);
        }
    }

}
