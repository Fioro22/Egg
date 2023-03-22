//Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.

package Ejercicios;

import java.util.Scanner;


public class EjercicioExtra6 {

  public static void main(String[] args) {
             Scanner leer = new Scanner(System.in);
             
             System.out.println("Ingrese el numero de personas a medir");
             
             double nump = leer.nextDouble();
             
             double suma = 0;
             double sumab = 0;
             double contador = 0;
                     
             for (int i = 0; i < nump; i++) {
                 System.out.println("Ingrese la altura");
                 
                 double altura = leer.nextDouble();
                 
                 suma += altura;
                 
                 if (altura < 1.60) {
                     sumab += altura;
                     contador ++;
                 }
                
                 
        }
         System.out.println("El promedio general es: " + suma/nump);
                 System.out.println("El promedio menor a 1.60mts es: " + sumab/contador);
  }
}