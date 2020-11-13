import java.util.Scanner;
public class Ejercicio9 {
   public static void main(String[] args) {    
      final String ROJO_ANSI = "\u001B[1;31m";  
      final String VERDE_ANSI = "\u001B[1;32m";
      final String AMARILLO_ANSI = "\u001B[1;33m";
      final String AZUL_ANSI = "\u001B[1;34m";
      final String MAGENTA_ANSI = "\u001B[1;35m";
      final String RESET_ANSI = "\u001B[0m";

      Scanner lector = new Scanner(System.in);
      String ciudad;
      int dia, mes, anyo;
      int hora, minutos, segundos;
      int velocidadViento;
      float temperatura;
      float presion;
      int pLluvia;
      int uvi;
      String color;     
      boolean validado;


      System.out.println("*** RECOGIDA DE DATOS ESTACIÓN METEREOLÓGICA ***");
      System.out.print("Ciudad: ");
      ciudad = lector.nextLine();
      System.out.println("Día de la toma de datos");
      do {
         System.out.print("Día: ");
         dia = Integer.parseInt(lector.nextLine());
         validado = dia >= 1 && dia <= 31;
         if(!validado) {
            System.out.println("Día debe estar entre [1-31]");
         }
      } while(!validado);
      do {
         System.out.print("Mes: ");
         mes = Integer.parseInt(lector.nextLine());
         validado = mes >= 1 && mes <= 12;
         if(!validado) {
            System.out.println("Mes debe estar entre [1-12]");
         }
      } while(!validado);      
      do {      
         System.out.print("Año: ");
         anyo = Integer.parseInt(lector.nextLine());
         validado = anyo >=2018 && anyo <= 2100;
         if(!validado) {
            System.out.println("Año debe estar entre [2018-2100]");
         }
      } while(!validado);      
      System.out.println("Hora de la toma de datos");
      do {
         System.out.print("Hora: ");      
         hora = Integer.parseInt(lector.nextLine());
         validado = hora >= 0 && hora <=23;
         if(!validado) {
            System.out.println("Hora debe estar entre [0-23]");
         }
      } while(!validado);
      do {
         System.out.print("Minutos: ");
         minutos = Integer.parseInt(lector.nextLine());
         validado = minutos >= 0 && minutos <= 59;
         if(!validado) {
            System.out.println("Minutos debe estar entre [0-59]");
         }
      } while(!validado);
      do {
         System.out.print("Segundos: ");
         segundos = Integer.parseInt(lector.nextLine());
         validado = segundos >= 0 && segundos <= 59;
         if(!validado) {
            System.out.println("Segundos debe estar entre [0-59]");
         }
      } while(!validado);
      do {      
         System.out.print("Velocidad del viento: ");
         velocidadViento = Integer.parseInt(lector.nextLine());
         validado = velocidadViento >= 0;
         if(!validado) {
            System.out.println("Velocidad del viento no puede ser un valor negativo");
         }
      } while(!validado);
      do {
         System.out.print("Temperatura: ");
         temperatura = Float.parseFloat(lector.nextLine());
         validado = temperatura >= -70 && temperatura <= 70;
         if(!validado) {
            System.out.println("Temperatura debe estar entre [-70,70]");
         }
      } while(!validado);
      do {
         System.out.print("Presión atmosférica: ");
         presion = Float.parseFloat(lector.nextLine());
         validado = presion >= 500 && presion <= 1100;
         if(!validado) {
            System.out.println("Presión atmosférica debe estar entre [500-1100]");
         }
      } while(!validado);
      do {
         System.out.print("Probabilidad lluvia: ");
         pLluvia = Integer.parseInt(lector.nextLine());
         validado = pLluvia >= 0 && pLluvia <= 100;
         if(!validado) {
            System.out.println("Probabilidad de lluvia debe estar entre [0-100]");
         }
      } while(!validado);
      do {
         System.out.print("Índice de radiación ultravioleta: ");
         uvi = Integer.parseInt(lector.nextLine());
         validado = uvi >= 0;
         if(!validado) {
            System.out.println("Índice de radición ultravioleta no puede ser negativo");
         }
      } while(!validado);

      System.out.println("\n\n");      
      System.out.println("\u001B[1;37;44m** DATOS ESTACIÓN METEREOLÓGICA **\u001B[0m");
      System.out.printf("Ciudad:\t\t\t%s\n", ciudad);
      System.out.printf("Fecha:\t\t\t%02d/%02d/%04d\n",dia,mes,anyo);
      System.out.printf("Hora de la mesura:\t%02d:%02d:%02d\n",hora,minutos,segundos);
      if(velocidadViento < 30) {
         color = VERDE_ANSI;
      } else if (velocidadViento >= 30 && velocidadViento < 60) {
         color = AMARILLO_ANSI;
      } else {
         color = ROJO_ANSI;
      }
      System.out.printf("Velocidad viento:\t" + color + "%d" + RESET_ANSI + " km/h\n",velocidadViento);
      if(temperatura < 22) {
         color = AZUL_ANSI;
      } else if(temperatura >= 22 && temperatura < 27) {
         color = VERDE_ANSI;
      } else if(temperatura >=27 && temperatura < 35) {
         color = AMARILLO_ANSI;
      } else {
         color = ROJO_ANSI;
      }
      System.out.printf("Temperatura:\t\t" + color + "%.2f" + RESET_ANSI +" Cº\n",temperatura);      
      System.out.printf("Presión atmosférica:\t%.1f hPa\n",presion);
      if(pLluvia < 35) {
         color = VERDE_ANSI;
      } else if(pLluvia >= 35 && pLluvia < 70) {
         color = AMARILLO_ANSI;
      } else {
         color = ROJO_ANSI;
      }
      System.out.printf("Probabilidad lluvia:\t" + color + "%d" + RESET_ANSI + " %%\n",pLluvia);
      if(uvi <= 2) {
         color = VERDE_ANSI;
      } else if(uvi > 2 && uvi <= 5) {
         color = AZUL_ANSI;
      } else if(uvi > 5 && uvi <= 7) {
         color = AMARILLO_ANSI;
      } else if(uvi > 7 && uvi <= 10) {
         color = ROJO_ANSI;
      } else {
         color = MAGENTA_ANSI;
      }
      System.out.printf("UVI:\t\t\t" + color + "%d" + RESET_ANSI + "\n",uvi);
   }
}