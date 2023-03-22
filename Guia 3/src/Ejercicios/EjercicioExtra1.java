
package Ejercicios;

import java.util.Scanner;


public class EjercicioExtra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos.");
        int minIniciales, minutos, horas, dias;
        minIniciales = leer.nextInt();
        minutos = minIniciales % 60;
        horas = minIniciales / 60;
        dias = horas / 24;
        horas = horas % 24;
        System.out.println(minIniciales + " minutos equivalen a : " + dias + " dias " + horas + " horas " + minutos + " minutos.");
        
    }

}
