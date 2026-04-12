import java.time.LocalDateTime;
import java.util.ArrayList;

public class Adherent {
    private int id;
    private String nom;
    private Abonnement abonnement;
    private ArrayList<Reservation> reservations;


    public Adherent(int id, String nom, Abonnement abonnement) {
        this.id = id;
        this.nom = nom;
        this.abonnement = abonnement;
        this.reservations = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public Abonnement getAbonnement() {
        return abonnement;
    }

    public void ajouterReservation(Reservation r) {
        reservations.add(r);
    }

    public ArrayList<Reservation> getReservationsFutures() {
        ArrayList<Reservation> futures = new ArrayList<>();
        LocalDateTime now = LocalDateTime.now();
        for (Reservation r : reservations) {
            if (!r.estAnnulee() && r.getSeance().getDateHeure().isAfter(now)) {
                futures.add(r);
            }
        }
        return futures;
    }

    public boolean aAccesSauna() {
        return abonnement.permetAccesSauna();
    }

    public String toString() {
        return "Adhérent #" + id + " " + nom + " - Abonnement: " + abonnement.toString();
    }
}
