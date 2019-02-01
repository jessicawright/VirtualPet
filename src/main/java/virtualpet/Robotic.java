package virtualpet;

public class Robotic extends Pet {

	private int petBattery;
	private int petOilLevel;
	private int petServiceLevel; //cleanliness for robots, mutator is maintenance

	public Robotic(String petName, String petType, boolean petAlive, int petOilLevel, int petBattery,
			int petCleanStatus) {
		super(petName, petType, petAlive);

		this.petBattery = petBattery;
		this.petOilLevel = petOilLevel;
		this.petServiceLevel = petCleanStatus;

	}

	public int getPetBattery() {
		return petBattery;
	}

	public int getPetOilLevel() {
		return petOilLevel;
	}

	public int getPetCleanStatus() {
		return petServiceLevel;
	}
	
	public void incrementStatus() {
		super.incrementStatus();
		petOilLevel -= 5;
		petBattery -= 3;
		petServiceLevel -=5;
		return;
	}
	
	public void maintainence() {
		petServiceLevel += 20;  
	}
	
	public void chargeBattery() {
		petBattery += 20;  
	}
	
	public void addOil() {
		petOilLevel += 20;  
	}
	
	public void die() {
		if ((petOilLevel <= 0) || (petBattery <= 0)) {
		super.die();
	}
	}

}
