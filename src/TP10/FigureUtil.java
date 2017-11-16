package TP10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collector;

public class FigureUtil {

	private static final int MAX = 99;
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

	/*
	 * public static Point[] getPoints(Figure... figTab) { int nbPoint = 0; for
	 * (Figure f : figTab) { nbPoint += f.getPoints().length; }
	 * 
	 * Point[] ptFigTab = new Point[nbPoint]; int index = 0; for (Figure f : figTab)
	 * { Point[] temp = f.getPoints(); for (int i = 0; i < temp.length; i++,
	 * index++) { ptFigTab[index] = temp[i]; } }
	 * 
	 * return ptFigTab; }
	 */

	public static Collection<Point> getPoints(Figure... figTab) {

		int nbPoint = 0;
		for (Figure f : figTab) {
			nbPoint += f.getPoints().toArray().length;
		}

		Point[] ptFigTab = new Point[nbPoint];
		int index = 0;
		for (Figure f : figTab) {
			Point[] temp = (Point[]) f.getPoints().toArray(); // ceci est un cast degueulasse;
			for (int i = 0; i < temp.length; i++, index++) {
				ptFigTab[index] = temp[i];
			}
		}
		List<Point> arrPoint = new ArrayList<Point>(Arrays.asList(ptFigTab));

		return arrPoint;
	}

	/**
	 * Cette methode permet de generer une collection de n
	 * figures choisi aleatoirement. N est choisi par l'utilisateur.
	 * @param nbFigure
	 * @return
	 */
	public static Collection<Figure> genere(int nbFigure) {
		Collection<Figure> arrFig = new ArrayList<Figure>();
		for (int i = 0; i <= nbFigure; i++) {
			arrFig.add(getRandomFigure());
		}

		return arrFig;
	}

	/**
	 * Petit methode vite faite qui permet de specifier les affichages console.
	 * @param nomTP
	 * @param test
	 */
	public static void afficheTest(String nomTP, String test) {
		System.out.println("\n \n =============  " + nomTP + "; Doit afficher : " + test);
	}

	/**
	 * Cette fonction permet de savoir quelle figure couvre le point fourni.
	 * Etant donne qu'il est possible que le point ne soit pas couvert, la methode
	 * est battie avec un Optional<>. De ce fait, il est necessaire de recuperer
	 * le resultat dans un Optional<Figure>, et de tester si l'Optional est vide 
	 * ou non.
	 *  
	 * @param point
	 * @param dessin
	 * @return
	 */
	public static Optional<Figure> getFigureEn(Point point, Dessin dessin) {
		Collection<Figure> fig = dessin.getFigures();
		Iterator<Figure> itF = fig.iterator();
		while (itF.hasNext()) {
			Figure tempFig = itF.next();
			if (tempFig.couvre(point)) {
				return Optional.of(tempFig);
			}
		}

		return Optional.empty();
	}

}
