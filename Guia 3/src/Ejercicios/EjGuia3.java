
package Ejercicios;

import java.util.Scanner;


public class EjGuia3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nota.");
        int nota = leer.nextInt();
        while (nota > 10 || nota < 0) {
            System.out.println("Nota incorrecta. Ingrese nuevamente su nota.");
            nota = leer.nextInt();
        }
        
    }

}
