package personnages;

public class Commercant extends Humain{

	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public int seFaireExtorquer() {
		parler("J'ai tout perdu ! Le monde est trop injuste... ");
		return argent;
	}
	
	public void recevoir(int argentrecu) {
		parler(argentrecu + " sous ! Je te remercie genereux donateur !");
	}
}
