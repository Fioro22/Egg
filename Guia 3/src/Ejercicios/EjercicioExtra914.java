
package Ejercicios;

import java.util.Scanner;


public class EjercicioExtra914 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cantidad de familias.");
        int familias = leer.nextInt();
        int cont = 0;
        int sumaEdades = 0;
        for (int i = 1; i < familias + 1; i++) {
            System.out.println("Cuantos hijos tiene la familia " + i);
            int hijos = leer.nextInt(); 
            cont = cont + hijos;
            for (int j = 1 ; j < hijos + 1; j++) {
                
                System.out.println("Ingrese la edad de los hijos de la familia " + i );
                int edades = leer.nextInt();
                sumaEdades += edades;
                
            }
        }
        System.out.println("El promedio de edades entre todas las familias es de: " + sumaEdades / cont);
    }
    

}
