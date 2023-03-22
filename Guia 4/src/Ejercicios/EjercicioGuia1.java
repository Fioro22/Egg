
package Ejercicios;

import java.util.Scanner;


public class EjercicioGuia1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una frase.");
        String frase = leer.nextLine();
        System.out.println(fraseModificada(frase));
        
    }


    
    public static String fraseModificada(String frase){
        int cont = 0;
        int cont2 = 1;
        String letra;
        String fraseMod = "";
        for (int i = 0; i < frase.length(); i++) {
           letra = frase.substring(cont++, cont2++);
            
            switch (letra) {
                case "a":
                    letra = "@";
                    break;
                case "o":
                    letra = "%";
                    break;
                case "u":
                    letra = "*";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra = "$";
                    break;
                
            }
          fraseMod = fraseMod.concat(letra);  
        }
        
        return fraseMod ;
    
    }
}

