package virtualpet;

public class Pet {

	private static String petName;
	private static String petType;
	private int petHunger;
	private static boolean petAlive = true;

	public Pet(String petName, String petType, int petHunger, boolean petAlive) {

		this.petName = petName;
		this.petType = petType;
		this.petHunger = petHunger;
		this.petAlive = true;
	}

	
	public static boolean petAlive() {
		if (petAlive) {
			return true;
		}
		return false;
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

	public void incrementStatus() {
		petHunger += 1;
		return;

	}
}
