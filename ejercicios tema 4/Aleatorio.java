import java.util.Random;
public class Aleatorio {
    public static void main(String args []){
        Random r = new Random();
        int alea = r.nextInt(10000) + 1 ;
        System.out.println(alea);
    }
    
}
