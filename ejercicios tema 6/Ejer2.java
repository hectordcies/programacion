import java.util.Scanner;
public class Ejer2 {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    int area,longitud,radio;
    System.out.println("introduce el radio de la circunferencia");
    radio = Integer.parseInt(lector.nextLine());

    lector.close();
    } 
    public static int area (int radio, int pi ) {
        return Math.PI *(radio*radio);
    }
}
