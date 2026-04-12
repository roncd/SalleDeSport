import java.time.LocalDate;

public class AbonnementPremium extends Abonnement {
    private int creditCoach;

    public AbonnementPremium(String reference, LocalDate dateDebut, int dureeMois, int prixMensuel, int creditCoach) {
        this.reference = reference;
        this.dateDebut = dateDebut;
        this.dureeMois = dureeMois;
        this.prixMensuel = prixMensuel;
        this.creditCoach = creditCoach;
    }

    @Override
    public boolean permetAccesSauna() {
        return true;
    }

    @Override
    public int creditsCoachInclus() {
        return creditCoach;
    }

    public String toString() {
        return "Premium " + super.toString() + " Credits Coach: " + creditCoach;
    }
}
