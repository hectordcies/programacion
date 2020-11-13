public class Ejercicio5 {
   public static void main(String[] args) {
      String s = "";
      int c = 0;
      for(int i = 1; i <= 9; i++) {
         s += i;
         c=i-1;
         if(i == 9) {
            c=0;
         }
         System.out.printf("\u001B[1;3"+c+"m%9s\u001B[0m\n",s);
      }
   }
}