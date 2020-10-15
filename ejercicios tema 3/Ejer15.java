import java.util.Scanner;
public class Ejer15 {
     public static void main(String [] args){
        Scanner lector = new Scanner(System.in);
        Double kelvin;
        Double Fahrenheit;
        Double celsius;
        System.out.println("inserta la temperatura en grados centígrados.");
        celsius = Double.parseDouble(lector.nextLine());
        kelvin = 273.15 + celsius;
        Fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " grados celsius es igual a " + kelvin + " grados kelvin y " + Fahrenheit + " grados Fahrenheit ");

    }
    
}
