public class Romain {
<<<<<<< HEAD

	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}

}
=======
	private String nom;
	private int force;
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
	if (force > 0) {
		parler("Aïe");
	} else {
		parler("J'abandonne...");
	}
	}
>>>>>>> 22c2d202e7ee39337197402f0ba2087bc7183e73
