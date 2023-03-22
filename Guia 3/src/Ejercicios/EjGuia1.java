
package Ejercicios;

import java.util.Scanner;


public class EjGuia1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros.");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25){
            System.out.println("Ambos numeros son mayor a 25");
        } else if (num1 > 25 || num2 > 25){
            System.out.println("Un numero es mayor a 25");
        } else {
            System.out.println("Ningun numero es mayor a 25.");    
    }
    }
}
