package virtualpet;

public class Pet {

	private String petName;
	private String petType;
	private boolean petAlive;
	public int deathValue;

	public Pet(String petName, String petType, boolean petAlive, int deathValue) {

		this.petName = petName;
		this.petType = petType;
		this.petAlive = true;
		this.deathValue = 1;
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
		if (getDeathValue() == 1) {
			return true;
		} else {
			return false;
		}
	}

	public void setPetAlive(boolean petAlive) {
		this.petAlive = petAlive;
	}

	public boolean getPetAlive() {

		return petAlive;
	}

	public int getDeathValue() {
		return deathValue;
	}

	
}
