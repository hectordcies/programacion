public class Ejercicio8 {
   public static void main(String[] args) {
      System.out.println("\u001B[1;37;40m******************* TABLA DE CÓDIGOS DE COLORES ANSI *******************\u001B[0m");
      for(int b = 0; b <= 1; b++) {
         for(int fg = 30; fg <= 37; fg++) {            
            for(int bg = 40; bg <= 47; bg++) {
               System.out.print("\u001B["+b+";"+fg+";"+bg+"m"+" "+b+";"+fg+";"+bg+" "+"\u001B[0m");
            }
            System.out.println("");
         } 
      } 
   }
}