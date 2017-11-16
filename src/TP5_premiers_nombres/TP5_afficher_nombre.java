package TP5_premiers_nombres;

public class TP5_afficher_nombre {
	public static void afficherNombre(int nombre) {
		int inc = 0;
		while (inc <= nombre) {
			System.out.println(inc);
			inc++;
		}

	}

	public static void main(String[] args) {
		afficherNombre(5);
	}

}
