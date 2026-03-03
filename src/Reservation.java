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
        return 0;
   }

   public void annuler(){

   }

    public String toString() {
       return seance.toString()+" "+prestations.toString();
    }


}
