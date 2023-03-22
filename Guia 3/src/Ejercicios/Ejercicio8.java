
package Ejercicios;

import java.util.Scanner;


public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño deñ cuadrado");
        int cuadrado = leer.nextInt();
        
        for (int i = 0; i < cuadrado; i++) {
            for (int j = 0; j < cuadrado; j++) {
                if (i > 0 && i < cuadrado -1 && j > 0 && j < cuadrado -1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                
            } 
            System.out.println("");
        }
    }
}
