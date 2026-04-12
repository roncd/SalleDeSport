import java.time.LocalDate;

public class AbonnementBasic extends Abonnement {

    public AbonnementBasic(String reference, LocalDate dateDebut, int dureeMois, int prixMensuel) {
        this.reference = reference;
        this.dateDebut = dateDebut;
        this.dureeMois = dureeMois;
        this.prixMensuel = prixMensuel;
    }
    @Override
    public boolean permetAccesSauna() {
        return false;
    }

    @Override
    public int creditsCoachInclus() {
        return 0;
    }

    public String toString() {
        return "Basic " + super.toString();
    }
}
