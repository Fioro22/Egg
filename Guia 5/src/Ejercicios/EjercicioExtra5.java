
package Ejercicios;

import java.util.Random;
import java.util.Scanner;


public class EjercicioExtra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Ingrese la cantidad de filas.");
        int n = leer.nextInt();
        System.out.println("Ingrese la cantidad de columnas.");
        int m = leer.nextInt();
        int[][] matriz = new int[n][m];
        int suma = 0;
        System.out.println("");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = rnd.nextInt(10);
                suma += matriz[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("La suma de todos los elementos es de: "+suma);
  
    }

}
