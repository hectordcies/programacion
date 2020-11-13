import java.util.Scanner;
public class Ejercicio2 {
   public static void main(String[] args) {
      Scanner lector = new Scanner(System.in);
      boolean validado;
      int hora, minutos, segundos;
      //Pedimos la hora en bucle hasta que el usuario la introduzca correctamente
      do {
         System.out.print("Introduce la hora [0-23]: ");
         hora = Integer.parseInt(lector.nextLine());
         validado = hora >=0 && hora <= 23;
         if(!validado) {
            System.out.println(hora + " no es una hora válida.");
            System.out.println("Escribe la hora en formato 24 horas, por favor.");
         }
      } while (!validado);
      //Pedimos los minutos en bucle hasta que el usuario los introduzca correctamente.
      do {
         System.out.print("Introduce los minutos [0-59]: ");
         minutos = Integer.parseInt(lector.nextLine());
         validado = minutos >= 0 && minutos <= 59;
         if(!validado) {
            System.out.println(minutos + " no está en el rango [0-59]");
            System.out.println("Escribe los minutos correctamente, por favor");
         }
      } while (!validado);
      //Pedimos los segundos en bucle hasta que el usuario los introduzca correctamente
      do {
         System.out.print("Introduce los segundos [0-59]: ");
         segundos = Integer.parseInt(lector.nextLine());
         validado = segundos >= 0 && segundos <= 59;
         if(!validado) {
            System.out.println(segundos + " no está en el rango [0-59]");
            System.out.println("Escribe los segundos correctamente, por favor");
         }
      } while (!validado);
      //Llegados a este punto la hora indicada por el usuario es válida
      //La escribimos en format hh:mm:ss
      System.out.printf("%02d:%02d:%02d es una hora válida\n",hora, minutos, segundos);
   }
}