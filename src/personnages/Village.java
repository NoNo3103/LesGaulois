package personnages;

public class Village {
	private int nbVillageoisMax;

	public Village(int nombreVillageoisMax, int[] villageois) {
		super();
		this.nbVillageoisMax = nombreVillageoisMax;
		this.villageois = villageois;
		this.villageois = Gaulois[nombreVillageoisMax];
	}
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	int villageois[] = new int[10];
	
	public Village(String nom) {
		this.nom = nom;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	
    
	}
}
