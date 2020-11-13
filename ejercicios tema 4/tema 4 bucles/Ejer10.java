import java.util.Scanner;
public class Ejer10 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        int numero , suma = 0 , resultado ;
        do {
            System.out.println("introduce un numero");
            numero = lector.nextInt();
            suma = suma + numero;
        } while (numero > 0);
        System.out.println("el resultado de la suma es : " + suma);
        
    }
    
}
