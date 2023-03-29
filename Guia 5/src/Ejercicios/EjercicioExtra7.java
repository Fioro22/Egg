
package Ejercicios;

import java.util.Scanner;


public class EjercicioExtra7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        Fibonacci(num);
    }
    public static void Fibonacci(int n){
        int a = 1;
        int b = 1;
        int c = 0;
        
        for (int i = 2; i < n; i++) {
            System.out.print(a+" ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("");
        
    }

}
