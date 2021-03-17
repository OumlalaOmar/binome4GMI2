package geométrie;

public class Carre extends Rectangle {
	private double rayon;

	public Carre(String nom, String couleur, float longueur, float largeur, double rayon) {
		super(nom, couleur, longueur, largeur);
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Carre [rayon=" + rayon + "]";
	}
	
	
}
