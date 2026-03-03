public class AbonnementBasic extends Abonnement {
    @Override
    public boolean permetAccesSauna() {
        return false;
    }

    @Override
    public int creditsCoachInclus() {
        return 0;
    }
}
