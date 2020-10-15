import java.util.Scanner;
public class ejemplo2 {
    public static void main(String args[]);{
        Scanner lector = new Scanner(System.in);
        int edad;
        System.out.println("dime tu edad");
        edad = lector.nextInt();
        System.out.println("tienes " + edad + " años");
    }
}
