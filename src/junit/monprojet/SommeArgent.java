package junit.monprojet;

public class SommeArgent {
	private int quantite;
	private String unite;

	public SommeArgent(int amount, String currency) {
		quantite = amount;
		unite = currency;
	}
	
	public int getQuantite() {
		return quantite;
	}
	
	public String getUnite() {
		return unite;
	}
	
	public SommeArgent add(SommeArgent m) throws UniteDistincteException {
		if(!this.equals(m)) {
			throw new UniteDistincteException(this, m);
		}else {
			return new SommeArgent(getQuantite() + m.getQuantite(), getUnite());
		}
	}
	
	@Override
    public boolean equals(Object anObject) {
		if(this == anObject) {
			return true;
		}
		if(getClass() != anObject.getClass()) {
			return false;
		}else {
			if(this.unite == ((SommeArgent) anObject).getUnite() && this.quantite == ((SommeArgent) anObject).getQuantite()) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		String message = "SommeArgent -> Currency : " + getUnite() + ", Amount : " + getQuantite();
		
		return message;
	}
}
