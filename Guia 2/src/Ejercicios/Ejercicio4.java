//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
package Ejercicios;

import java.util.Scanner;


public class Ejercicio4 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese grados centigrados");
        double c = leer.nextDouble();
        double f = 32 + (9 * c / 5);
        System.out.println("Equivale a " + f + " grados Fahrenheit.");
    }    
}
