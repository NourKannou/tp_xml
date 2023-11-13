package metier;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import java.util.*;
//Annotation indiquant que les instances de cette classe peuvent être utilisées pour la sérialisation/désérialisation XML
@XmlRootElement
// Annotation indiquant que l'accès aux champs se fait directement (FIELD)
@XmlAccessorType(XmlAccessType.FIELD)
public class  Compte {
    private int code ;
    private double solde;
    @XmlTransient
    private Date dateCreation;
    public Compte (int code, double solde, Date dateCreation) {
        this.code=code;
        this.solde=solde;
        this.dateCreation=dateCreation;
    }
    // Appel au constructeur de la classe Compte
    public Compte () {
        super();
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    public Date getDateCreation() {
        return dateCreation;
    }
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}