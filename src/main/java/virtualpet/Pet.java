package virtualpet;

public class Pet {

	private String petName;
	private String petType;
	private boolean petAlive;
	private int petCleanliness;

	public Pet(String petName, String petType, int petCleanliness) {

		this.petName = petName;
		this.petType = petType;
		this.petAlive = true;
		this.petCleanliness = petCleanliness;
	}

	public String getPetName() {
		return petName;
	}

	public String getPetType() {
		return petType;
	}

	public boolean getPetAlive() {
		return petAlive;
	}

	public int getPetCleanliness() {
		return petCleanliness;
	}

	public void incrementStatus() {
		petCleanliness -= 5;
		return;

	}

	public void cleanPet() {
		petCleanliness += 50;
		return;
	}

	public void playPet() {
		petCleanliness -= 10;
		return;

	}

	public void sleepPet() {
		System.out.println("You pet slept for 2 hours");
		return;

	}
	
	public void feedPet() {
		return;
	}

}
