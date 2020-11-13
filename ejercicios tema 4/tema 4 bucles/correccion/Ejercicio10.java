import java.util.Scanner;
public class Ejercicio10 {
   public static void main(String[] args) {
      float suma = 0;
      float num;
      Scanner lector = new Scanner(System.in);
      do {
         System.out.print("Introduce un número: ");
         num = Integer.parseInt(lector.nextLine());
         suma += num;
      } while (num != 0);
      System.out.println("La suma de los números introducidos es: "+suma);
   }
}