package Server;


import Service.CalculatriceWS;
import javax.xml.ws.Endpoint;
public class ServerJWS {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // creation une instance de la classe calculatriceWS
        CalculatriceWS calculatrice =new CalculatriceWS();
        //choisir l'url où le service web va etre accessible
        String ur1 = "http://localhost:8084/";
        //Endpoint.publish: pour publier le service web
        Endpoint.publish(ur1, calculatrice);
        System.out.println("service web publié avec succeés a l'url :" + ur1);
    }
}