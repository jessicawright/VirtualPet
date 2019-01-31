package virtualpet;

public class Organic extends Pet {
	private boolean petOrganicAlive;
	private int petHappiness;
	private int petFullness;

	public Organic(boolean petOrganicAlive, String petName, String petType, int petFullness, int petCleanliness,
			int petHappiness, int petEnergy) {

<<<<<<< HEAD
		super(petName, petType, petEnergy, petAlive, petCleanliness, petEnergy, petEnergy);
		
=======
		super(petName, petType, petCleanliness, petEnergy);
		this.petOrganicAlive = petOrganicAlive;
>>>>>>> ade573031d63ae9075ba7e8a81fd6d7670a800f9
		this.petFullness = petFullness;
		this.petHappiness = petHappiness;

	}

	public boolean getPetOrganicAlive() {

		if ((petFullness <= 0) || (petFullness >= 120)) {
			return false;
		} else
			return true;
	}

	public int getPetHappiness() {
		return petHappiness;
	}

	public int getPetFullness() {
		return petFullness;
	}

	public void feedPet() {
		super.feedPet();
		petFullness += 25;
		if (petFullness > 120 || petFullness < 0) {
			petOrganicAlive = false;
		}
		return;

	}

	public void incrementStatus() {
		super.incrementStatus();
		petFullness -= 5;
		petHappiness -= 3;
		return;
	}

	public void playPet() {
		super.playPet();
		petHappiness += 25;
		petFullness -= 10;
		return;
	}

} // close class
