package virtualpet;

public class Pet {
	
	//pet attributes
	private static String petName;
	private static String petType;

	
	
	public Pet(String petName, String petType) {

		this.petName = petName;
		this.petType = petType;
	}

	public static String getPetName() {
		return petName;
	}
	
	public static String getPetType() {
		return petType;
}
}
