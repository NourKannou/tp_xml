package Service;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
@WebService
public class CalculatriceWS {

    // la nom de la methode utilisée
    @WebMethod(operationName = "somme")
    //implementer cette methode avec des parametres double a et b
    public double somme (@WebParam(name = "a") double a,@WebParam(name = "b") double b) {
        return a+b;
    }
}