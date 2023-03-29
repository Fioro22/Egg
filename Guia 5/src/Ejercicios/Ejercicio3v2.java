
package Ejercicios;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio3v2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        double aux = 0;
        int cont;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        System.out.println("De que tamaño quiere hacer el vector?");
        int[] vector = new int[leer.nextInt()];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(99999);
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
        for (int i = 0; i < vector.length; i++) {
            cont = 0;
            do {
                cont++;
                if (cont == 1) {
                    aux = vector[i];
                }
                aux = Math.floor(aux/10);
                
            } while (aux != 0);
            switch (cont) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
            }
        }
        System.out.println("Se encontraton "+cont1+" numeros de 1 digito.");
        System.out.println("Se encontraton "+cont2+" numeros de 2 digito.");
        System.out.println("Se encontraton "+cont3+" numeros de 3 digito.");
        System.out.println("Se encontraton "+cont4+" numeros de 4 digito.");
        System.out.println("Se encontraton "+cont5+" numeros de 5 digito.");
    }

}
