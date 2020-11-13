import java.util.Scanner;
public class Ejercicio11 {
   public static void main(String[] args) {
      float suma = 0;
      float num;
      int cont = 0;
      Scanner lector = new Scanner(System.in);
      do {
         System.out.print("Introduce un número: ");
         num = Integer.parseInt(lector.nextLine());
         if(num >= 0) {
            suma += num;
            cont++;
         }
      } while (num >= 0);
      System.out.println("La media de los números introducidos es: " + suma/cont);
   }
}