package q;

public class Rational {
		//Question 1.a//
		private int num;
		private int denom;
		////////////////
		
		
		public Rational() {
			super();
		}
		
		public Rational(int num, int denom) {
			super();
			this.num = num;
			this.denom = denom;
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}
		public int getDenom() {
			return denom;
		}
		public void setDenom(int denom) {
			this.denom = denom;
		}
		//Question 2.a-//
		@Override
		public String toString() {
			return num+"/"+denom;
		}

		//Question 1.b-
		public static void test() {
			Rational R = new Rational(3,2);
			Rational r = new Rational(1,3);
			//Question 4: Cela permet d'évieter de créer un rationnel dont le dénominateur vaut 0.//
			if(R.denom==0) {
				System.out.println("Erreur");
			}
			else {
			System.out.println("numérateur=" + R.num + " " + "dénominateur=" + R.denom);
			System.out.println(R.toString());
			}
		}
		
		/*Question 1.c-
		 *numérateur=3 dénominateur=2
		 */
			
		/*Question 3
		 *C'est possible de créer un rationnel dont le dénominateur 
		 *est égale à 0. C'est évidemment un problème pas besoin de l'expliquer,
		 *par contre je me demande que fait la machine dans ce cas.
		 *Est-ce que l'ordinateur essaye de calculer le rationnel ou bien
		 *le cas dénominateur=0 renvoie une erreur.
		 */
		
		//Question 5.a-//
		public void mult(Rational b) {
			this.num = this.num*b.num;
			this.denom = this.denom*b.denom;
		}
		
		//Question 6//
		
		public void addit(Rational b) {
			this.num = this.num*b.denom+b.num*this.num;
			this.denom = this.denom*b.denom;
		}
		
		//Question 7//
		public static int ReducedRational(int a, int b) {
			if(b==0) {
				return a;
			}
			else {
				return ReducedRational(b,a%b);
			}
		}

}
		
		
