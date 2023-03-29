
package Ejercicios;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("De que tamaño quiere hacer el vector?");
        int n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(10);
            
        }
        System.out.println("Que numero quiere buscar en el vector?");
        int buscar = leer.nextInt();
        int cont= 0;
        for (int i = 0; i < vector.length; i++) {
            
            if (buscar == vector[i]) {
                System.out.println("El numero "+buscar+" se encontro en la posicion "+i+" del vector.");
                
            }
            
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
    }

}
