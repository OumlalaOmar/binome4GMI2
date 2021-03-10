package ligneBrisee;

import java.util.TreeSet;

public class LigneBriseeTreeSet {
	TreeSet<Point> TSL;

	public LigneBriseeTreeSet(TreeSet<Point> tSL) {
		super();
		TSL = tSL;
	}

	public TreeSet<Point> getTSL() {
		return TSL;
	}

	public void setTSL(TreeSet<Point> tSL) {
		TSL = tSL;
	}

	@Override
	public String toString() {
		return "LigneBriseeTreeSet [TSL=" + TSL + "]";
	}
	
	//Question 2//
	public boolean contientPoint(Point point) {
		return this.TSL.contains(point);
	}
	
	//Question 3//
	public void addPoint(Point point) {
		if(contientPoint(point)==false) {
			this.TSL.add(point);
		}
		else {
			System.out.println("Erreur. Le point est dans la Ligne.");
		}
	}
	
	//Question 4//
	public void nbPoint() {
		System.out.printf("LigneBrisee contient %d points.", TSL.size());
	}
	
	//Question 5//
	public void deletePoint(Point point) {
		if(contientPoint(point)==true) {
			this.TSL.remove(point);
		}
		else {
			System.out.println("Erreur. Le point n'est pas dans la Ligne");
		}
	}
}
