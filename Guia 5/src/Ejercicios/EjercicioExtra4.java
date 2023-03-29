
package Ejercicios;

import java.util.Scanner;


public class EjercicioExtra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[] promedio = new double[10];
        int[][] matriz = new int[10][4];
        int aprobados = 0;
        int desaprobados = 0;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                switch (j) {
                    case 0:
                        System.out.println("Ingrese la nota del primer trabajo practico del alumno "+(i+1));
                        matriz[i][j] = leer.nextInt();
                        break;
                    case 1:
                        System.out.println("Ingrese la nota del segundo trabajo practico del alumno "+(i+1));
                        matriz[i][j] = leer.nextInt();
                        break;
                    case 2:
                        System.out.println("Ingrese la nota del primer integrador del alumno "+(i+1));
                        matriz[i][j] = leer.nextInt();
                        break;
                    case 3:
                        System.out.println("Ingrese la nota del segundo integrador del alumno "+(i+1));
                        matriz[i][j] = leer.nextInt();
                        break;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                switch (j) {
                    case 0:
                        promedio[i] += matriz[i][j] * 0.10;
                        break;
                    case 1:
                        promedio[i] += matriz[i][j] * 0.15;
                        break;
                    case 2:
                        promedio[i] += matriz[i][j] * 0.25;
                        break;
                    case 3:
                        promedio[i] += matriz[i][j] * 0.50;
                        break;
                }
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("["+promedio[i]+"]");
            if (promedio[i] >= 7) {
                aprobados++; 
            } else {
                desaprobados++;
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("La cantidad de aprobados fue de: "+aprobados);
        System.out.println("La cantidad de desaprobados fue de: "+desaprobados);
    }

}
