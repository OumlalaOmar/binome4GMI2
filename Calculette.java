import java.util.Scanner;
public class Calculette {
	    public static void Q1(String[] args) {
	    	Scanner sc;
	    	sc = new Scanner(System.in);
	    	System.out.println("Saisir un entier : ");
	    	int value;
	    	value = sc.nextInt();
	    	System.out.println(value);
	    	sc.close() ; // fermeture de l’entrée
	    }
	    
	    public static void Q2(String[] args) {
	    	Scanner sc;
	    	sc = new Scanner(System.in);
	    	System.out.println("Saisir un entier : ");
	    	int value;//Déclaration de la variable de type int//
	    	value = sc.nextInt();
	    	System.out.println(value);
	    	sc.close() ; // fermeture de l’entrée
	    }
	    
	    public static void Q3(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Saisir un entier : ");
	    	int value;
	    	value = sc.nextInt();
	    	System.out.println(value);
	    	sc.close() ; // fermeture de l’entrée
	    }
	    
	    public static void Q4(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Saisir un entier : ");
	    	int x;
	    	x = sc.nextInt();
	    	System.out.println("Saisir un entier : ");
	    	int y;
	    	y = sc.nextInt();
	    	System.out.println(x+y);
	    	sc.close() ; // fermeture de l’entrée
	    }
	    
	    public static void Q5(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Saisir un entier : ");
	    	int x;
	    	x = sc.nextInt();
	    	System.out.println("Saisir un entier : ");
	    	int y;
	    	y = sc.nextInt();
	    	System.out.println(x+y);
	    	System.out.println(x*y);
	    	System.out.println(x/y);
	    	System.out.println(x%y);
	    	sc.close() ; // fermeture de l’entrée
	    }
	    
	    public static void Q6(String[] args) {
	        // TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Saisir l'entier 1 : ");
	        int value1 = sc.nextInt();
	        System.out.println("Saisir l'entier 2 : ");
	        int value2 = sc.nextInt();
	        System.out.println("Saisir l'entier 3 : ");
	        int value3 = sc.nextInt();
	        System.out.println("Saisir l'entier 4 : ");
	        int value4 = sc.nextInt();
	        if ((value1>value2) && (value1>value3)&& (value1>value4)){
	            System.out.println("l'entier le plus grand est : "+ value1);
	        }
	        if ((value2>value1) && (value2>value3)&& (value2>value4)){
	            System.out.println("l'entier le plus grand est : "+ value2);
	        }
	        if ((value3>value1) && (value3>value2)&& (value3>value4)){
	            System.out.println("l'entier le plus grand est : "+ value3);
	        }
	        if ((value4>value1) && (value4>value2)&& (value4>value3)){
	            System.out.println("l'entier le plus grand est : "+ value4 );
	        }
	        
	        
	        sc.close();
	    }
	    
	    public static void Q7(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Saisir un entier : ");
	        int value;
	        value=sc.nextInt();
	        if(value==0) {
	        	System.out.println(1);
	        }
	        int n=1;
	        for(int i=1; i<=value;i++) {
	        	n=n*i;
	        }
	        System.out.println(n);
	        sc.close() ;
	    }
	        
	   public static void Q8(String[] args) {
		   Scanner sc= new Scanner(System.in);
		   System.out.println("Saisir un entier positif : ");
	       int value;
	       value=sc.nextInt();
	       int x=value-1;
	       int a=1;
	       for(int i=2; i<=x; i++) {
	    	   if(value%i==0) {
	    		   System.out.println("Votre nombre n'est pas premier.");
	    		   a=0;
	    		   break;
	    	   }
	       }
	       if(a==1) {
	    	   System.out.println("Votre nombre est premier.");
	       }
	       sc.close() ;
	   }
	

	public static void main(String[] args) {
		Calculette.Q1(args);
		Calculette.Q2(args);
		Calculette.Q3(args);
		Calculette.Q4(args);
		Calculette.Q5(args);
		Calculette.Q6(args);
		Calculette.Q7(args);
		Calculette.Q8(args);
	}
}

