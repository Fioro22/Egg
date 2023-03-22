
package Ejercicios;

import java.util.Scanner;


public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int correcto = 0;
        int incorrecto = 0;
        String frase = "";
        System.out.println("Ingrese una cadena de maximo 5 caracteres");
        
        do {
            frase = leer.nextLine();
            if (frase.equals("&&&&&")) {
                System.out.println("Proceso finalizado.");
                break;
            } else if(frase.length() > 1 && frase.length() < 6 && frase.substring(0, 1).equals("X") && frase.substring(frase.length() -1).equals("O")){   
                correcto++;      
            } else {
                incorrecto++;              
            }
            
        } while (!frase.equals("&&&&&"));
        System.out.println("El codigo se escribio bien: " + correcto + " veces.");
        System.out.println("El codigo se escribio mal: " + incorrecto + " veces.");
        
    
    }

}
