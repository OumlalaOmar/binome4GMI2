package geométrie;

import java.util.Arrays;

public class LigneBrisee {
	private Point [] points;
	private static int taille=3;
	
	public LigneBrisee(Point[] points) {
		super();
		if(points!=null) {
			this.points= new Point[taille];
		}
		else {
			this.points=points;
		}
	}
	
	public LigneBrisee() {
		this.points= new Point[taille];
	}

	public Point[] getPoints() {
		return points;
	}

	public void setPoints(Point[] points) {
		this.points = points;
	}

	public static int getTaille() {
		return taille;
	}

	public static void setTaille(int taille) {
		LigneBrisee.taille = taille;
	}

	@Override
	public String toString() {
		return "LigneBrisee [points=" + Arrays.toString(points) + "]";
	}

////////////J'ai un problème ici la méthode renvoie bien un boolean et pourtant l'éditeur me dit que la méthode ne renvoie pas de booléan//
	public boolean contientPoint(Point point) {
		for(int i=0;i<getTaille();i++) {
			if(points[i]==point) {
				return true;
			}
		}
		return false;
	}

	public void addPoint(Point point) {
		for(Point p: points) {
			if(contientPoint(point)==true) {
				
			}
			else {
				p=point;
			}
		}
	}
	
	public int nbPoints() {
		int i=0;
		for(Point p: points) {
			if(p!=null) {
				i++;
			}
		}
		return i;
	}
	
	public int nbMaxPoints() {
		int i=0;
		for(Point p: points) {
			if(p.equals(null)) {
				i++;
			}
		}
		return i;
	}
	
	public void deletePoint(Point point) {
		int i=0;
		for(Point p: points) {
			if(p.equals(point)) {
				p=null;//problème ici: comment définir p="vide"//
				for(int j=i;j<getTaille();i++) {
					Point c=points[j+1];
					points[j]=c;
					setTaille(i);
				}
			}
			i++;
		}
	}
}
