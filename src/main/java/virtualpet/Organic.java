package virtualpet;

public class Organic extends Pet {
	private int petHappiness; 
	private int petFullness;
	public Organic(String petName, String petType, int petFullness, boolean petAlive, int petCleanliness,
			int petHappiness, int petEnergy) {
		

		super(petName, petType, petAlive, petCleanliness, petEnergy);
		
		this.petFullness = petFullness;
		this.petHappiness = petHappiness; 
		
	}
	public int getPetHappiness() {
		return petHappiness;
	}
	
	public int getPetFullness() {
		return petFullness;
	}


}
