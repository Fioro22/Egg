
package Ejercicios;

import java.util.Scanner;


public class EjercicioGuia2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero.");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero.");
        int num2 = leer.nextInt();
        System.out.println(num2 + multiplo(num1, num2) + " de " + num1);
        
    }

    public static String multiplo(int num1, int num2){
        String esMultiplo;
        
        if (num2 % num1 == 0) {
            esMultiplo = " es multiplo";
        } else {
            esMultiplo = " no es multiplo";
        }
        
        return esMultiplo;
    }
    
    
}
