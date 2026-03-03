import java.util.ArrayList;

public class Reservation {
    private Seance seance;
    private ArrayList<Prestation> prestations;
    private enum StatutReservation {CONFIRMEE, ANNULEE};

   public Reservation(Seance seance, ArrayList<Prestation> prestations) {
       this.seance = seance;
       this.prestations = prestations;
   }
   public Seance getSeance() {
       return seance;
   }
   public ArrayList<Prestation> getPrestations() {
       return prestations;
   }

   public void ajouterPresation(Prestation p) {
       prestations.add(p);
   }

   public double coutPrestations(){
       double total = 0;
       for (Prestation p : prestations) { total += p.getPrix(); }
       return total;
   }

   public void annuler(){

   }

    public String toString() {
       return seance.toString()+" "+prestations.toString();
    }


}
