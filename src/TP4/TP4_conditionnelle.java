package TP4;

public class TP4_conditionnelle {

	public static int remise(int montant) {
		int result = 0;
		if (montant < 1000) {
			result = 0;
		} else if (montant >= 1000 && montant < 2000) {
			result = montant / 100;
		} else if (montant >= 2000 && montant < 5000) {
			result = montant * 3 / 100;
		} else if (montant > 5000) {
			result = montant * 5 / 100;
		} else {
			System.out.println("Il y a une erreur quelque part ! ");
			return 0;
		}
		return result;
	}

	public static String tailleDuSac(byte poids) {
		String taille = "";

		switch (poids) {
		case 0:
			taille = "pas de sac";
			break;
		case 1:
			taille = "petit";
			break;
		case 2:
			taille = "moyen";
			break;
		default:
			taille = "grand";
		}

		return taille;
	}

	public static void main(String[] args) {

		int prix = Integer.parseInt(args[0]);
		System.out.println("Montant de bases : " + prix + "; reduction : " + remise(prix));

		byte poids = Byte.parseByte(args[1]);
		System.out.println("poids : " + poids + "kg; taille du sac : " + tailleDuSac(poids));
	}

}
