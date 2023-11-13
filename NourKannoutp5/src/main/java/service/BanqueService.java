package service;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService
public class BanqueService {

    // Méthode pour convertir un montant en utilisant un taux de conversion fixe
    @WebMethod
    public double conversion(@WebParam double montant) {
        return montant * 3.36;
    }

    // Liste pour stocker les comptes bancaires
    List<Compte> comptes = new ArrayList<Compte>();

    // Méthode pour récupérer la liste des comptes bancaires
    @WebMethod
    public List<Compte> getComptes() {
        List<Compte> compte = new ArrayList<Compte>();

        // Ajout de quelques comptes fictifs à la liste
        compte.add(new Compte(1, 400, new Date()));
        compte.add(new Compte(2, 700, new Date()));
        compte.add(new Compte(3, 550, new Date()));

        return comptes;
    }

    // Méthode pour récupérer un compte bancaire spécifique par son index dans la liste
    @WebMethod
    public Compte getCompte(@WebParam int x) {
        return comptes.get(x);
    }
}

