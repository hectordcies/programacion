import java.util.Scanner;
public class Ejercicio8 {
   public static void main(String[] args) {
      Scanner lector = new Scanner(System.in);
      int n;
      long factorial = 1;
      System.out.println("*** CÁCULO DEL FACTORIAL ***");
      System.out.print("Indica el número: ");
      n = Integer.parseInt(lector.nextLine());
      if(n >= 0) {
         for(int i = 1; i <= n; i++) {
            factorial = factorial * i;
         }
         System.out.println("El factorial de " + n + " es "+ factorial);
      } else {
         System.out.println("No se puede calcular el factorial de un número negativo");
      }
   }
}