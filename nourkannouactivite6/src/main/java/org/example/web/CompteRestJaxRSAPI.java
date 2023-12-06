package org.example.web;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.entities.Compte;
import org.example.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Component
@Path("/banque")
public class CompteRestJaxRSAPI {
    // Simuler une base de données en mémoire
    @Autowired
    private CompteRepository compteRepository;
    @Path("/comptes")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON})
    @Transactional
    public List<Compte> compteList() {
        return compteRepository.findAll();
    }

    @Path("/comptes/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Compte getOne(@PathVariable("id") Long id) {
        return compteRepository.findById(id).orElse(null);
    }

    @Path("/comptes")
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public void save(@RequestBody Compte compte) {
        compteRepository.save(compte);
    }

    @Path("/comptes/{id}")
    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    public Compte update(Compte compte, @PathVariable("id") Long id) {
        compte.setId(id);
        return compteRepository.save(compte);
    }

    @Path("/comptes/{id}")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON})
    public void delete(@PathVariable("id") Long id) {
        compteRepository.deleteById(id);
    }
/* Cette classe Java, CompteRestJaxRSAPI, représente une API REST pour la gestion des comptes bancaires. Elle est implémentée à l'aide de JAX-RS, une spécification standard pour les services web RESTful en Java. Voici une explication détaillée de chaque partie de cette classe :

Annotations de la classe :
@Component: Indique que cette classe est un composant Spring géré, ce qui signifie qu'elle peut être injectée dans d'autres composants.

@Path("/banque"): Spécifie le chemin de base pour les URI de cette classe. Ainsi, toutes les URI définies dans cette classe auront "/banque" comme préfixe.

Champ et méthode de simulation de la base de données :
@Autowired private CompteRepository compteRepository;: Utilisation de l'injection de dépendance pour injecter une instance de CompteRepository. Cela permet à la classe d'interagir avec la base de données.

@Transactional: Indique que toutes les méthodes annotées avec cette annotation sont transactionnelles. Cela signifie qu'elles s'exécuteront dans une transaction, et si une exception se produit, la transaction sera annulée.

Méthodes exposant l'API REST :
compteList() - GET:

Path : /comptes
Méthode HTTP : GET
Produit : JSON
Description : Récupère la liste de tous les comptes bancaires.
getOne(Long id) - GET:

Path : /comptes/{id}
Méthode HTTP : GET
Produit : JSON
Description : Récupère un compte spécifique en fonction de son identifiant.
save(Compte compte) - POST:

Path : /comptes
Méthode HTTP : POST
Produit : JSON
Description : Crée un nouveau compte en utilisant les données fournies.
update(Compte compte, Long id) - PUT:

Path : /comptes/{id}
Méthode HTTP : PUT
Produit : JSON
Description : Met à jour un compte existant en utilisant les données fournies.
delete(Long id) - DELETE:

Path : /comptes/{id}
Méthode HTTP : DELETE
Produit : JSON
Description : Supprime un compte en fonction de son identifiant.
Annotations sur les méthodes :
@Produces(MediaType.APPLICATION_JSON): Spécifie que la méthode produit du contenu au format JSON.

@PathParam("id"): Injecte la valeur de la variable de chemin "id" dans le paramètre de la méthode.

@RequestBody Compte compte: Permet de récupérer le corps de la requête HTTP (le compte) dans le paramètre de la méthode pour les méthodes POST et PUT.

Cette classe expose une API RESTful pour effectuer des opérations CRUD (Create, Read, Update, Delete) sur les comptes bancaires en utilisant les méthodes HTTP appropriées.





*/
}
