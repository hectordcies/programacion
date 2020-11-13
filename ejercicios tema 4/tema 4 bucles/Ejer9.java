import java.util.Scanner;
public class Ejer9 {
public static void main(String args []){
    Scanner lector = new Scanner(System.in);
    int contador = 2;
    int numero;
    System.out.println("introduce un numero" );
    numero = Integer.parseInt(lector.nextLine());
    boolean primo=true;
    while ((primo) && (contador!=numero)){
      if (numero % contador == 0)
        primo = false;
      contador++;
        System.out.println(numero + " es primo " );
    }
    
  }
}  