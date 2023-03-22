//Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). 
//El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. Realice dos versiones
//del programa, una usando el bucle “while” y otra con el bucle “do - while”.

package Ejercicios;

import java.util.Scanner;


public class EjercicioExtra7 {
    
    
    

   public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("Cuantos numero ingresara.");
       int num = leer.nextInt();
        int cont = 0;
        int min = 0;
        int max = 0;
        int suma = 0;
        do {
            System.out.println("Ingrese un numero");
            int num2 = leer.nextInt();
            if (cont == 0) {
               min = num2;
               max = num2;
            }
            if (min > num2) {
                min = num2;
            }
            if (max < num2) {
                max = num2;
            }
           cont++;
           suma += num2;
        
       } while (cont != num);
       
       System.out.println("El promedio es de " + suma/num);
       System.out.println("El valor minimo fue " + min);
        System.out.println("El valor maximo fue " + max);
       
       
   }
//        Scanner leer = new Scanner(System.in);
//        System.out.println("Cuantos numero ingresara.");
//        int num = leer.nextInt();
//        int cont = 0;
//        int min = 0;
//        int max = 0;
//        int suma = 0;       
//        while (cont != num) {
//            System.out.println("Ingrese un numero");
//            int num2 = leer.nextInt();
//            if (cont == 0) {
//                min = num2;
//                max = num2;
//            }
//            if (min > num2) {
//                min = num2;
//            }
//            if (max < num2) {
//                max = num2;
//            }
//           cont++;
//           suma += num2;
//        }
//        System.out.println("El promedio es de " + suma/num);
//        System.out.println("El valor minimo fue " + min);
//        System.out.println("El valor maximo fue " + max);
//    }

}
