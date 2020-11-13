public class Ejer4 {
    public static void main(String[] args){
        int cont = 0;
        for (int i = 1; i<=100; i = i+2){
            cont = cont + 1;
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println("el numero total de impares es " + cont);
    }
}