public class Ejercicio7 {
   public static void main(String[] args) {
      String s1 = "", s2 = "";
      for(int i = 1; i <= 9; i++) {
         s1 += i;         
         System.out.printf("%20s",s1);
         s2 = "";
         for(int j = s1.length()-1; j >= 0; j--) {
            s2 += "" + s1.charAt(j);
         }
         System.out.printf("%-10s\n",s2);
      }
   }
}