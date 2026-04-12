import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Prestation sauna = new Prestation("Sauna", "Sauna", 5);
        Prestation coach = new Prestation("Coach", "Coach", 25);
        Prestation serviette = new Prestation("Serviette", "Serviette", 2);


        // Création séances
        Seance seance1 = new Seance(1, "Yoga", LocalDateTime.of(2026, 4, 10, 18, 0), 10);
        Seance seance2 = new Seance(2, "Pilates", LocalDateTime.of(2026, 4, 15, 19, 0), 8);
        Seance seance3 = new Seance(3, "Cardio", LocalDateTime.of(2026, 4, 20, 17, 30), 15);

        // Création abonnements
        Abonnement abBasic = new AbonnementBasic("B001", LocalDate.now(), 6, 30);
        Abonnement abPremium = new AbonnementPremium("P001", LocalDate.now(), 12, 50, 10);

        // Création adhérents
        Adherent adherent1 = new Adherent(1, "Alice", abBasic);
        Adherent adherent2 = new Adherent(2, "Bob", abPremium);

        // Réservations
        Reservation res1 = new Reservation(seance1);
        res1.ajouterPrestation(sauna);
        res1.ajouterPrestation(serviette);

        Reservation res2 = new Reservation(seance2);
        res2.ajouterPrestation(coach);

        Reservation res3 = new Reservation(seance3);
        res3.ajouterPrestation(serviette);

        // Ajout réservations aux adhérents
        adherent1.ajouterReservation(res1);
        adherent1.ajouterReservation(res3);

        adherent2.ajouterReservation(res2);
        //Annule une réservation
        res3.annuler();

        // Liste adhérents
        ArrayList<Adherent> adherents = new ArrayList<>();
        adherents.add(adherent1);
        adherents.add(adherent2);

        // Affichage adhérents + abonnements
        System.out.println("=== Adhérents et leurs abonnements ===");
        for (Adherent a : adherents) {
            System.out.println(a);
        }

        // Affichage réservations futures d’un adhérent (ex: Alice)
        System.out.println("\n=== Réservations futures d'Alice ===");
        for (Reservation r : adherent1.getReservationsFutures()) {
            System.out.println(r);
        }

        // Liste des adhérents ayant accès sauna
        System.out.println("\n=== Adhérents avec accès Sauna ===");
        for (Adherent a : adherents) {
            if (a.aAccesSauna()) {
                System.out.println(a.getNom());
            }
        }

        // Calcul chiffre d’affaires prestations
        double chiffreAffaires = 0;
        for (Adherent a : adherents) {
            for (Reservation r : a.getReservationsFutures()) {
                chiffreAffaires += r.coutPrestations();
            }
        }
        System.out.println("\nChiffre d'affaires prestations (réservations futures): " + chiffreAffaires + "€");
    }
}