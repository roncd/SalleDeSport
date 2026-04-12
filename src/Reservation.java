import java.util.ArrayList;

public class Reservation {
    private Seance seance;
    private ArrayList<Prestation> prestations;
    private StatutReservation statut;
    private enum StatutReservation {CONFIRMEE, ANNULEE};

   public Reservation(Seance seance) {
       this.seance = seance;
       this.prestations = new ArrayList<>();
       this.statut = StatutReservation.CONFIRMEE;
   }
   public Seance getSeance() {
       return seance;
   }
   public ArrayList<Prestation> getPrestations() {
       return prestations;
   }

   public void ajouterPrestation(Prestation p) {
       if(statut == StatutReservation.CONFIRMEE) {
           prestations.add(p);
       } else {
           System.out.println("Impossible d'ajouter une prestation à une réservation annulée.");
       }
   }

   public double coutPrestations(){
       double total = 0;
       for (Prestation p : prestations) { total += p.getPrix(); }
       return total;
   }

    public void annuler() {
        statut = StatutReservation.ANNULEE;
    }

    public boolean estAnnulee() {
        return statut == StatutReservation.ANNULEE;
    }
    public String toString() {
       return seance.toString()+" "+prestations.toString();
    }


}
