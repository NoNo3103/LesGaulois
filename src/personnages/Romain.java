package personnages;

public class Romain {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");

	}

	private String prendreParole() {
		return "Le gaulois" + nom + ":";
	}



	public static void main(String[] args) {

	}

	public void recevoirCoup(int i) {
		// TODO Auto-generated method stub
		
	}
}