
package Ejercicios;

import java.util.Scanner;


public class EjGuia5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        int num;
        do {
            System.out.println("Ingrese un numero entre el 1 y el 20");
            num = leer.nextInt();
            if (num > 0 && num <= 20) {
                cont = cont + 1;
                System.out.print(num + " ");
                for (int i = 0; i < num; i++) {
                    System.out.print("*");
                }
            } else {
                System.out.println("Numero incorrecto.");
            }
            System.out.println("");
        } while(cont != 4);
       
        
    }

}
