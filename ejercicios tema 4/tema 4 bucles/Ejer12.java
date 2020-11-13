import java.util.Scanner;
import java.util.Random;
public class Ejer12 {
    public static void main(String args []){
        Scanner lector = new Scanner(System.in);
        Random r = new Random();
        int numeroIn, numeroResolver = 0 , intentos, contador =0;
        boolean ganado= false;
        numeroResolver= r.nextInt(100-1 + 1);
        
        //System.out.println(numeroResolver);
        System.out.println("escribe el numero de intentos ");
        intentos = Integer.parseInt(lector.nextLine());
        System.out.println("introduce un numero aleatorio entre  1 y 100" );
        do {
            
            numeroIn = Integer.parseInt(lector.nextLine());
            contador ++;
            
            if (numeroIn > numeroResolver) {
                System.out.println("el numero es menor ");
            }else if (numeroIn < numeroResolver) {
                System.out.println("el numero es mayor");
            }if (numeroIn == numeroResolver) {
                System.out.println("has ganado ");
                ganado=true;
            }
            if (!ganado) {
                System.out.println("introduce otro numero");
            }
            
        }while (!ganado && contador < intentos);
        
        System.out.println("has perdido");
        System.out.println("el numero random era " + numeroResolver);
        lector.close();
    }
}
