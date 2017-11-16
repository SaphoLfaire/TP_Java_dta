package TP10;

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
	}

	@Override
	public String toString() {
		if (horizontal) {
			fin = new Point((debut.getX() + longueur), debut.getY());
		} else {
			fin = new Point(debut.getX(), (debut.getY() + longueur));

		}

		return "[" + debut.toString() + " à [" + fin.toString() + "]";

	}

	@Override
	public Point[] getPoints() {
		Point[] segTab = { debut, fin };
		return segTab;
	}

}
