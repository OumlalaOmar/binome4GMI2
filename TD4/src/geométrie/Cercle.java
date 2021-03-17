package geométrie;

public abstract class Cercle extends Figure {

	private float rayon;

	public Cercle(String nom, String couleur, float rayon) {
		super(nom, couleur);
		this.rayon = rayon;
	}

	public float getRayon() {
		return rayon;
	}

	public void setRayon(float rayon) {
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + ", toString()=" + super.toString() + "]";
	}
	
}
