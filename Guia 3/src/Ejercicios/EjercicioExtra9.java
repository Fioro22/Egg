
package Ejercicios;

import java.util.Scanner;


public class EjercicioExtra9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para dividir.");
        int dividendo = leer.nextInt();
        System.out.println("Ingrese un numero para dividirlo.");
        int divisor = leer.nextInt();
        int cont = 0;
        do {
            cont++;
            dividendo -= divisor;
            
        } while (dividendo >= divisor);
        System.out.println("El resultado de la division es: " + cont);
    }

}
