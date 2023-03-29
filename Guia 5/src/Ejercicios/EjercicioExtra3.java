
package Ejercicios;

import java.util.Random;
import java.util.Scanner;


public class EjercicioExtra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        llenar(vector, n);
        imprimir(vector, n);
    }
    public static void llenar(int[] vector1, int n){
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            vector1[i] = rnd.nextInt(10);
        }
        
       
    }
    public static void imprimir(int[] vector1, int n){
        for (int i = 0; i < n; i++) {
            System.out.print("["+vector1[i]+"]");
        }
        System.out.println("");
       
        
    }

}
