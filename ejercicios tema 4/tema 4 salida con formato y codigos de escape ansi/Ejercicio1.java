import java.util.Scanner;
public class Ejercicio1 {
   public static void main(String[] args) {
      Scanner lector = new Scanner(System.in);
      float n;      
      System.out.print("Introduce un número real: ");
      n = Float.parseFloat(lector.nextLine());
      System.out.printf("%.2f\n",n);
   }
}