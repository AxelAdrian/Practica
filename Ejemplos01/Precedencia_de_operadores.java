
package Ejemplos01;

public class Precedencia_de_operadores {


    public static void main(String[] args) {
        //Si una camisa vale 1000$, obtener el total a pagar, si se
        //le aplica un 50% de descuento, y se le agrega el 20% de impuestos.
        
        double camisa = 1000;
        double descuento = 1000*0.5;
        double impuesto = 1000*0.2;
        double total = camisa-descuento+impuesto;
        
//double camisa=1000;
//double total=camisa*0.5+0.2*camisa;
        
        System.out.println("Camisa="+camisa);
        System.out.println("Descuento= "+descuento);
        System.out.println("Impuesto= "+impuesto);
        System.out.println("El total a pagar es:"+total);
        
 
    }
    
}
