
package Ejercicios;

import java.util.Scanner;


public class EjercicioExtra2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Tamaño de los vectores.");
        int n = leer.nextInt();
        int[] vectorA = new int[n];
        int[] vectorB = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor del vector 1: ");
            vectorA[i]= leer.nextInt();
            System.out.print("Ingrese el valor del vector 2: ");
            vectorB[i]= leer.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (vectorA[i] != vectorB[i]) {
                System.out.println("La diferencia esta en " + i);
                return;
            }
        }
        System.out.println("Son iguales.");
        
    }

}
