import java.util.Scanner;
public class Ejer6 {
      public static void main(String [] args){
        Scanner lector = new Scanner(System.in);
        int euros;
        System.out.println("introduce un cantida de dinero en Euros");
        euros = Integer.parseInt(lector.nextLine());
        switch (euros) {
            case 1:
                System.out.println("2 monedas de 50 Centimos");
                break;
                default:
                System.out.println("No calculado");
        }
        
    }
}
