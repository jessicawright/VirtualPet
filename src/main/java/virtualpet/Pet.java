package virtualpet;

public class Pet {
	
	//pet attributes
	private String petName;
	private String petType;

	
	
	public Pet(String petName, String petType) {

		this.petName = petName;
		this.petType = petType;
	}

	public String getPetName() {
		return petName;
	}
	
	public String getPetType() {
		return petType;
}
}
