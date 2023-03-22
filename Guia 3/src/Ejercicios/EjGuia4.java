
package Ejercicios;

import java.util.Scanner;


public class EjGuia4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        int num;
        int suma = 0;
        
        do {
            System.out.println("Ingrese un numero para sumar");
            num = leer.nextInt();
            if (num == 0){
                System.out.println("Se capturo el numero 0.");
                break;
            } else if(num >= 0){
                suma = suma + num;   
            }
            cont = cont + 1;
        } while (cont != 20);
        if (num == 0){
            System.out.println("La suma de los numeros ingresados es de: " + suma);
        }
    }

}
