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
		Point p4 = new Point(50, 54);

		Optional<Figure> resOp2 = FigureUtil.getFigureEn(p1, dessin);
		if (resOp2.isPresent()) {
			Figure resFig2 = resOp2.get();
			resFig2.affiche();
		} else {
			System.out.println("Pas de figure ! le point n'est couvert par rien");
		}

		Optional<Figure> resOp = FigureUtil.getFigureEn(p4, dessin);
		if (resOp.isPresent()) {
			Figure resFig = resOp.get();
			resFig.affiche();
		} else {
			System.out.println("Pas de figure ! le point n'est couvert par rien");
		}

		FigureUtil.afficheTest("TP23", "true, false, true, false, true, false, true, true");
		Rond rd2 = new Rond(p1, 4);
		Rond rd3 = new Rond(p1, 3);
		System.out.println(rd1.equals(rd2));// true
		System.out.println(rd1.equals(rd3));// false

		Figure segment2 = new Segment(p1, 5, true);
		Figure segment3 = new Segment(p1, 4, true);
		System.out.println(segment.equals(segment2));// true
		System.out.println(segment.equals(segment3));// false
		
		
		Rectangle rt4 = new Rectangle(new Point(10, 3), 2, 6);
		Rectangle rt2 = new Rectangle(new Point(10, 3), 2, 6);
		Rectangle rt3 = new Rectangle(new Point(10, 3), 5, 6);
		System.out.println(rt4.equals(rt2));// true
		System.out.println(rt1.equals(rt3));// false

		Carre carre2 = new Carre(p1, 5);
		Rectangle rtcarre = new Rectangle(p1, 5, 5);
		System.out.println(carre.equals(carre2)); // true
		System.out.println(carre.equals(rtcarre)); // true
		System.out.println("segment vs rectangle carre");
		System.out.println(segment2.equals(rtcarre));
		System.out.println("segment vs carre");
		System.out.println(segment2.equals(carre));
		System.out.println("segment vs rond");
		System.out.println(segment2.equals(rd1));
		System.out.println("rond vs rectagnle");
		System.out.println(rd1.equals(rt1));
		System.out.println("rond vs carre");
		System.out.println(rd1.equals(carre));

		FigureUtil.afficheTest("TP24", "distance + compareTo()");
		System.out.println(rt1.distanceOrigine());
		System.out.println(rd1.distanceOrigine());
		System.out.println(carre.distanceOrigine());
		System.out.println(segment3.distanceOrigine());
		System.out.println(segment3.compareTo(rd1));
		
		FigureUtil.afficheTest("TP24", "trieProcheOrigine");
		System.out.println(FigureUtil.trieProcheOrigine(dessin));
		

		FigureUtil.afficheTest("TP30", "Bleu, Jaune, Noir");

		System.out.println(Couleur.Bleu);
		System.out.println(Couleur.Jaune);
		System.out.println(Couleur.getCouleurDefaut());

		FigureUtil.afficheTest("TP30", "rond jaune");

		Rond rd4 = new Rond(Couleur.Jaune, p1, 5);
		System.out.println(rd4.getCouleur());
		rd4.affiche();
		
		/**
		FigureUtil.afficheTest("TP trhead", "suite de 1 et de 2");
		MonThread t1 = new MonThread ("1", 15);
		MonThread t2 = new MonThread ("2", 20);
		t1.start();
		t2.start();
		*/

	}

}
