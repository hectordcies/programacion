import java.util.Random;
public class Ejercicio13 {
   public static void main(String[] args) {
      final int N_LANZAMIENTOS = 1000000;      
      Random r = new Random();
      int moneda;
      int caras = 0, cruces = 0;
      for(int i = 1; i <= N_LANZAMIENTOS; i++) {
         //r.nextInt(max - min + 1) + min;
         //Lanzamiento de moneda max = 1, min = 0. 
         // 0 CARA
         // 1 CRUZ 
         moneda = r.nextInt(1 - 0 + 1) + 0; 
         //En este caso no era necesaria la fórmula, podríamos haber hecho r.nextInt(1) que devuelve [0-1]         
         switch(moneda) {
            case 0:
               caras++;
               break;
            case 1:
               cruces++;
               break;
         }
      }
      System.out.println("Han salido " + caras + " caras (" + caras*100f/N_LANZAMIENTOS + "%)");
      System.out.println("Han salido " + cruces + " cruces (" + cruces*100f/N_LANZAMIENTOS + "%)");
   }
}