package virtualpet;

public class Pet {

	private String petName;
	private String petType;
	private int petCleanliness;
	private int petEnergy;
	
<<<<<<< HEAD
	
	

	public Pet(String petName, String petType, int petFullness, 
			boolean petAlive, int petCleanliness, int petHappiness, int petEnergy) {
=======
	public Pet(String petName, String petType, int petCleanliness, int petEnergy) {
>>>>>>> ade573031d63ae9075ba7e8a81fd6d7670a800f9

		this.petName = petName;
		this.petType = petType;
		this.petCleanliness = petCleanliness;
		this.petEnergy = petEnergy;
	}

	public String getPetName() {
		return petName;
	}

	public String getPetType() {
		return petType;
	}

	public void incrementStatus() {
		// petFullness -= 5;
		petCleanliness -= 5;
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

	public void feedPet() {
		petCleanliness -= 5;
		return;

	}

}
