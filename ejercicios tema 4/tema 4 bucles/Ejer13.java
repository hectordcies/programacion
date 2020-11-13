import java.util.Random;
public class Ejer13 {
    public static void main(String args[]) {
        Random r =new Random();
        int cara=0,cruz=1,numero = r.nextInt(0-1 + 1), numcara =0,numcruz=0, contador=1000000, con = 0;
        do { 
        if (numero == cara) {
             numcara ++;
         }else if (numero == cruz) {
             numcruz ++ ;
             
         }
         else {
             con ++;
         }
        }while(contador == con);
        System.out.println("el numero de caras que han salido son: " + numcara + "    el numero de cruz que han salido son:" + numcruz);
        
    }
}
