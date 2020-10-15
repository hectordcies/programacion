import java.util.Scanner;
public class ejer12 {
    public static void main(String [] arg){
        Scanner lector =new Scanner(System.in);
        int dividendo;
        int divisor;
        int resultado = 0;
        System.out.println("escribe un dividendo");
        dividendo =Integer.parseInt(lector.nextLine());
        System.out.println("escribe un divisor");
        divisor = Integer.parseInt(lector.nextLine());
        resultado = dividendo / divisor;
        System.out.println(dividendo + "/" + divisor + "=" + resultado);
        System.out.println("el resultado de la division es:" + resultado);

    }
}
