
package Ejercicios;

import java.util.Scanner;


public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
          
          System.out.println("Ingrese un valor limite positivo");
          
          int valorlimite = leer.nextInt();
          
          int aux = 0;
          
          while (aux < valorlimite ) {
              
              System.out.println("Ingrese un numero");
              
            int num = leer.nextInt();
                    
                    aux += num;
              
                   
            
        } System.out.println(aux);
        
    }

}
