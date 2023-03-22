
package Ejercicios;

import java.util.Scanner;


public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        System.out.println(primo(num));
    }
    public static boolean primo(int num) {
        boolean primo1 = false;
        int cont = 0;
 
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
           
        }
        
        if (cont == 2) {
            primo1 = true;
        }
        if (num <= 1) {
            primo1 = false;
        }
        
        return primo1;
    }
}
