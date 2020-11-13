import java.util.Random;
public class Ejercicio14 {
   public static void main(String[] args) {
      final int N_LANZAMIENTOS = 1000000;      
      Random r = new Random();
      int dado;
      int unos = 0, doses = 0, treses = 0, cuatros = 0, cincos = 0, seises = 0;
      for(int i = 1; i <= N_LANZAMIENTOS; i++) {
         //r.nextInt(max - min + 1) + min;
         //Lanzamiento de moneda max = 6, min = 1.          
         dado = r.nextInt(6 - 1 + 1) + 1;          
         switch(dado) {
            case 1:
               unos++;
               break;
            case 2:
               doses++;
               break;
            case 3:
               treses++;
               break;
            case 4:
               cuatros++;
               break;
            case 5:
               cincos++;
               break;
            case 6:
               seises++;
               break;
         }
      }
      System.out.println("Han salido " + unos + " unos (" + unos*100f/N_LANZAMIENTOS + "%)");
      System.out.println("Han salido " + doses + " doses (" + doses*100f/N_LANZAMIENTOS + "%)");
      System.out.println("Han salido " + treses + " treses (" + treses*100f/N_LANZAMIENTOS + "%)");
      System.out.println("Han salido " + cuatros + " cuatros (" + cuatros*100f/N_LANZAMIENTOS + "%)");
      System.out.println("Han salido " + cincos + " cincos (" + cincos*100f/N_LANZAMIENTOS + "%)");
      System.out.println("Han salido " + seises + " seises (" + seises*100f/N_LANZAMIENTOS + "%)");
   }
}