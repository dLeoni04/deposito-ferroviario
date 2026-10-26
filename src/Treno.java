import java.util.Objects;

public class Treno {

    private String modello;
    private String matricola;  
    private int annoCostruzione;

    // Costruttore di default
    public Treno(){}
    
    // Costruttore con parametri
    public Treno(String modello, String matricola, int annoCostruzione) {
        this.modello = modello;
        this.annoCostruzione = annoCostruzione;
        this.matricola = matricola; 
    }

    // Metodi GET

    // modello
    public String getModello() {
        return modello;
    }

    // matricola
    public String getMatricola() {
        return matricola;
    }

    // annoCostruzione
    public int getAnnoCostruzione() {
        return annoCostruzione;
    }

    @Override
    public String toString() {
        return "\nModello: " + modello + "\nAnno di costruzione: " + annoCostruzione + "\nMatricola: " + matricola;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Treno other = (Treno) obj;
        if (matricola == null) {
            if (other.matricola != null)
                return false;
        } else if (!matricola.equals(other.matricola))
            return false;
        return true;
    }

    @Override 
    public int hashCode() {
        return Objects.hash(matricola);
    }
    
}
