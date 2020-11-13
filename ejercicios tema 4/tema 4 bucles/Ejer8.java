import java.util.Scanner;
public class Ejer8 {
  public static void main(String args[]){
      Scanner lector = new Scanner(System.in);
      int numero;
      int factorial = 1 ;
      System.out.println("dime un numero ");
      numero = Integer.parseInt(lector.nextLine());
     while (numero!=0){
       factorial = factorial*numero;
       numero--;
       System.out.println(factorial);
     }
  }  
}
