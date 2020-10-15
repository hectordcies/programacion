import java.util.Scanner;
public class Ejer16 {
    public static void main(String [] args){
        Scanner lector =new Scanner(System.in);
        Double euros;
        Double dolares;
        Double libras;
        System.out.println("inserta la cantidad en Euros que deseas transformar ");
        euros = Double.parseDouble(lector.nextLine());
        dolares = euros * 1.1750;
        libras = euros * 0.9019;
        System.out.println(euros + "€ son " + libras + "£ libras " + euros + "€ son " + dolares + "$ dolares");
    }
    
}
