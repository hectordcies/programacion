import java.util.Scanner;
public class Ejercicio7 {
   public static void main(String[] args) {
      //La base
      float a;
      //El exponente
      int b;
      boolean potenciaNegativa = false;
      float potencia = 1;      
      Scanner lector = new Scanner(System.in);      
      System.out.println("*** CÁLCULO DE POTENCIAS ***");
      System.out.print("Indica la base: ");
      a = Integer.parseInt(lector.nextLine());
      System.out.print("Indica el exponente: ");
      b = Integer.parseInt(lector.nextLine());
      if(b < 0) {
         potenciaNegativa = true;
         //Le cambiamos el signo para que no nos moleste
         b = b * (-1);
      }      
      //Hacemos el cálculo de la potencia
      for(int i = 1; i <= b; i++) {
         potencia = potencia * a;
      }
      //Si la potencia era negativa tenemos que calcular la inversa
      if(potenciaNegativa) {
         potencia = 1/potencia;
      }
      System.out.println("El resultado de " + a + " elevado a " + b + " es " + potencia);
   }
}