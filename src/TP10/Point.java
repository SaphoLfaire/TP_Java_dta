package TP10;

public class Point {

	private int abscisse;
	private int ordonnee;
	private static final int INIT_X = 25;
	private static final int INIT_Y = 25;

	public Point(int x, int y) {
		super();
		this.abscisse = x;
		this.ordonnee = y;
	}

	public Point() {
		this(INIT_X, INIT_Y);
	}

	public int getX() {
		return abscisse;
	}

	public int getY() {
		return ordonnee;
	}

	@Override
	public String toString() {
		return "Point [x=" + abscisse + ", y=" + ordonnee + "]";
	}

	public boolean equals(Object p) {
		if (p instanceof Point) {
			return (((Point) p).getX() == abscisse) && (((Point) p).getY() == ordonnee);
		}
		return false;

	}

}
