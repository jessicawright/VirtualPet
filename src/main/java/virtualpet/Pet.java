package virtualpet;

public class Pet {
	
	//pet attributes
	private String petName;
	private String petType;
	private int petHunger;
	
	
	public Pet(String petName, String petType, int petHunger) {
		
		this.petName = petName;
		this.petType = petType;
		this.petHunger = petHunger;
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
		petHunger -= 5;
		return petHunger;
	}
}
