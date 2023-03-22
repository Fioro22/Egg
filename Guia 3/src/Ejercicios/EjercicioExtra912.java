
package Ejercicios;


public class EjercicioExtra912 {

    public static void main(String[] args) {
        String paraI;
        String paraJ;
        String paraK;
        
        
        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 10; j++) {
                
                for (int k = 0; k < 10; k++) {
                    paraI = Integer.toString(i);
                    paraJ = Integer.toString(j);
                    paraK = Integer.toString(k);
                    System.out.println(paraI.replace("3", "E") + " - " + paraJ.replace("3", "E") + " - " + paraK.replace("3", "E"));
                }
            }
        }   
    }
}
    
    



