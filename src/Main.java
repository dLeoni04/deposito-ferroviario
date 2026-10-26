import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("       GESTIONALE DEPOSITO - CONFIGURAZIONE       ");
        System.out.println("==================================================");
        System.out.println("Benvenuto nel tuo nuovo deposito! Iniziamo con la configurazione base:\n");

        System.out.print(" -> Inserisci il nome del deposito: ");
        String nomeDeposito = scan.nextLine();

        System.out.print(" -> Inserisci l'indirizzo del deposito: ");
        String indirizzoDeposito = scan.nextLine();

        // Creazione dell'oggetto Deposito
        Deposito deposito = new Deposito(nomeDeposito, indirizzoDeposito);
        System.out.println("\n[+] Deposito creato con successo!");

        // Variabile booleana per richiedere continuamente la scelta all'utente
        boolean continua = true;

        while (continua) {
            System.out.println("\n==================================================");
            System.out.println("                  MENU DEPOSITO                   ");
            System.out.println("==================================================");
            System.out.println(" 1. Visualizza treni");
            System.out.println(" 2. Aggiungi nuovo treno");
            System.out.println(" 3. Rimuovi treno");
            System.out.println(" 4. Cerca un treno in base alla sua matricola");
            System.out.println(" 5. Stampa le info del deposito");
            System.out.println(" 6. Esci");
            System.out.println("--------------------------------------------------");

            System.out.print("Scegli una delle operazioni (1-6): ");
            String scelta = scan.nextLine();

            switch (scelta) {
                case "1":
                    // System.out.println("\n--- ELENCO TRENI ---");
                    // if (deposito.getTreni().isEmpty()) {
                    //     System.out.println("[!] Deposito vuoto.");
                    // } else {
                    //     System.out.println(deposito.getTreni());
                    // }
                    deposito.stampaTreni();
                    break;

                case "2":
                    System.out.println("\n--- AGGIUNTA NUOVO TRENO ---");
                    System.out.print(" -> Inserisci il modello del treno: ");
                    String modello = scan.nextLine();
                    
                    System.out.print(" -> Inserisci l'anno di costruzione del treno: ");
                    int annoCostruzione = Integer.parseInt(scan.nextLine());

                    System.out.print(" -> Inserisci la matricola del treno: ");
                    String matricola = scan.nextLine();

                    Treno nuovoTreno = new Treno(modello, matricola, annoCostruzione);
                    deposito.aggiungiTreno(nuovoTreno);
                    break;

                case "3":
                    System.out.println("\n--- RIMOZIONE TRENO ---");
                    System.out.print(" -> Scrivi la matricola del treno che vuoi togliere dal deposito: ");
                    String matri = scan.nextLine();
                    deposito.rimuoviTreno(matri);
                    break;

                case "4":
                    System.out.println("\n--- RICERCA TRENO ---");
                    System.out.print(" -> Inserisci la matricola del treno che vuoi ricercare: ");
                    String matriDaCercare = scan.nextLine();
                    deposito.cercaTreno(matriDaCercare);
                    break;

                case "5":
                    System.out.println("\n--- INFORMAZIONI DEPOSITO ---");
                    System.out.println(deposito);
                    break;

                case "6":
                    System.out.println("\n[i] Sto chiudendo il programma, ciao ciao!");
                    continua = false;
                    break;

                default:
                    System.out.println("\n[!] Scelta non valida, riprova!");
                    break;
            }
        }
        
        scan.close();
    }
}
