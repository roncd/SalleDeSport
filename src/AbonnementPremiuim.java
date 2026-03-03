public class AbonnementPremiuim extends Abonnement {
    private int creditCoach;
    @Override
    public boolean permetAccesSauna() {
        return true;
    }

    @Override
    public int creditsCoachInclus() {
        return creditCoach;
    }
}
