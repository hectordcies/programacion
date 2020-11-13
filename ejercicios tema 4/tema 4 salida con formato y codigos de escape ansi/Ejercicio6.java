public class Ejercicio6 {
   public static void main(String[] args) {
      String s = "";
      for(int i = 1; i <= 9; i++) {
         s += i;
         System.out.printf("%20s",s);
         System.out.printf("%-10s\n",s);
      }
   }
}