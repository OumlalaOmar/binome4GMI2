package geométrie;

public abstract class Rectangle extends Figure {
	
	private float longueur;
	private float largeur;
	public Rectangle(String nom, String couleur, float longueur, float largeur) {
		super(nom, couleur);
		this.longueur = longueur;
		this.largeur = largeur;
	}
	public float getLongueur() {
		return longueur;
	}
	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}
	public float getLargeur() {
		return largeur;
	}
	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}
	@Override
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
	}
	
	
	
	
}
