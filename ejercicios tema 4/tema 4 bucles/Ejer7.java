import java.util.Scanner;
public class Ejer7 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        int real = 0 ,entero = 0 ;
        System.out.println("dime un numero real");
        real = Integer.parseInt(lector.nextLine());
        System.out.println("dime un numero entero");
        entero = Integer.parseInt(lector.nextLine());
        long resultado = 1;
        for (int i = 1; i <= entero; i++){
            resultado *= real;
        }
        System.out.println("el resultado de " + real + "^" + entero + " es " + resultado);
    }
}
