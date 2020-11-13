public class Ejercicio4 {
   public static void main(String[] args) {
      int impares = 0;
      for(int i = 1; i <= 100; i++) {
         if(i % 2 != 0) { //Si la división entre 2 no es exacta significa que es impar
            impares++;
            System.out.println(i);
         }
      }
      System.out.println("Entre 1 y 100 hay " + impares + " números impares.");
   }
}