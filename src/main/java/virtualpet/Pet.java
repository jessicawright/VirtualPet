package virtualpet;

abstract class  Pet {

	private String petName;
	private String petType;
	private boolean petAlive;
	private int deathValue;

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
		if (deathValue == 1) {
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

	public void sendToVet(){
	   	    return;
	}
	public void healthWarning() {
		return;
	}
	public void die() {
		deathValue = -1;
		return;
		
	}
		
}
