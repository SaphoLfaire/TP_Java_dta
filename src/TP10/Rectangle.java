package TP10;

public class Rectangle extends Figure implements Surfacable{
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
		Point pointBasDroit = new Point ((pointBasGauche.getX() + this.largeur), pointBasGauche.getY());
		return pointBasDroit;
	}

	public Point getPointHautGauche() {
		Point pointHautGauche = new Point(pointBasGauche.getX(), (pointBasGauche.getY() + this.hauteur));
		return pointHautGauche;
	}

	public Point getPointHautDroit() {
		Point pointHautDroit = new Point((pointBasGauche.getX() + this.largeur), (pointBasGauche.getY() + this.hauteur));
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
		double surface = largeur*hauteur;
		return surface;
	}

	@Override
	public Point[] getPoints() {
		Point[] rectTab = {getPointBasDroit(), pointBasGauche, getPointHautDroit(), getPointHautGauche()};
		return rectTab;
	}

}
