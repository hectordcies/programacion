import java.util.Scanner;
public class beca {
   public static void main(String[]args){
    Scanner lector = new Scanner(System.in);
    int edad ;
    double sueldo ;
    System.out.println("dime tu edad");
    edad = Integer.parseInt(lector.nextLine());
    System.out.println("dime tu sueldo neto anual");
    sueldo = Double.parseDouble(lector.nextLine());
    if(edad>=18 && sueldo < 15000)
        System.out.println("puedes solicitar la beca");
    else
        System.out.println("No puedes solicitar la beca");

   }
}
