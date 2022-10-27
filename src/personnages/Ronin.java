package personnages;

public class Ronin extends Humain{
	private int honneur = 1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int nouvel_argent = (argent/10);
		parler(beneficiaire.getNom() + " prend ces " + nouvel_argent + " sous.");
		perdreArgent(nouvel_argent);
		beneficiaire.recevoir(nouvel_argent);
	}	
}
