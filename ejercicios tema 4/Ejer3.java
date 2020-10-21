  
import java.util.Scanner;
public class Ejer3 {
    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);
        int edad;
        System.out.println("inserta tu edad");
        edad = Integer.parseInt(lector.nextLine());
        if (edad > 18) {
            System.out.println("eres mayor de edad");
        } else {
            System.out.println("eres menor de edad");
        }

    }
}