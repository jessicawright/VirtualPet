package virtualpet;

public class Robotic extends Pet {

	private int petBattery;
	private int petOilLevel;
	private int petServiceLevel; // cleanliness for robots, mutator is maintenance

	public Robotic(String petName, String petType, boolean petAlive, int deathValue, int petOilLevel, int petBattery,
			int petCleanStatus) {
		super(petName, petType, petAlive, deathValue);

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
		petServiceLevel -= 5;
		die();
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

	public void sendToVet() {
		super.sendToVet();
		petBattery = 100;
		petServiceLevel = 100;
		petOilLevel = 100;
		return;
	}

	public void healthWarning() {
		if ((petOilLevel <= 20) || (petBattery <= 20)) {
			System.out.println("WARNING: Your Pet is dying, \nTtake your pet to the nearest Vet.");
			System.out.println();
		}
	}

}
