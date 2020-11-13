import java.util.Scanner;

public class Ejer3 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num1 = Integer.parseInt(lector.nextLine());
        System.out.println("introduzca el segundo numer");
        int num2 = Integer.parseInt(lector.nextLine());
        int resultado = 0 ;
        for (int i = 1; i <= num1; i++){
            resultado += num2 ;
        }
        System.out.println("el producto de " + num1 + " y " + num2 + " es " + resultado);
    }
    
}