package Ejemplos01;

public class perfumes {

    public static void main(String[] args) {
        int blanco = 20;
        int agua = 50;
        int azul = 60;
        
        int cantblanco;
        int cantagua;
        int cantazul;
        
        //calculo
        cantblanco = blanco * 28;
        cantagua = agua * 35;
        cantazul = azul * 40;
        
        //impresion
        System.out.println("La cantidad de perfume blanco en 28 frascos es: "+cantblanco+" cl");
        System.out.println("La cantidad de perfume agua en 35 frascos es: "+cantagua+" cl");
        System.out.println("La cantidad de perfume azul en 40 frascos es: "+cantazul+" cl");
    }
    
}
