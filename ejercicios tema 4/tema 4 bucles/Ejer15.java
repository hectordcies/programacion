import java.util.Scanner;
public class Ejer15 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        int horas, minutos,segundos,hora=0,minuto=0,segundo=0;
        System.out.println("inserta un numero de hora ( 0 - 23)");
        horas= Integer.parseInt(lector.nextLine());
        System.out.println("inserta un numero de minutos (0 - 59)");
        minutos= Integer.parseInt(lector.nextLine());
        System.out.println("inserta un numero de segundos (0 - 59)");
        segundos =( Integer.parseInt(lector.nextLine()));
        if (horas <= 23 ) {
            System.out.println("la hora  es correcta");
            hora = horas;
        } else {
            System.out.println("la hora  es incorrecta");
        }
        if (minutos <= 59) {
            System.out.println("los minutos son correctos");
            minuto = minutos;
        } else {
            System.out.println("los minutos son incorrectos");
        }
        if (segundos <= 59) {
            System.out.println("los segundos son correctos");
            segundo = segundos;
        } else {
            System.out.println("los segundos son incorrectos");
        } 
        lector.close();
    }
}
