package TP7_nombres_premier;

public class NombrePremier {
	public static void nombrePremier(int nombre) {
		int premierPotentiel = 1;
		while (premierPotentiel <= nombre) {
			if (estPremier(premierPotentiel)) {
				System.out.println(premierPotentiel);
			}
			premierPotentiel++;

		}

	}

	public static boolean estPremier(int nombre) {
		for (int diviseurPotentiel = 2; diviseurPotentiel < nombre; diviseurPotentiel++) {
			if (nombre % diviseurPotentiel == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		nombrePremier(50);

	}

}
