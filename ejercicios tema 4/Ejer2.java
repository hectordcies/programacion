import java.util.Scanner;
public class Ejer2 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        int numeroUno,numeroDos;
        System.out.println("escribe el primer numero");
        numeroUno = Integer.parseInt(lector.nextLine());
        System.out.println("escribe el segundo numero");
        numeroDos = Integer.parseInt(lector.nextLine());
        if (numeroUno == numeroDos){
            System.out.println(numeroUno + " es igual a " + numeroDos);
			}else if (numeroUno > numeroDos){
            System.out.println(numeroUno + " es mayor a " + numeroDos);
            }else if (numeroUno < numeroDos){
            System.out.println(numeroUno + " es menor a " + numeroDos);
			}
    }
    
}
