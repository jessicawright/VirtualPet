package virtualpet;

public class Pet {

	private String petName;
	private String petType;
	private int petFullness;
	private boolean petAlive;
	private int petCleanliness;
	private int petHappiness; 
	private int petEnergy; 
	
	

	public Pet(String petName, String petType, int petFullness, boolean petAlive, int petCleanliness, int petHappiness, int petEnergy) {

		this.petName = petName;
		this.petType = petType;
		this.petFullness = petFullness;
		this.petAlive = true;
		this.petCleanliness = petCleanliness;
		this.petHappiness = petHappiness; 
		this.petEnergy  = petEnergy; 
	}

	// this will be in our while loop printing out our pet died
	public boolean petAlive() {

		if ((petFullness <= 0) || (petFullness >= 120)) {
			return false;
		} else
			return true;
	}

	public String getPetName() {
		return petName;
	}

	public String getPetType() {
		return petType;
	}

	public int feedPet() {
		petFullness += 25;
		return petFullness;

	}

	public void incrementStatus() {
		petFullness -= 5;
		petCleanliness -=5;
		return;

	}

	public int getPetFullness() {
		return petFullness;
	}

	public int getPetCleanliness() {
		return petCleanliness;
	}

	public int cleanPet() {
		petCleanliness += 50;
		return petCleanliness;
	}
	
	public int getPetHappiness() {
		return petHappiness;
	}
	
	public int playPet() {
		petHappiness += 25;
		petCleanliness -= 20;
		petEnergy -= 10;
		petFullness -= 10;
		return petHappiness;

	}
	
	public int getPetEnergy() {
		return petEnergy;
	}
	
	public int sleepPet() {
		System.out.println("You pet slept for 2 hours");
		petEnergy += 25; 
		petFullness -= 10;
		return petEnergy;

	}

}

