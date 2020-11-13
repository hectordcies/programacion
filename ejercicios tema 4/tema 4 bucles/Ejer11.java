import java.util.Scanner;
public class Ejer11 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        int numero , suma = 0  , numeros = 0;
        do {
            System.out.println("introduce un numero");
            numero = lector.nextInt();
            numeros = numero ++;
            
            
        } while (numero >= 0);
        System.out.println("el resultado de la suma es : " + suma);
        System.out.println("la media de todos los numeros es " + numeros);
        
    }
    
}
