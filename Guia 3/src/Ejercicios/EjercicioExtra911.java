
package Ejercicios;

import java.util.Scanner;


public class EjercicioExtra911 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double numero = leer.nextInt();
        int cont = 0;
        do {
            cont++;
            numero = Math.floor(numero /10);
            
        } while (numero != 0);
        System.out.println(cont);
    }

}
