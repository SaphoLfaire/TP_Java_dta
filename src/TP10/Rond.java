package TP10;

public class Rond extends Figure implements Surfacable {

	private Point centre;
	private int rayon;
	private Point[] pointTab = {centre};

	public Rond(Point point, int r) {
		super();
		this.centre = point;
		this.rayon = r;
		
	}

	@Override
	public String toString() {
		return "Rond [" + centre + ", r=" + rayon + "]";
	}

	@Override
	public double Surface() {
		double surface = Math.PI * rayon*rayon;
		return surface;
	}

	@Override
	public Point[] getPoints() {
		return pointTab;
	}

}
