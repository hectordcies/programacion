import java.util.Scanner;
public class Ejer4 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        int numeroUno, numeroDos;
        System.out.println("intruduce un numero");
        numeroUno = Integer.parseInt(lector.nextLine());
        System.out.println("untroduce otro numero");
        numeroDos = Integer.parseInt(lector.nextLine());
        if (numeroUno < numeroDos){
        System.out.println(numeroUno + " "+ numeroDos);
        }else {
        System.out.println(numeroDos  + " " +  numeroUno);
        }
    }
}