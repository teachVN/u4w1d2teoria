import java.util.Scanner;

/*
Scrivere un algoritmo che, dato il consumo di acqua di un utente, espresso in m3,
calcoli l'importo della bolletta, sapendo che ogni bolletta comprende una quota fissa di 20 euro e una quota
variabile di 2,50 euro/m3 per i primi 100 metri cubi d'acqua, di euro 4,00/m3
per i metri cubi in eccesso.
 */

public class Bolletta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il consumo d'acqua");
        int consumo = scanner.nextInt();

        if(consumo<=100){
            //variabile di blocco, non visibile fuori dall'if
            double bolletta = 20 + 2.5*consumo;
            System.out.println(bolletta);
        }
        else{
            //variabile di blocco, non visibile fuori dall'else
            double bolletta = 20 + 250 + 4*(consumo-100);
            System.out.println(bolletta);
        }




    }
}
