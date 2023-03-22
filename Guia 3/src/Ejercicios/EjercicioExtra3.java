
//Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.

package Ejercicios;

import java.util.Scanner;


public class EjercicioExtra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una vocal");
        char letra = leer.next().charAt(0);
        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No vocal.");
        }
        
    }

}
