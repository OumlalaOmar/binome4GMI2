package q;

import java.util.Arrays;

public class Vector {
	private Rational [] vrat;
	private static int taille=2;
	public Vector(Rational[] vrat) {
		super();
		this.vrat = vrat;
	}
	public Vector() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rational[] getVrat() {
		return vrat;
	}
	public void setVrat(Rational[] vrat) {
		this.vrat = vrat;
	}
	public static int getTaille() {
		return taille;
	}
	public static void setTaille(int taille) {
		Vector.taille = taille;
	}
	@Override
	public String toString() {
		return Arrays.toString(vrat);
	}
	//Question 8.b-//
	public static void testv() {
		Rational v[] = { new Rational(1,2), new Rational(1,3)};
		Vector V = new Vector(v);
		System.out.println(V.toString());
	}
	/*Question 8.c-
	 *	[1/2, 1/3]
	 */
	
	//Question 9//
	//Question 9.a-//
	public void set(int i, Rational r) {
		if(i>=getTaille()) {
			System.out.println("Erreur. Vous avez entrer une valeur i supérieur à la taille du vecteur");
		}
		else {
			this.vrat[i]=r;
		}
	}
	
	//Question 9.b-//
	public static void testv1() {
		Rational v[] = { new Rational(0,1), new Rational(0,1)};
		Rational a = new Rational(2,3);
		Vector V = new Vector(v);
		System.out.println("Avant:"+V.toString());
		V.set(0, a);
		System.out.println("Après:"+V.toString());
		Rational b = new Rational(3,2);
		a.mult(b);
		System.out.println("Après la multiplication (a*b):"+V.toString());
	}
	/*
	 * 	Avant:[0/1, 0/1]
		Après:[2/3, 0/1]
		Après la multiplication (a*b):[2/3, 0/1]
	 */
	
	//Question 9.c-//
	public Rational get(int i) {
		Rational a = new Rational();
		if(i>=getTaille()) {
			System.out.println("Erreur. Vous avez entrer une valeur i supérieur à la taille du vecteur. La console va retourner");
			a = new Rational(1,1);
		}
		else {
		a = this.vrat[i];
		}
		return a;
	}
	
	//Question 9.d-//
	public static void testv2() {
		Rational v[] = { new Rational(1,2), new Rational(1,2)};
		Rational a = new Rational();
		Vector V = new Vector(v);
		System.out.println("Avant:"+V.toString());
		a = V.get(0);
		System.out.println("Après:"+V.toString());
		Rational b = new Rational(1,3);
		a.mult(b);
		System.out.println("Après la multiplication (a*b):"+V.toString());
	}
	
	/*
	 * 	Avant:[1/2, 1/2]
		Après:[1/2, 1/2]
		Après la multiplication (a*b):[1/2, 1/2]
	 */
	
	//Question 10.a-//
	public void multiplication(Rational a) {
		for(int i=0; i<getTaille(); i++ ) {
			this.vrat[i].mult(a);
		}
	}
	
	//Question 10.b-//
	public void add(Vector V) {
		if(V.getTaille()==this.getTaille()) {
			for(int i=0; i<getTaille(); i++) {
				this.vrat[i].addit(V.vrat[i]);;
			}
		}
		else {
			System.out.println("Erreur. Les vecteurs ne sont de la même taille");
		}
	}
}
	
