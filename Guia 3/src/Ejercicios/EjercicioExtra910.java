
package Ejercicios;

import java.util.Scanner;


public class EjercicioExtra910 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = (int) (Math.random()*10+0) * (int) (Math.random()*10+0);
        int respuesta;
        System.out.println("Adivine el numero.");
        System.out.println(num);
        do {
            respuesta = leer.nextInt();
            if (num == respuesta) {
                System.out.println("Adivinaste!");
                break;
            } else {
                System.out.println("Numero incorrecto. Intentalo nuevamente.");
            }
        } while (true);
        
    }

}
