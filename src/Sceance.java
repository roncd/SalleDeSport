import java.time.LocalDateTime;

public class Sceance {
    private int id;
    private String nom;
    private LocalDateTime dateHeure;
    private int capaciteMax;

    public Sceance(int id, String nom, LocalDateTime dateHeure, int capaciteMax) {
        this.id = id;
        this.nom = nom;
        this.dateHeure = dateHeure;
        this.capaciteMax = capaciteMax;
    }
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public LocalDateTime getDateHeure() {
        return dateHeure;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }


}
