package ligneBrisee;

import java.util.Map;

public class LigneBriseeMap {
	private Map<Point, Integer> m;

	public LigneBriseeMap(Map<Point, Integer> m) {
		super();
		this.m = m;
	}

	public Map<Point, Integer> getM() {
		return m;
	}

	public void setM(Map<Point, Integer> m) {
		this.m = m;
	}

	@Override
	public String toString() {
		return "LigneBriseeMap [m=" + m + "]";
	}
	
	//Question 2//
	public boolean contientPoint(Point point) {
		return this.m.containsKey(point);
	}
	
	//Question 3//
	public void addPoint(Point point) {
		if(contientPoint(point)==false) {
			this.m.put(point, null);
		}
		else {
			System.out.println("Erreur. Le point est dans la Ligne.");
		}
	}
	
	//Question 4//
	public void nbPoints() {
		System.out.printf("LigneBrisee contient %d points", this.m.size());
	}
	
	//Question 5//
	public void deletePoint(Point point) {
		this.m.remove(point, null);
	}
}
