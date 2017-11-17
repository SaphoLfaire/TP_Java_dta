package TP10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Segment extends Figure {

	private Point debut;
	private Point fin;
	private int longueur;
	private boolean horizontal;

	public Segment(Point debut, int longueur, boolean horizontal) {
		super();
		this.debut = debut;
		this.longueur = longueur;
		this.horizontal = horizontal;
		if (this.horizontal) {
			fin = new Point((debut.getX() + this.longueur), debut.getY());
		} else {
			fin = new Point(debut.getX(), (debut.getY() + this.longueur));

		} 
	}

	@Override
	public String toString() {

		return "[" + debut.toString() + " à [" + fin.toString() + "]";

	}

	@Override
	public Collection<Point> getPoints() {
		List<Point> segTab = new ArrayList<>();
		segTab.add(debut);
		segTab.add(fin);
		return segTab;
	}

	/**
	 * Renvoie true si le point appartient au segment
	 * C'est a dire que la distance entre le premier point du 
	 * segment et le point P a tester est egal a la distance du 
	 * segment moins la distance entre le second point du segment 
	 * est le point P.
	 * 
	 */
	@Override
	public boolean couvre(Point point) {
		return point.distance(point, debut) == (debut.distance(debut, fin) - point.distance(point, fin));
	}

	/**
	 * Renvoie true si les deux points des segments sont egaux
	 * Comparaison points a point
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Segment other = (Segment) obj;
		if (debut == null) {
			if (other.debut != null)
				return false;
		} else if (!debut.equals(other.debut))
			return false;
		if (fin == null) {
			if (other.fin != null)
				return false;
		} else if (!fin.equals(other.fin))
			return false;
		return true;
	}
	
	

}
