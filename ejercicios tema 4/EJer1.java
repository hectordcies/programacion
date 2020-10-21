import java.util.Scanner;
public class EJer1 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        int numero;
        System.out.println("Escribe un numero ");
        numero=Integer.parseInt(lector.nextLine());
        String resultado = numero % 2 == 0 ? " par" : " impar";
        System.out.println("el numero " + numero + " es " + resultado);
        
    }
    
}
