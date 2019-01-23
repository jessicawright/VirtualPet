package virtualpet;

public class Pet {

	private String petName;
	private String petType;
	private int petHunger;
	private boolean petAlive = (petHunger < 100);

	public Pet(String petName, String petType, int petHunger, boolean petAlive) {

		this.petName = petName;
		this.petType = petType;
		this.petHunger = petHunger;
		this.petAlive = true;
	}

	// this will be in our while loop printing out our pet died
	public boolean petAlive() {

		if (petHunger >= 100) {
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

	public int getPetHunger() {
		return petHunger;
	}

	public int feedPet() {

		if (petHunger >= 5) {
			petHunger -= 5;

			return petHunger;
		} else {
			return petHunger;
		}

	}

	public void incrementStatus() {
		petHunger += 1;
		return;

	}
}
