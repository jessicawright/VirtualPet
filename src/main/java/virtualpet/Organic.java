package virtualpet;

public class Organic extends Pet {

	private int petHappiness;
	private int petFullness;
	private int petCleanliness;
	private int petEnergy;
	private String petFullnessBar;
	private String petHappinessBar;
	private String petCleanlinessBar;
	private String petEnergyBar;

	public Organic(String petName, String petType, boolean petAlive, int deathValue, int petFullness,
			int petCleanliness, int petHappiness, int petEnergy) {

		//The super keyword refers to superclass (parent) objects. 
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
			System.out.println("Your pet is already full.");
		}
		if (petCleanliness <= 0) {
			petCleanliness = 0;
		}

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
		updatePetFullnessBar();
		updatePetHappinessBar();
		updatePetCleanlinessBar();
		updatePetEnergyBar();
		showPetStatus();
		healthWarning();
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
		}
		if (petHappiness >= 100) {
			petHappiness = 100;
		}

	}

	public int getPetEnergy() {
		return petEnergy;
	}

	public int sleepPet() {

		petEnergy += 25;
		if (petEnergy >= 100) {
			petEnergy = 100;
		}
		return petEnergy;

	}

	public void die() {
		if (petFullness <= 0) {
			super.die();
			System.out.println(getPetName() + " has perished.");
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
			System.out.println("*** WARNING: " + getPetName() + " is dying! ***");

		}
	}
	

	public void updatePetFullnessBar() {
		if (petFullness >= 90) {
			petFullnessBar = "[****]";
		}
		if (petFullness >= 66 && petFullness <= 89) {
			petFullnessBar = "[*** ]";
		}
		if (petFullness >= 33 && petFullness <= 65) {
			petFullnessBar = "[**  ]";
		}
		if (petFullness >= 1 && petFullness <= 32) {
			petFullnessBar = "[*   ]";
		}

	}

	public void updatePetHappinessBar() {
		if (petHappiness >= 90) {
			petHappinessBar = "[****]";
		}
		if (petHappiness >= 66 && petHappiness <= 89) {
			petHappinessBar = "[*** ]";
		}
		if (petHappiness >= 33 && petHappiness <= 65) {
			petHappinessBar = "[**  ]";
		}
		if (petHappiness >= 1 && petHappiness <= 32) {
			petHappinessBar = "[*   ]";
		}
		if (petHappiness == 0) {
			petHappinessBar = "[    ]";
		}
	}

	public void updatePetCleanlinessBar() {
		if (petCleanliness >= 90) {
			petCleanlinessBar = "[****]";
		}
		if (petCleanliness >= 66 && petCleanliness <= 89) {
			petCleanlinessBar = "[*** ]";
		}
		if (petCleanliness >= 33 && petCleanliness <= 65) {
			petCleanlinessBar = "[**  ]";
		}
		if (petCleanliness >= 1 && petCleanliness <= 32) {
			petCleanlinessBar = "[*   ]";
		}
		if (petCleanliness == 0) {
			petCleanlinessBar = "[    ]";
		}
	}

	public void updatePetEnergyBar() {
		if (petEnergy >= 90) {
			petEnergyBar = "[****]";
		}
		if (petEnergy >= 66 && petEnergy <= 89) {
			petEnergyBar = "[*** ]";
		}
		if (petEnergy >= 33 && petEnergy <= 65) {
			petEnergyBar = "[**  ]";
		}
		if (petEnergy >= 1 && petEnergy <= 32) {
			petEnergyBar = "[*   ]";
		}
		if (petEnergy == 0) {
			petEnergyBar = "[    ]";
		}
	}

	public void showPetStatus() {
		System.out.println("\t" + getPetName() + "'s status - Fullness: \t" + petFullnessBar + "\t Cleanliness: \t \t" + petCleanlinessBar + "\t Energy: \t" + petEnergyBar + "\t Happiness:  \t" + petHappinessBar);

	}

} // close class
