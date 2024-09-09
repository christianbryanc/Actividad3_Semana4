
package semana4;

import java.util.Scanner;
public class EjP4 {
    public static void main(String[] args) {
    //Creando el objeto de lectura
    Scanner lectura = new Scanner(System.in);
    //Variables
    int num;
    String periodo;
    //Entrada de datos
    System.out.print("Ingrese un numero (1, 2, 3, 4, 6, 12): ");
    num = lectura.nextInt();
    //Proceso de datos
    periodo = "";
    switch (num) {
        case 1: periodo = "mensual"; break;
        case 2: periodo = "bimestral"; break;
        case 3: periodo = "trimestral"; break;
        case 4: periodo = "cuatrimestral"; break;
        case 6: periodo = "semestral"; break;
        case 12: periodo = "anual"; break;          
        }
    //Salida de datos
    System.out.println("Periodo: "+periodo);    
    }
    
}
