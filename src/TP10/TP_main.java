package TP10;

public class TP_main {

	public static void main(String[] args) {

		Point p1 = new Point(5, 2);
		System.out.println(p1);
		System.out.println(p1.getX());
		System.out.println(p1.getY());

		Rond rd1 = new Rond(p1, 4);
		rd1.affiche();

		Rectangle rt1 = new Rectangle(new Point(10, 3), 2, 6);
		rt1.affiche();

		Carre carre = new Carre(p1, 5);
		System.out.println(carre.toString());

		Point p2 = new Point(5, 2);
		Point p3 = new Point(6, 3);

		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));

		Figure f = new Rond(p1, 5);
		System.out.println(f.toString());

		Figure g = FigureUtil.getRandomFigure();

		g.affiche();
		
		Figure s = new Segment( p1, 5, true);
		s.affiche();
		
		Surfacable sur = FigureUtil.getRandomSurfacable();
		System.out.println(sur.toString());
		
		for (Point x: g.getPoints()) {
			System.out.println(x);
		}
		
		
		

	}

}
