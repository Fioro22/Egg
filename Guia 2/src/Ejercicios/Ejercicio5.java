//Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
package Ejercicios;

import java.util.Scanner;


public class Ejercicio5 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        double numero = leer.nextDouble();
        System.out.println(numero * 2);
        System.out.println(numero * 3);
        System.out.println(Math.sqrt(numero));
  
    }
    
}
