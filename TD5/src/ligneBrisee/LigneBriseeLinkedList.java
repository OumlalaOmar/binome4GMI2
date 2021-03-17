package ligneBrisee;
import java.util.LinkedList;

public class LigneBriseeLinkedList {
	private LinkedList<Point> points;

	public LigneBriseeLinkedList(LinkedList<Point> points) {
		super();
		this.points = points;
	}

	public LinkedList<Point> getPoints() {
		return points;
	}

	public void setPoints(LinkedList<Point> points) {
		this.points = points;
	}
	
	
	@Override
	public String toString() {
		return "LigneBriseeLinkedList [points=" + points + "]";
	}

	//Question 2//
	public boolean contientPoint(Point point) {
		return points.contains(point);
	}
	
	//Question 3//
	public void addPoint(Point point) {
		if(contientPoint(point)==false) {
			points.add(point);
		}
	}
	
	//Question 4//
	public void nbPoints() {
		System.out.printf("LigneBrisee contient %d point(s).", points.size());
	}
	
	//Question 5//
	public boolean deletePoint(Point point) {
		return points.remove(point);
	}
	
}
