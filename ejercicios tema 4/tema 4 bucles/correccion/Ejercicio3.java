import java.util.Scanner;
public class Ejercicio3 {
   public static void main(String[] args) {
      Scanner lector = new Scanner(System.in);
      int a;
      int b;
      int producto = 0;
      System.out.println("*** PRODUCTO CON SUMAS ***");
      System.out.print("Indica el primer número: ");
      a = Integer.parseInt(lector.nextLine());
      System.out.print("Indica el segundo número: ");
      b = Integer.parseInt(lector.nextLine());
      /**
       * El producto de  a x b puede calcularse de dos formas:
       * - Sumar a veces b
       * - Sumar b veces a
       */
      //En este caso sumanos a veces b
      for(int i = 1; i <= a; i++) { //Este bucle se ejecutará a veces
         producto = producto + b; //Acumulamos en producto a la suma de b
      }
      System.out.print(a + " x " + b + " = " + producto + ". ");
      System.out.println("Calculado sumando " + a + " veces " + b);
   }
}