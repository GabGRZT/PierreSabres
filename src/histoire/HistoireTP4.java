package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain ("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
		Commercant marco = new Commercant ("Marco", "thé", 15);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		Yakuza yaku = new Yakuza ("Yaku Le Noir", "whisky", 45, "Warsong");
		yaku.direBonjour();
		yaku.extorquer(marco);
		Ronin genji = new Ronin ("Genji", "shochu", 60);
		genji.direBonjour();
		genji.donner(marco);
		genji.provoquer(yaku);
		
	}

}
