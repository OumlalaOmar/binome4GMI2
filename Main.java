package geométrie;

public class Main {
	public static void main(String[] args) {
	LigneBrisee l = new LigneBrisee();
    Point p1= new Point(1,2);
	l.addPoint(p1);
	System.out.println(l.toString());
    Point p3= new Point(3,4);
	l.addPoint(p3);
	System.out.println(l.toString());
    Point p= new Point(0,6);
	l.addPoint(p);
	System.out.println(l.toString());
   
    System.out.println(l.toString());
    l.deletePoint(p3);
    System.out.println(l.toString());
	}
}
