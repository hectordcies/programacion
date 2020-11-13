public class Ejercicio5 {
   public static void main(String[] args) {
      //Variables para contar cuantos múltiplos e
      int nPares = 0, nImpares = 0, nMultiplos5 = 0;
      int sPares = 0, sImpares = 0, sMultiplos5 = 0;
      for(int i = 1; i <= 100; i++) {
         if(i % 2 == 0) {
            nPares++;
            sPares = sPares + i;
            System.out.println(i + " (es par)");
         } else {
            nImpares++;
            sImpares = sImpares + i;
            System.out.println(i + " (es impar)");
         }
         if(i % 5 == 0) {
            nMultiplos5++;
            sMultiplos5 = sMultiplos5 + i;
            System.out.println(i + " (es múltiplo de 5)");
         }
      }
      System.out.println("**** NÚMERO PARES ****");
      System.out.println("Entre 1 y 100 hay " + nPares + " números pares.");
      System.out.println("Y su suma es " +sPares);
      System.out.println("**** NÚMERO IMPARES ****");
      System.out.println("Entre 1 y 100 hay " + nImpares + " números impares.");
      System.out.println("Y su suma es " +sImpares);
      System.out.println("**** MÚLTIPLOS DE 5 ****");
      System.out.println("Entre 1 y 100 hay " + nMultiplos5 + " múltiplos de 5.");
      System.out.println("Y su suma es " +sMultiplos5);
   }
}