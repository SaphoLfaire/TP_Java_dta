package TP6_factorielle;

public class TP6Factorielle {
	public static int factorielle(int nombre) {
		int result = 1;
		if (nombre == 0) {
			return 1;
		}
		for (int i = 1; i <= nombre; i++) {
			result = result * i;
		}

		return result;
	}

	public static void main(String[] args) {
		int nombre = 0;
		System.out.println("La factoriel de " + nombre + " est " + factorielle(nombre));
	}

}
