package TP10;

public class Carre extends Rectangle {

	private Point point;
	
	public Carre(Point point, int cote) {
		super(point, cote, cote);
	}

	protected String getType() {
		return "Carre ";
	}
	
	public Point[] getPoints() {
		Point[] carTab = {point, getPointBasDroit(), getPointHautDroit(), getPointHautGauche()};
		
		return carTab;
		
	}

}
