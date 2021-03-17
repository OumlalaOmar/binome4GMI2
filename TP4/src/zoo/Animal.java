package zoo;

public class Animal {
	private String nom;
	protected int poids;
	
	
	public Animal(String nom, int poids) {
		super();
		this.nom = nom;
		this.poids = poids;
	}
	
	
	
	public void crier() {
		Animal nom = new Animal();
		System.out.println(nom + "crie...");
		
	}
}

	
