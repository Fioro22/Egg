
package Ejercicios;

import java.util.Scanner;


public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("A continuacion vamos a validar las edades de las personas.");
        String esMayor = "";
        validarEdad(esMayor);
        
    }
public static void validarEdad(String cadena){
    Scanner leer = new Scanner(System.in);
    int edad= 0;
    String nombre = "";
    String respuesta= "";
    do {
        System.out.println("Nombre?");
        nombre = leer.next();
        System.out.println("Que edad tiene " + nombre + "?");
        edad = leer.nextInt();
        
        if (edad >= 18) {
            System.out.println(nombre + " tiene " + edad + " años. Es mayor de edad.");
        } else {
            System.out.println(nombre + " tiene " + edad + " años. Es menor de edad.");
        }
        
        System.out.println("Quiere seguir validando edades? SI/NO");
        respuesta = leer.next();
        while (!respuesta.equalsIgnoreCase("SI") && !respuesta.equalsIgnoreCase("NO")) {
            System.out.println("Respuesta no valida. Quiere seguir validando edades? SI/NO");
            respuesta = leer.next();
        }
   
        
        
    } while (!respuesta.equalsIgnoreCase("NO"));
        
}
}
    



