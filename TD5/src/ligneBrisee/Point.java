package ligneBrisee;

public class Point implements Comparable {

	private int x;
	private int y;
	// Attribut static compteur comptant le nombre d'objet (points) de la classe
	private static int compteur = 0;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		compteur ++;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public static int getCompteur() {
		return compteur;
	}
	

	@Override
	public void finalize() {
		compteur--;
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Point p = new Point();
		System.out.println(p.x+" "+p.y);

	}*/
	

}
