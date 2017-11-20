package TP10;

import java.util.Collection;

public abstract class Figure {

	private Couleur color;

	protected Figure(Couleur color) {
		this.color = color;
	}

	public abstract String toString();

	public void affiche() {
		System.out.println(this.toString());
	}

	/**
	 * Renvoi une collection des points d'une figure.
	 * 
	 * @return Collection<Point>
	 */
	public abstract Collection<Point> getPoints();

	/**
	 * Renvoie true si le point fourni en paramètre est couvert par la figure
	 * 
	 * @param point
	 * @return boolean
	 */
	public abstract boolean couvre(Point point);

	public Couleur getCouleur() {
		return this.color;
	}

}
