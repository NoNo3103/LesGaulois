public class Gaulois {
<<<<<<< HEAD
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	private String nom;
	private int force;
	private int effetPotion =1;
	
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
		return "Le gaulois" + nom + ":" ;
		// TODO Auto-generated method stub
	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un grand coup dans la machoire" + romain.getNom());
		
	}
	}

	public static void main(String[] args) {
		
	}
=======
	private String nom;
	private int force;
	private int effetPotion = 1;
	public Gaulois(String nom, int force) {
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
		return "Le gaulois " + nom + " : ";
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
		+ romain.getNom());
		romain.recevoirCoup((force / 3) * effetPotion);
	}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force
	+ ", effetPotion=" + effetPotion + "]";
	}
	public static void main(String[] args) {
>>>>>>> 22c2d202e7ee39337197402f0ba2087bc7183e73

	}
