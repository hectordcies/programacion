import java.util.Scanner;
public class Ejer5 {
    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);
        Double nota;
        System.out.println("inserta la calificación");
        nota = Double.parseDouble(lector.nextLine());
        if (nota <= 4) 
            System.out.println("INSUFICIENTE");
         else if (nota <= 6 )
         System.out.println("SUFICIENTE");
         else if (nota <= 7)
         System.out.println("BIEN");
         else if (nota <= 9)
         System.out.println("NOTABLE");
         else if (nota <= 10 )
         System.out.println("SOBRESALIENTE");
         else 
         System.out.println("ERROR");
        

    }
    
}
