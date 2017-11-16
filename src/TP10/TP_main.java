package TP10;

import java.util.Collection;
import java.util.Optional;

public class TP_main {

	public static void main(String[] args) {
		FigureUtil.afficheTest("TP10", "Point + coordonnees");
		Point p1 = new Point(5, 2);
		System.out.println(p1);
		System.out.println(p1.getX());
		System.out.println(p1.getY());

		FigureUtil.afficheTest("TP10", "rond.affiche() + rectangle.affiche()");
		Rond rd1 = new Rond(p1, 4);
		rd1.affiche();

		Rectangle rt1 = new Rectangle(new Point(10, 3), 2, 6);
		rt1.affiche();

		FigureUtil.afficheTest("TP12", "carre.affiche()");
		Carre carre = new Carre(p1, 5);
		carre.affiche();

		FigureUtil.afficheTest("TP13", "true puis false");
		Point p2 = new Point(5, 2);
		Point p3 = new Point(6, 3);

		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));

		FigureUtil.afficheTest("TP14", "Classe Figure + getRandomFigure()");
		Figure randomFig = FigureUtil.getRandomFigure();
		randomFig.affiche();

		FigureUtil.afficheTest("TP15", "segment.affiche() + getRandomSurfacable()");
		Figure segment = new Segment(p1, 5, true);
		segment.affiche();

		Surfacable sur = FigureUtil.getRandomSurfacable();
		System.out.println(sur.toString());

		FigureUtil.afficheTest("TP20", "getPoints");
		randomFig.affiche();
		for (Point x : randomFig.getPoints()) {
			System.out.println(x);
		}

		FigureUtil.afficheTest("TP21", "toues les figures generees aleatoirement");
		Collection<Figure> figList = FigureUtil.genere(5);
		figList.forEach(w -> w.affiche());

		FigureUtil.afficheTest("TP22", "couvre sur rond, rectangle et segment (true, false, false)");
		System.out.println(rd1.couvre(p1));
		System.out.println(rt1.couvre(p1));
		System.out.println(segment.couvre(p1));
		
		FigureUtil.afficheTest("TP22", "(getFigureEn()) le rond puis rien");
		Dessin dessin = new Dessin();
		dessin.add(segment);
		dessin.add(rt1);
		dessin.add(rd1);
		dessin.add(carre);
		Point p4 = new Point(50,54);
		
		Optional<Figure> resOp2 = FigureUtil.getFigureEn(p1, dessin);
		if (resOp2.isPresent()) {
			Figure resFig2 = resOp2.get();
			resFig2.affiche();
		}
		else {
			System.out.println("Pas de figure ! le point n'est couvert par rien");
		}
		
		Optional<Figure> resOp = FigureUtil.getFigureEn(p4, dessin);
		if (resOp.isPresent()) {
			Figure resFig = resOp.get();
			resFig.affiche();
		}
		else {
			System.out.println("Pas de figure ! le point n'est couvert par rien");
		}
		
		


	}

}
