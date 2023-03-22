//Escriba un programa que lea números enteros. Si el número es múltiplo
//de cinco debe detener la lectura y mostrar la cantidad de números leídos,
//la cantidad de números pares y la cantidad de números impares. Al igual que
//en el ejercicio anterior los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
package Ejercicios;

import java.util.Scanner;


public class EjercicioExtra8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        int par = 0 ;
        int impar = 0;   
        do {
            
            System.out.println("Ingrese un numero");
            int numeros = leer.nextInt();
           
            if (numeros > 0) {
                cont++;
              if (numeros % 5 == 0) {
                
                break;
            }
            if (numeros % 2 == 0) {
                par++;
            } else {
                impar++;
            }  
            }
            
          
        } while (true);
        System.out.println("Cantidad de numeros leidos " + cont);
        System.out.println("Pares " + par);
        System.out.println("Impares " + impar);
    }

}
