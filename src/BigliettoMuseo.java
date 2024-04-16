/*
Il biglietto di ingresso ad un museo ha le seguenti tariffe. Per i bambini di età inferiore a 6 anni
l'ingresso è gratuito (opzione 1), per gli studenti 8 euro (opzione 2), per i pensionati 10 euro
(opzione 3), per tutti gli altri 15 euro (opzione 4). Creare un programma in cui l’utente inserisce
un numero tra 1 e 4 e viene comunicato il prezzo relativo all'opzione scelta. Se il numero non è
un'opzione valida viene mostrato un messaggio di errore (con icona critica).
 */

import java.util.Scanner;

public class BigliettoMuseo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scegli un'opzione tra 1 e 4");
        int scelta = scanner.nextInt();

        double costoBiglietto=0;

        //algoritmo con if else if
//        if(scelta==1){
//            //System.out.println("Biglietto gratuito");
//            costoBiglietto=0;
//        }
//        else if(scelta==2){
//            //System.out.println("Costo biglietto 8€");
//            costoBiglietto=8;
//        }
//        else if (scelta==3){
//           //System.out.println("Costo biglietto 10€");
//            costoBiglietto=10;
//        }
//        else if (scelta==4){
//            //System.out.println("Costo biglietto 15€");
//            costoBiglietto=15;
//        }
//        else{
//            System.out.println("Scelta errata");
//            return;
//        }
//
//        System.out.println("Inserisci l'età");
//        int eta = scanner.nextInt();
//
//        if(eta<=18){
//            costoBiglietto=costoBiglietto-costoBiglietto*50/100;
//        }
//
//        System.out.println(costoBiglietto);

        //algoritmo con lo switch
        switch (scelta){
            case 1:
                System.out.println("Biglietto gratuito");
                break;
            case 2:
                System.out.println("Costo biglietto 8€");
                break;
            case 3:
                System.out.println("Costo biglietto 10€");
                break;
            case 4:
                System.out.println("Costo biglietto 15€");
                break;
            default:
                System.out.println("Scelta errata");

        }


    }
}
