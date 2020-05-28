package junit.monprojet;

import java.util.HashMap;;

public class PorteMonnaie {
	private HashMap<String, Integer> contenu;
	
	public HashMap<String, Integer> getContenu(){
		return contenu;
	}
	
	public void porteMonnaie() {
		contenu = new HashMap<String, Integer>();
	}
	
	public void ajouteSomme(SommeArgent sa) {
		String key = sa.getUnite();
		Integer value = sa.getQuantite();
		
		if (contenu.containsKey(key)) {
			contenu.put(key, contenu.get(key) + value);
		}else {
			contenu.put(key, value);
		}
	}
	
	public String toString() {
		System.out.println("This wallet contains :");
		contenu.forEach((k,v) ->{
			SommeArgent currSA = new SommeArgent(v, k);
			System.out.println(currSA.toString());
		});
		
		return "Ca doit pas etre le bon truc a faire si ?";
	}
}
