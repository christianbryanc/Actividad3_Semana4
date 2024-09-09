
package semana4;

import java.util.Scanner;


public class EjP2 {
    public static void main(String[] args) {
    //Creando el objeto de lectura
    Scanner lectura = new Scanner (System.in);
    //Variables
    int num;
    String romano;
    //Entrada de datos
    System.out.print("Ingrese un numero del 1 al 10: ");
    num = lectura.nextInt();
    //Proceso de datos
    switch (num) {
        case 1: romano = "I"; break;
        case 2: romano = "II"; break;
        case 3: romano = "III"; break;    
        case 4: romano = "IV"; break;        
        case 5: romano = "V"; break;
        case 6: romano = "VI"; break;
        case 7: romano = "VII"; break;
        case 8: romano = "VIII"; break;    
        case 9: romano = "IX"; break;        
        case 10: romano = "X"; break;
        default:
            romano = "Numero fuera de rango";
    }
    //Salida de datos
    System.out.println("Numero = "+num);
    System.out.println("Romano = "+romano);
    
        
    }
    
}
