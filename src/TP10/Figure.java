package TP10;

public abstract class Figure {
	
	
	public abstract String toString();
	
	public void affiche() {
		System.out.println(this.toString());
	}
	
	public abstract Point[] getPoints();

}
