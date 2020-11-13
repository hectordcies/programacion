import java.util.Scanner;
public class Ejer1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroUno,numeroDos;
        System.out.println("introduce el primer numero ");
        numeroUno = Integer.parseInt(lector.nextLine());
        System.out.println("introduce el segundo numero");
        numeroDos = Integer.parseInt(lector.nextLine());
        System.out.printf("el resultado es ");
        lector.close();
        
        }
     public static int suma (int a , int b){
        return a+b;  
    }
}
