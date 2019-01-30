package virtualpet;

public class Robotic extends Pet {

	private int petBatteryLife;
	private int petOilLevel;
	private boolean petAlive;

	public Robotic(String petName, String petType, int petCleanliness, boolean petAlive, int petBatteryLife, int oilLevel) {
		super(petName, petType, petCleanliness, petAlive);
		this.petBatteryLife = petBatteryLife;
		this.petOilLevel = oilLevel;
		this.petAlive = true;
	}

	public int getBatteryLife() {
		return petBatteryLife;
	}
	
	public int getOilLevel() {
		return petOilLevel;
	}
	
	public boolean getPetAlive() {
		return petAlive;
	}

	public void incrementStatus() {
		super.incrementStatus();
		petBatteryLife -= 5;
		petOilLevel -= 10;
		return;

	}

	public void playPet() {
		super.playPet();
		petBatteryLife -= 10;
		return;

	}
	
	public void chargePet() {
		petBatteryLife += 50;
		return;
	}
	
	public void feedPet() {
		petOilLevel += 50;
		return;
	}
	
	public void die() {
		if (petBatteryLife <= 0 || petOilLevel <= 0) {
			petAlive = false;
		}
	}
	
}
