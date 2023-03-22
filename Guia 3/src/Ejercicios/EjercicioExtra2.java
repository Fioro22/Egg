
package Ejercicios;


public class EjercicioExtra2 {

    public static void main(String[] args) {
        int A = 1 ;
        int B = 2;
        int C = 3 ;
        int D = 4;
        int aux = 0;
        
        aux = B;
        B = C;
        C = aux;
        aux = C;
        C = A;
        A = aux;
        aux = A;
        A = D;
        D = aux;
        aux = D;
        
        
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
    }

}
