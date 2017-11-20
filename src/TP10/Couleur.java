package TP10;

public enum Couleur {
	Rouge ('R'), Vert ('V') , Bleu('B'), Jaune('J'), Noir('N');
	
	private char code;
	
	Couleur(char code ){
		this.code = code;
	}
	
	public String getCode() {
		return ""+code;
	}
	
	public static final Couleur getCouleurDefaut() {
		return Noir;
	}

}
