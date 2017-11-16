package TP10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Rond extends Figure implements Surfacable {

	private Point centre;
	private int rayon;
	private List<Point> pointTab = new ArrayList<Point>();

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
		double surface = Math.PI * rayon * rayon;
		return surface;
	}

	@Override
	public Collection<Point> getPoints() {
		pointTab.add(centre);
		return pointTab;
	}

	@Override
	public boolean couvre(Point point) {		
		return point.distance(point, centre) <= rayon;
	}

}
