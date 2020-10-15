import java.util.Scanner;
public class Ejer14 {
    public static void main(String [] args){
        Scanner lector =new Scanner(System.in);
        Double radio;
        Double longitud;
        Double area;
        Double diametro;
        System.out.println("dime el radio de una circunferencia");
        radio = Double.parseDouble(lector.nextLine());
        longitud = 2 * 3.14 * radio;
        diametro = radio * 2;
        area = 3.14 * (radio * radio);
        System.out.println("la longitud de la circunferencia es " + longitud);
        System.out.println("el area de la circunferencia es " + area);
    }
}
