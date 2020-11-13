import java.util.Scanner;
public class Ejercicio6 {
   public static void main(String[] args) {
      Scanner lector = new Scanner(System.in);
      int numero;
      System.out.println("*** TABLA DE MULTIPLICAR ***");
      //
      do {
         System.out.print("Indica que tabla de multiplicar quieres visualizar [1-10]: ");
         numero = Integer.parseInt(lector.nextLine());
         //Validamos la entrada
         if(numero >= 1 && numero <= 10) { 
            for(int i = 1; i <= 10; i++) {
               System.out.println(numero + " x " + i + " = " + numero*i);
            }      
         } else { // Si no es un número permitido mostramos mensaje
            System.out.println("Por favor, indique un número del 1 al 10");
         }
      } while (numero < 1 || numero > 10); //El bucle hace que volvamos a preguntar al usuario un número en caso que no sea válido
   }
}