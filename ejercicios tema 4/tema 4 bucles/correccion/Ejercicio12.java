import java.util.Scanner;
import java.util.Random;
public class Ejercicio12 {
   public static void main(String[] args) {
      int intentos;
      int aleatorio;
      int apuesta;
      Random r = new Random();
      Scanner lector = new Scanner(System.in);
      boolean acertado = false;
      aleatorio = r.nextInt(100 - 1 + 1) + 1;
      System.out.print("Introduce el número máximo de intentos: ");
      intentos = Integer.parseInt(lector.nextLine());
      do {
         System.out.print("Introduce tu apuesta: ");
         apuesta = Integer.parseInt(lector.nextLine());
         intentos--;
         if(apuesta > aleatorio) {
            System.out.println("El número es menor que " + apuesta);
            System.out.println("Te quedan " + intentos + " intentos.");
         } else if (apuesta < aleatorio) {
            System.out.println("El número es mayor que " + apuesta);
            System.out.println("Te quedan " + intentos + " intentos.");
         } else {
            acertado = true;
            System.out.println("Enhorabuena!! Acertaste!!");
         }
      } while(intentos > 0 && !acertado);
      if(!acertado) {
         System.out.println("Game Over. El número era " +aleatorio);
      }   
   }
}