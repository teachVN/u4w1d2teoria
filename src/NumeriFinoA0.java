import java.util.Scanner;

public class NumeriFinoA0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somma = 0;
        int i=0;

        int numero;
        //esempio col do..while
//        do{
//            System.out.println("Dammi un numero");
//            numero = scanner.nextInt();
//            somma = somma +numero;
//            i++;
//
//        } while(numero!=0);

        //esempio col while
        System.out.println("Dammi un numero");
        numero = scanner.nextInt();

        while(numero!=0){
            somma = somma +numero;
            i++;
            System.out.println("Dammi un numero");
            numero = scanner.nextInt();
        }

        double media = (double)somma/(i);

        System.out.println(media);
    }
}
