import java.util.Scanner;
public class ejer11 {
    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);
        int minuendo;
        int sustraendo;
        int resultado = 0 ;
        System.out.println("dime un minuendo");
        minuendo =Integer.parseInt(lector.nextLine());
        System.out.println("dime un sustraendo");
        sustraendo =Integer.parseInt(lector.nextLine());
        resultado = minuendo - sustraendo;
        System.out.println( minuendo + "-" + sustraendo + "=" + resultado);
        System.out.println("el resultado de la resta es " + resultado);
    }
}
