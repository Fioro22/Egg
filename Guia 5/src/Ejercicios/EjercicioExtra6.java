
package Ejercicios;

import java.util.Random;
import java.util.Scanner;


public class EjercicioExtra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        char[][] sopaDeLetras = new char[20][20];
        String[] palabras = new String[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese una palabra de minimo 3 letras y maximo 5.");
            palabras[i] = leer.nextLine().toUpperCase();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 letras. Intentelo de nuevo ");
                palabras[i] = leer.nextLine().toUpperCase();
            } 
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopaDeLetras[i][j] = (char) (rnd.nextInt(26) + 'A');
            }
        }
        
        int fila;
        int columna;
        for (int i = 0; i < 5; i++) {
            fila = rnd.nextInt(sopaDeLetras.length);
            columna = rnd.nextInt(sopaDeLetras.length)-5;
            for (int j = 0; j < palabras[i].length(); j++) {
                sopaDeLetras[fila][columna++] =palabras[i].charAt(j);
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("["+sopaDeLetras[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
    }

}
