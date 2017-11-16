package TP10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Dessin {
	/**
	 * Choix d'un arrayList : 
	 * pas besoin d'une structure cle-valeur;
	 * pas besoin de limiter les doublons (en cas de copie colle de l'utilisateur);
	 * pas besoin d'un acces rapide;
	 * nombre d'element limite, mais on suppose que l'utilisateur ne va pas se prendre pour leonard de vinci;
	 * on suppose que l'utilisateur ne va pas faire des dessins elabore : pas beaucoup de suppression/insertion;
	 * 
	 */
	private List<Figure> arrF = new ArrayList<Figure>();
	
	public Dessin() {
		
	}
	
	public boolean add (Figure figure) {		
		return arrF.add(figure);
	}
	
	public Collection<Figure> getFigures(){
		return arrF;
		
	}
	

}
