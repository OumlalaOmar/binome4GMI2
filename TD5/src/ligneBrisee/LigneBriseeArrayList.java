package ligneBrisee;

import java.util.ArrayList;

public class LigneBriseeArrayList {
	//Question 1//
	ArrayList<Point> list;

	public LigneBriseeArrayList(ArrayList<Point> list) {
		super();
		this.list = list;
	}

	public ArrayList<Point> getList() {
		return list;
	}

	public void setList(ArrayList<Point> list) {
		this.list = list;
	}
	
	@Override
	public String toString() {
		return "LigneBriseeArrayList [list=" + list + "]";
	}

	//Question 2//
	public boolean contientPoint(Point point) {
		return this.list.contains(point);
	}
	
	//Question 3//
	public void  addPoint(Point point) {
		if(contientPoint(point)==false) {
			this.list.add(point);
		}
	}
	//Question 4//
	public void nbPoint() {
		System.out.printf("Ligne Brisée contient %d points.\n", list.size());
	}
	
	//Question 5//
	public boolean deletePoint(Point point) {
		return list.remove(point);
	}
	
}
