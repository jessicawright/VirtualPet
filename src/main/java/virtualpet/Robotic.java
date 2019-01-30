package virtualpet;

public class Robotic extends Pet {

	private int petBatteryLife;
	private int petOilLevel;

	public Robotic(String petName, String petType, int petCleanliness, int petBatteryLife, int oilLevel) {
		super(petName, petType, petCleanliness);
		this.petBatteryLife = petBatteryLife;
		this.petOilLevel = oilLevel;
	}

	public int getBatteryLife() {
		return petBatteryLife;
	}
	
	public int getOilLevel() {
		return petOilLevel;
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

}
