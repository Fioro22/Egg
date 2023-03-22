
package Ejercicios;

import java.util.Scanner;


public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
          
          System.out.println("Ingrese dos numeros enteros");
          
          int num1 = leer.nextInt();
          int num2 = leer.nextInt();
          String respuesta = "N";
          
          
          do {
              System.out.println("MENU");
          System.out.println("1. SUMAR");
          System.out.println("2. RESTAR");
          System.out.println("3. MULTIPLICAR");
          System.out.println("4. DIVIDIR");
          System.out.println("5. SALIR");
          System.out.println("ELIJA OPCIÓN");
            
          int opcion = leer.nextInt();
          
              switch (opcion) {
                  case 1: 
                      System.out.println("La suma de los numeros es: " + (num1 + num2));
                      
                      break;
                  case 2:
                      System.out.println("La resta de los numeros es: " + (num1 - num2));
                      break;
                  case 3:
                      System.out.println("La multiplicación de los numeros es: " + (num1 * num2));
                      break;
                  case 4:
                      System.out.println("La división de los numeros es: " + (num1 / num2));
                      break;
                  case 5:
                      System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                      
                     respuesta = leer.next();
                     
                      break;
                  default: System.out.println("No es una opcion correcta");
              }
                  
        } while (respuesta.equalsIgnoreCase("N"));
        
          
        }
        }