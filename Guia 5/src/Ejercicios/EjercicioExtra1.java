
package Ejercicios;

import java.util.Scanner;


public class EjercicioExtra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Tamaño del vector");
        int n = leer.nextInt();
        int suma = 0;
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingre un numero para sumar.");
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        System.out.println("El resultado de la suma del vector es : "+suma);

        
    }

}
