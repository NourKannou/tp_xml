package banque;

import java.util.ArrayList;
import java.util.List;

public class BanqueService {
	
	public double conversion (double montant) {
		return montant*3.36;
		
	}
	
  List<Compte> comptes = new ArrayList<Compte>();
	
	
	
	public List<Compte> getComptes(){
		
		return comptes;
	}
	public Compte getCompte(int x) {
		return comptes.get(x);
	}
	
}
