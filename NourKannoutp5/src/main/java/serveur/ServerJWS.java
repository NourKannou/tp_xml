package serveur;

import jakarta.xml.ws.Endpoint;
import service.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // creation une instance de la classe calculatriceWS
        BanqueService banqueService =new BanqueService();
        //choisir l'url où le service web va etre accessible
        String ur1 = "http://localhost:8084/";
        //Endpoint.publish: pour publier le service web
        Endpoint.publish(ur1, banqueService);
        System.out.println("service web publié avec succeés a l'url :" + ur1);
    }
}
