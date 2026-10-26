

import java.util.HashMap;
import java.util.Map;

public class Deposito {
    private String nome; 
    private String indirizzo;
    private Map<String, Treno> treni;

    

    public Deposito() {}

    public Deposito(String nome, String indirizzo) { // non passo la lista nei parametri così viene inizializzata vuota
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.treni = new HashMap<>();
    }

    // Metodi GET/SET   
    // Nome

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Indirizzo

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    // Treno

    public Map<String, Treno> getTreni() {
        return treni;
    }

    public void setTreni(Map<String, Treno> treni) {
        this.treni = treni;
    }

    // MIEI METODI

    // Metodo per la stampa di tutti i treni in deposito (creato sotto saggio consiglio di un llm)
    public void stampaTreni() {
        if (treni.isEmpty()) {
            System.out.println("[!] Deposito vuoto.");
        } else {
            for (Treno t : treni.values()) {
                System.out.println(t);
                System.out.println("-------------------");
            }
        }
    }
    // Metodo per l'aggiunta  di treni al deposito !
    public void aggiungiTreno(Treno t) {
        if (treni.containsKey(t.getMatricola())) {
            System.out.println("Treno già presente in deposito!");
        } else {
            treni.put(t.getMatricola(), t);
            System.out.println("\nTreno aggiunto con successo!");
        }
                
    }

    // Metodo per la rimozione di treni dal deposito
    public void rimuoviTreno(String matr) {
        if (treni.containsKey(matr)) {
            treni.remove(matr);
            System.out.println("Treno rimosso con successo!\n");
        } else {
            System.out.println("Treno in deposito non trovato!\n");
        }
    }

    // Metodo per la ricerca di treni in deposito
    public void cercaTreno(String matrDaCercare) {
        if (treni.containsKey(matrDaCercare)) {
            System.out.println("\nTrovato il seguente treno:\n" + treni.get(matrDaCercare));
        } else {
            System.out.println("\nNessun treno con matricola " + matrDaCercare);
        }
    }

    @Override
    public String toString() {
        return "\n=== INFO DEPOSITO ===" + "\nNome: " + nome + "\nIndirizzo=" + indirizzo + "\nTreni=" + treni;
    }
}

