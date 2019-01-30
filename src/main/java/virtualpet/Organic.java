package virtualpet;

public class Organic extends Pet {

	private int petHappiness;
	private int petFullness;
	private int petEnergy;

	public Organic(String petName, String petType, int petCleanliness, int petFullness, int petHappiness, int petEnergy) {
		super(petName, petType, petCleanliness);
		this.petFullness = petFullness;
		this.petHappiness = petHappiness;
		this.petEnergy = petEnergy;

	}

	public int getPetHappiness() {
		return petHappiness;
	}

	public int getPetFullness() {
		return petFullness;
	}
	
	public int getPetEnergy() {
		return petEnergy;
	}

	public void incrementStatus() {
		super.incrementStatus();
		petFullness -= 10;
		petHappiness -= 5;
		petEnergy -= 10;
		return;

	}

	public void cleanPet() {
		super.cleanPet();
		petHappiness -= 20;
		return;
	}

	public void playPet() {
		super.playPet();
		petFullness -= 20;
		petHappiness += 25;
		petEnergy -= 20;
		return;

	}

	public void sleepPet() {
		super.sleepPet();
		petFullness -= 25;
		petHappiness += 10;
		petEnergy += 25;
		return;

	}
	
	public void feedPet() {
		petFullness += 20;
		petHappiness += 5;
		petEnergy += 5;
		return;
	}

}