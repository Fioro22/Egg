
package Ejercicios;

import java.util.Random;


public class Ejercicio4 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] matrizTraspuesta = new int[4][4];
        Random rnd = new Random();
        System.out.println("La matriz original es :");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rnd.nextInt(10);
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("La matriz traspuesta es :");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizTraspuesta[i][j] = matriz[j][i];
                System.out.print("["+matrizTraspuesta[i][j]+"]");
            }
            System.out.println("");
        }
        
            
        }
    }


