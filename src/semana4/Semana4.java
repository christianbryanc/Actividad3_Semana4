
package semana4;

import java.util.Scanner;


public class Semana4 {

    public static void main(String[] args) {
    Scanner lectura = new Scanner (System.in);
        
    double n1, n2, r;
    int opcion;
    
    System.out.print("Ingrese un numero: ");
    n1 = lectura.nextDouble();
    System.out.print("Ingrese el siguiente numero: ");
    n2 = lectura.nextDouble();
    System.out.println("1.+");
    System.out.println("2.-");
    System.out.println("3./");
    System.out.println("4.*");
    System.out.print("Elija una opcion del 1 al 4: ");
    opcion = lectura.nextInt();
    r = 0;
    switch (opcion){
        case 1:
            r = n1 + n2;
            break;
        case 2:
            r = n1 - n2;
            break; 
        case 3:
            r = n1 / n2;
            break;
        case 4:
            r = n1 * n2;
            break;    
   
    }
    
        System.out.println("El resultado es: "+r);
    
    
    }
    
}
