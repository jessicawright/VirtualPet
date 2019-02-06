package virtualpet;

public class Organic extends Pet {

	private int petHappiness;
	private int petFullness;
	private int petCleanliness;
	private int petEnergy;

	public Organic(String petName, String petType, boolean petAlive, int deathValue, int petFullness,
			int petCleanliness, int petHappiness, int petEnergy) {

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
		if (petFullness >= 100) {
			petFullness = 100;
			System.out.println("Your pet is allready full.");
		}
		if (petCleanliness <= 0) {
			petCleanliness = 0;
		}
		return;

	}

	public void incrementStatus() {
		super.incrementStatus();
		petFullness -= 5;
		petHappiness -= 3;
		petCleanliness -= 5;
		if (petCleanliness <= 0) {
			petCleanliness = 0;
		}
		petEnergy -= 5;
		if (petEnergy <= 0) {
			petEnergy = 0;
		}
		if (petHappiness <= 0) {
			petHappiness = 0;
		}
		die();
		return;
	}

	public int getPetCleanliness() {
		return petCleanliness;
	}

	public void cleanPet() {
		petCleanliness += 50;
		if (petCleanliness >= 100) {
			petCleanliness = 100;
		}
		return;

	}

	public void playPet() {
		petHappiness += 50;
		petCleanliness -= 20;
		petEnergy -= 10;
		if (petCleanliness <= 0) {
			petCleanliness = 0;
		}
		if (petEnergy <= 0) {
			petEnergy = 0;
			
		if (petHappiness >= 100) {
			petHappiness = 100;
			}
		}
		return;

	}

	public int getPetEnergy() {
		return petEnergy;
	}

	public int sleepPet() {
		System.out.println("You pet slept for 2 hours");
		petEnergy += 25;
		if (petEnergy >= 100) {
			petEnergy = 100;
		}
		return petEnergy;

	}

	public void die() {
		if (petFullness <= 0) {
			super.die();
		}
	}

	public void sendToVet() {
		super.sendToVet();
		petFullness = 100;
		petHappiness = 100;
		petCleanliness = 100;
		petEnergy = 100;
		return;
	}

	public void healthWarning() {
		if (petFullness <= 20) {
			System.out.println("WARNING: Your Pet is dying, \nTake your pet to the nearest Vet.");
			System.out.println();
		}
	}

} // close class
