
package semana4;

import java.util.Scanner;
public class EjP1 {
    public static void main(String[] args) {
    //Creando el objeto de lectura
    Scanner lectura = new Scanner (System.in);
    //Variables
    int num;
    String palabra;
    //Entrada de datos
    System.out.print("Ingrese un numero del 1 al 5: ");
    num = lectura.nextInt();
    //Proceso de datos
    switch (num) {
        case 1:
            palabra = "uno";
            break;
        case 2:
            palabra = "dos";
            break;
        case 3:
            palabra = "tres";
            break;    
        case 4:
            palabra = "cuatro";
            break;        
        case 5:
            palabra = "cinco";
            break;
        default:
            palabra = "Numero fuera de rango";   
    }
    //Salida de datos
    System.out.println("Numero = "+num);
    System.out.println("Palabra = "+palabra);
        

    
    }
    
}
