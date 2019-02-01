package virtualpet;

public class Organic extends Pet {
	private boolean petOrganicAlive;
	private int petHappiness;
	private int petFullness;
	private int petCleanliness;
	private int petEnergy;

	public Organic(String petName, String petType, boolean petAlive, int deathValue, int petFullness, int petCleanliness,
			int petHappiness, int petEnergy) {

		super(petName, petType, petAlive, deathValue);

		this.petFullness = petFullness;
		this.petHappiness = petHappiness;

		this.petCleanliness = petCleanliness;
		this.petEnergy = petEnergy;

	}

	public int getPetHappiness() {
		return petHappiness;
	}

	public int getPetFullness() {
		return petFullness;
	}

	public void feedPet() {
		petCleanliness -= 5;
		petFullness += 25;
		return;

	}

	public void incrementStatus() {
		super.incrementStatus();
		petFullness -= 5;
		petHappiness -= 3;
		die();
		return;
	}

	public int getPetCleanliness() {
		return petCleanliness;
	}

	public void cleanPet() {
		petCleanliness += 50;

		return;
	}

	public void playPet() {

		petCleanliness -= 20;
		petEnergy -= 10;

		return;

	}

	public int getPetEnergy() {
		return petEnergy;
	}

	public int sleepPet() {
		System.out.println("You pet slept for 2 hours");
		petEnergy += 25;
		// petFullness -= 10;
		return petEnergy;

	}

	public void die() {
		if ((petFullness <= 0) || (petFullness >= 120)) {
			deathValue = -1;
		}
	}

} // close class
