package geométrie;

public class Point {

	private int x;
	private int y;
	private static int compteur=0;
	
	public Point(int x, int y) {
		super();
		this.x=x;
		this.y=y;
		
	}
	
	public int getX() {
		return x;
	}
	
	public void setX() {
		this.x=x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY() {
		this.y=y;
	}
	
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
}

