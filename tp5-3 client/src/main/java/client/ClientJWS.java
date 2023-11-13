package client;

import proxy.BanqueService;
import proxy.BanqueServiceService;
import proxy.Compte;

import java.util.Scanner;

public class ClientJWS {
    public static void main(String[] args) {
        // Instanciation du service web BanqueService en utilisant le proxy généré
        BanqueService banqueService = new BanqueServiceService().getBanqueServicePort();

        // Invite l'utilisateur à saisir un montant
        System.out.println("Veuillez entrer le montant :");
        Scanner scanner = new Scanner(System.in);
        double montant = scanner.nextDouble();
        System.out.println("Montant avant conversion : " + montant);

        // Appel de la méthode de conversion du service web
        System.out.println("\nMontant après conversion : " + banqueService.conversion(montant));

        // Boucle pour parcourir et afficher les comptes retournés par la méthode getComptes
        for (Compte compte : banqueService.getComptes()) {
            System.out.println("Compte N°" + compte.getCode() + " avec un solde de : " + compte.getSolde() + "\n");
        }
    }
}
