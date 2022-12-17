import java.util.Scanner;
public class AcquisisciTemperatura {
    public static void main(String[] args) {
        /*
        * Chiediamo all'utente di inserire 5 temperature in un array
        * Usando l'array:
        * - stampiamo le temperature
        * - calcoliamo la media e la stampiamo
        * */
        System.out.println("TEMPERATURA MEDIA");
        Scanner inserisci= new Scanner(System.in);
        int temperatura[]= new int[5];
        System.out.print("Inserisci 5 valori: \n");
        for(int i=0; i<temperatura.length; i++) {
            System.out.print("Inserisci temperatura " +(i+1) +": ");
            temperatura[i]= inserisci.nextInt();
        }
        System.out.println();
        System.out.println("Stampiamo i valori inseriti (con FOR): ");
        for(int s=0; s< temperatura.length; s++) {
        System.out.print(temperatura[s] +" ");
        }
        System.out.println();

        System.out.println("\nStampiamo con 'FOREACH':");
        for(int gradi: temperatura){
            System.out.print(gradi +" ");
        }
        System.out.println();
        double sommatore=0.0;
        System.out.println("\nCalcolo media temperature: ");
        for(int t=0; t< temperatura.length; t++) {
            sommatore += temperatura[t];
        }
        System.out.println("Media: " + (sommatore/temperatura.length));
    }
}

