package TP10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Rectangle extends Figure implements Surfacable {
	private int largeur;
	private int hauteur;
	private Point pointBasGauche;

	public Rectangle(Point point, int largeur, int hauteur) {
		super();
		this.pointBasGauche = point;
		this.largeur = largeur;
		this.hauteur = hauteur;

	}

	public Point getPointBasGauche() {
		return pointBasGauche;
	}

	public Point getPointBasDroit() {
		Point pointBasDroit = new Point((pointBasGauche.getX() + this.largeur), pointBasGauche.getY());
		return pointBasDroit;
	}

	public Point getPointHautGauche() {
		Point pointHautGauche = new Point(pointBasGauche.getX(), (pointBasGauche.getY() + this.hauteur));
		return pointHautGauche;
	}

	public Point getPointHautDroit() {
		Point pointHautDroit = new Point((pointBasGauche.getX() + this.largeur),
				(pointBasGauche.getY() + this.hauteur));
		return pointHautDroit;
	}

	@Override
	public String toString() {
		return getType() + "[pointBasGauche= " + pointBasGauche + ", pointBasDroit=" + getPointBasDroit()
				+ ", pointHautGauche=" + getPointHautGauche() + ", pointHautDroit=" + getPointHautDroit() + "] ";
	}

	protected String getType() {
		return "RECT ";
	}

	@Override
	public double Surface() {
		double surface = largeur * hauteur;
		return surface;
	}

	/**
	 * Retourne une collection contenant les points du rectangle.
	 */
	@Override
	public Collection<Point> getPoints() {
		List<Point> rectTab = new ArrayList<>();
		rectTab.add(getPointBasDroit());
		rectTab.add(getPointHautDroit());
		rectTab.add(getPointBasGauche());
		rectTab.add(getPointHautGauche());

		return rectTab;
	}

	/**
	 * Permet de tester si un point est couvert par le rectangle.
	 * Pour ce faire, la fonction renvoie vrai si le point en question
	 * possede un x inferieur au x du point inferieur gauche et superieur
	 * au y du point superieur droit. 
	 * De la même manière, le point doit posseder un y inferieur à celui 
	 * du point inferieur gauche et superieur au y du point superieur
	 * droit.
	 */
	@Override
	public boolean couvre(Point point) {
		return point.getX() < getPointBasGauche().getX() && point.getX() > getPointHautDroit().getX()
				&& point.getY() < getPointBasGauche().getY() && point.getY() > getPointHautDroit().getY();
	}


	/**
	 * Attention methode generee automatiquement
	 * Permet de tester l'egalite entre les figures (point a point, classe a classe)
	 * Bug : rectangle et carre identiques renvoient false
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (pointBasGauche == null) {
			if (other.getPointBasGauche() != null)
				return false;
		} else if (!pointBasGauche.equals(other.getPointBasGauche()))
			return false;
		
		if (this.getPointHautGauche() == null) {
			if (other.getPointHautGauche() != null)
				return false;
		} else if (!this.getPointHautGauche().equals(other.getPointHautGauche()))
			return false;
		
		if (this.getPointBasDroit() == null) {
			if (other.getPointBasDroit() != null)
				return false;
		} else if (!this.getPointBasDroit().equals(other.getPointBasDroit()))
			return false;
		
		if (this.getPointHautDroit() == null) {
			if (other.getPointHautDroit() != null)
				return false;
		} else if (!this.getPointHautDroit().equals(other.getPointHautDroit()))
			return false;
		return true;
	}
	
	

}
