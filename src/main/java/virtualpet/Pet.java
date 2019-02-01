package virtualpet;

public class Pet {

	private String petName;
	private String petType;
	private boolean petAlive;

	public Pet(String petName, String petType, boolean petAlive) {

		this.petName = petName;
		this.petType = petType;
		this.petAlive = true;
	}

	public String getPetName() {
		return petName;
	}

	public String getPetType() {
		return petType;
	}

	public void incrementStatus() {
		
		return;

	}


	public boolean isPetAlive() {
		return petAlive;
	}

	public void setPetAlive(boolean petAlive) {
		this.petAlive = petAlive;
	}


	public  boolean getPetAlive() {
		
		return petAlive;
	}

}
