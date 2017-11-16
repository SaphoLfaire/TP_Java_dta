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
	public Collection<Point> getPoints() {
		List<Point> segTab = new ArrayList<>();
		segTab.add(debut);
		segTab.add(fin);
		return segTab;
	}

	@Override
	public boolean couvre(Point point) {
		return point.distance(point, debut) == point.distance(point, fin);
	}

}
