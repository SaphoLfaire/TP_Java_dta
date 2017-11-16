package TP10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Carre extends Rectangle {

	public Carre(Point point, int cote) {
		super(point, cote, cote);
	}

	protected String getType() {
		return "Carre ";
	}

	public Collection<Point> getPoints() {
		List<Point> carTab = new ArrayList<>();
		carTab.add(getPointBasDroit());
		carTab.add(getPointHautDroit());
		carTab.add(getPointBasGauche());
		carTab.add(getPointHautGauche());

		return carTab;

	}

}
