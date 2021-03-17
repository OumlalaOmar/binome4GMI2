package zoo;
import java.util.LinkedList;

public class Zoo_CY_Tech {
		private String nom ;
		private LinkedList <Animal> animaux;
		
		public Zoo_CY_Tech(String nom, LinkedList<Animal> animaux) {
			super();
			this.nom = nom;
			this.animaux = animaux;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public LinkedList<Animal> getAnimaux() {
			return animaux;
		}

		public void setAnimaux(LinkedList<Animal> animaux) {
			this.animaux = animaux;
		}
		
		public void ajouterAnimal (Animal animal) {
			animaux.add(animal);
		}
		
		public void crier() {
			for(Animal a : animaux) {
				a.crier();
			}
		}

		@Override
		public String toString() {
			return "Zoo_CY_Tech [nom=" + nom + ", animaux=" + animaux + "]";
		}
		
		
		
		
}
