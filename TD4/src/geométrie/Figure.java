package geométrie;

public abstract class Figure {
	private String nom;
	private String couleur;
	
	public Figure(String nom, String couleur) {
		super();
		this.nom = nom;
		this.couleur = couleur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	@Override
	public String toString() {
		return "Figure [nom=" + nom + ", couleur=" + couleur + "]";
	}
	
	public abstract float getperimetre();
	public abstract float getsurface();
	
}
