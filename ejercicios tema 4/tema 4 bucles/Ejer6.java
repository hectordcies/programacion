import java.util.Scanner;

public class Ejer6 {

    public static void main(String Args[]) {
        
	    Scanner lector = new Scanner(System.in);
        int numero;
        Boolean validando = false;
        do{
        System.out.println("introduce un numero");
        numero = Integer.parseInt(lector.nextLine());
        }while(!validando);
        for (int i = 0; 1 <= 10; i ++){
            System.out.println(numero + " x " + i + " = " + (numero *i));
        }   
    }
}