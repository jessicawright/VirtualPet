package virtualpet;

public class Pet {

	private static String petName;
	private static String petType;
	private int petHunger;

	public Pet(String petName, String petType, int petHunger) {

		this.petName = petName;
		this.petType = petType;
		this.petHunger = petHunger;
	}

	public static String getPetName() {
		return petName;
	}

	public static String getPetType() {
		return petType;
	}

	public int getPetHunger() {
		return petHunger;
	}

	public void feedPet() {
		petHunger -= 5;
		return;
	}

	public void incrementPetHunger() {
		petHunger += 1;
		return;

	}
}
