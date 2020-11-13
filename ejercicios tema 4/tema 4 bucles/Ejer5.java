public class Ejer5 {
    public static void main(String[] args) {
      int i,multiplos = 0,pares = 0 , impares = 0;
      for ( i=1; i<101; i++){
         System.out.print(i + " " );
         if (i % 2 ==0){
            pares++;
            System.out.println("Es par");
         }else{
            impares++;
            System.out.println("Es impar");
         }if (i % 5 == 0){
            multiplos++;
         }else {
            System.out.print("");
         }
      }
   System.out.println("hay un total de " + pares + " numeros pares");
   System.out.println("Hay un total de "+ impares + " numeros impares");
   System.out.println("hay un total de " + multiplos + " de multiplos de 5" );

   }
}