package TP10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Rond extends Figure implements Surfacable {

	private Point centre;
	private int rayon;
	private List<Point> pointTab = new ArrayList<Point>();

	/**
	 * Bon alors votre attention s'il vous plait.
	 * Dans le premier constructeur, on laisse le choix
	 * a l'utilisateur de ne définir que le centre et le
	 * rayon. Mais !! Si celui ci veut aussi definir la couleur, 
	 * on a une second construteur. Le premier constructeur (le
	 * plus simple) appelle donc le second constructeur avec
	 * THIS et ses parametres + la couleur par defaut. Et le second
	 * constructeur renvoi la couleur à FIGURE la classe ABSTRAITE
	 * pour que celle ci definisse la couleur grave à SUPER(COLOR);
	 * puis initialise le centre et le rayon.
	 * @param point
	 * @param r
	 */
	public Rond(Point point, int r) {
		this(Couleur.getCouleurDefaut(), point, r);

	}

	public Rond(Couleur color, Point point, int r) {
		super(color);
		this.centre = point;
		this.rayon = r;
	}

	@Override
	public String toString() {
		return "Rond " + getCouleur().getCode()+"  [" + centre + ", r=" + rayon + "]";
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rond other = (Rond) obj;
		if (centre == null) {
			if (other.centre != null)
				return false;
		} else if (!centre.equals(other.centre))
			return false;
		if (rayon != other.rayon)
			return false;
		return true;
	}

}
