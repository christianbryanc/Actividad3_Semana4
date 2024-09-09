
package semana4;

import java.util.Scanner;
public class EJ3 {
    public static void main(String[] args) {
    //Creando el objeto de lectura
    Scanner lectura = new Scanner (System.in);
    //Variables
    int num;
    String ingles;
    //Entrada de datos
    System.out.print("Ingrese un numero del 1 al 6: ");
    num = lectura.nextInt();
    //Proceso de datos
    ingles = "";
    switch (num) {
        case 1: ingles = "one"; break;
        case 2: ingles = "two"; break;
        case 3: ingles = "three"; break;    
        case 4: ingles = "four"; break;        
        case 5: ingles = "five"; break;
        case 6: ingles = "six"; break;   
    }
    //Salida de datos
    System.out.println("Numero = "+num);
    System.out.println("Ingles = "+ingles);
 
    
  }



}
