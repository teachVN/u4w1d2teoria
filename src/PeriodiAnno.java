/*
    Scrivere un algoritmo che, preso in input un valore compreso tra 1 e 12, indichi a quale parte
dell’anno scolastico appartiene il mese corrispondente, tenendo conto che dall’1 settembre al 31
dicembre è primo trimestre, dall’1 gennaio al 30 giugno il secondo pentamestre e i rimanenti mesi
sono classificati come “vacanza estiva”.
 */

import java.util.Scanner;

public class PeriodiAnno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero del mese");
        int mese = scanner.nextInt();

        switch (mese){
            case 9,10,11,12:
                System.out.println("Primo trimestre");
                break;
            case 1,2,3,4,5,6:
                System.out.println("Secondo pentamestre");
                break;
            case 7,8:
                System.out.println("Vacanza estiva");
                break;
            default:
                System.out.println("Scelta errata");
        }
    }
}
