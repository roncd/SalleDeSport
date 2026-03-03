import java.time.LocalDate;

public abstract class Abonnement {
    protected String reference;
    protected LocalDate dateDebut;
    protected int dureeMois;
    protected int prixMensuel;

    public void getReference() {
        this.reference = reference;
    }
    public void getDateDebut() {
        this.dateDebut = dateDebut;
    }
    public void getDureeMois() {
        this.dureeMois = dureeMois;
    }
    public void getPrixMensuel() {
        this.prixMensuel = prixMensuel;
    }

    public LocalDate dateFin(){
        return dateDebut.plusMonths(dureeMois);
    }

    public double coutTotal(){
        return prixMensuel * dureeMois;
    }
    public abstract boolean permetAccesSauna();
    public abstract int creditsCoachInclus();

    public String toString(){
        return reference+" "+dateDebut+" "+dureeMois+" "+prixMensuel;
    }


}
