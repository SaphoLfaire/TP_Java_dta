package TP10;

import java.util.Random;

public class FigureUtil {

	private static final int MAX = 50;
	private static final int MIN = 1;
	private static final int NOMBRE_DE_FIGURE = 3;

	private FigureUtil() {
		// constructeur en privé pour éviter toute instanciation.
	}

	public static Rond getRandomRond() {
		Rond randomRond = new Rond(getRandomPoint(), getRandom());
		return randomRond;
	}

	public static Rectangle getRandomRectangle() {
		Rectangle randomRect = new Rectangle(getRandomPoint(), getRandom(), getRandom());
		return randomRect;
	}

	private static Point getRandomPoint() {
		Point randomPoint = new Point(getRandom(), getRandom());
		return randomPoint;
	}

	private static Carre getRandomCarre() {
		Carre randomCarre = new Carre(getRandomPoint(), getRandom());
		return randomCarre;
	}

	private static Segment getRandomSegment() {
		Segment randomSegment = new Segment(getRandomPoint(), getRandom(), true);
		return randomSegment;
	}

	private static int getRandom() {
		Random rand = new Random();
		int randomNombre = rand.nextInt(MAX - MIN + 1) + MIN;
		return randomNombre;
	}

	private static int getRandomFigureNumber() {
		Random rand = new Random();
		int rNombre = rand.nextInt(NOMBRE_DE_FIGURE - MIN + 1) + MIN;
		return rNombre;
	}

	public static Figure getRandomFigure() {
		int rNombre = getRandomFigureNumber();

		if (rNombre == 1) {
			return getRandomRond();
		}
		if (rNombre == 2) {
			return getRandomRectangle();
		}
		if (rNombre == 3) {
			return getRandomCarre();
		}
		return null;
	}

	public static Surfacable getRandomSurfacable() {
		int rNombre = getRandomFigureNumber();

		if (rNombre == 1) {
			return getRandomRond();
		}
		if (rNombre == 2) {
			return getRandomRectangle();
		}
		if (rNombre == 3) {
			return getRandomCarre();
		}
		return null;
	}

	public static Point[] getPoints(Figure... figTab) { 
		int nbPoint = 0;
		for (Figure f : figTab) {
			nbPoint += f.getPoints().length;
		}

		Point[] ptFigTab = new Point[nbPoint];
		int index = 0;
		for (Figure f : figTab) {
			Point[] temp = f.getPoints();
			for (int i = 0; i < temp.length; i++, index++) {
				ptFigTab[index] = temp[i];
			}
		}

		return ptFigTab;
	}

}
