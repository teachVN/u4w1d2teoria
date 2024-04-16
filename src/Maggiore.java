import java.util.Scanner;

/*
Scrivere l'algoritmo che, presi in input 3 numeri, visualizzi il valore maggiore.
 */

public class Maggiore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dammi il primo numero");
        int n1 = scanner.nextInt();

        System.out.println("Dammi il secondo numero");
        int n2 = scanner.nextInt();

        System.out.println("Dammi il terzo numero");
        int n3 = scanner.nextInt();

        //primo algoritmo
//        if(n1>=n2 && n1>=n3){
//            System.out.println("Il numero maggiore è " + n1);
//        }
//        else if (n2>n1 && n2>n3){
//            System.out.println("Il numero maggiore è " + n2);
//        }
//        else{
//            System.out.println("Il numero maggiore è " + n3);
//        }

        //secondo algoritmo
        int max;

        if (n1>n2){
            max=n1;
        }
        else{
            max=n2;
        }

        if(n3>max){
            max=n3;
        }

        System.out.println("Il numero maggiore è " + max);
    }
}
