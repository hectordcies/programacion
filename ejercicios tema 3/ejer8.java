import java.util.Scanner;
public class ejer8 {
    public static void main(String[]args ){
        int edad;
        Scanner lector= new Scanner(System.in);
        System.out.println("escribe tu edad");
        edad=lector.nextInt();
        lector.nextLine();
        int numerodias= edad * 365;
        System.out.println(numerodias);
    }  
}
