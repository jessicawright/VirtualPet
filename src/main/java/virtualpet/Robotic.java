package virtualpet;

public class Robotic extends Pet {

	private int petBattery;
	private int petOilLevel;
	private int petServiceLevel; // cleanliness for robots, mutator is maintenance
	private String petOilLevelBar;
	private String petServiceLevelBar;
	private String petBatteryBar;

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
		if (petOilLevel <= 0)
			petOilLevel = 0;
		petBattery -= 3;
		if (petBattery <= 0)
			petBattery = 0;
		petServiceLevel -= 5;
		if (petServiceLevel <= 0)
			petServiceLevel = 0;
		updatePetOilLevelBar();
		updatePetServiceLevelBar();
		updatePetBatteryBar();
		showPetStatus();
		healthWarning();
		die();
		return;
	}

	public void maintainence() {
		petServiceLevel += 20;
		if (petServiceLevel >= 100)
			petServiceLevel = 100;

	}

	public void chargeBattery() {
		petBattery += 20;
		if (petBattery >= 100)
			petBattery = 100;

	}

	public void addOil() {
		petOilLevel += 20;
		if (petOilLevel >= 100)
			petOilLevel = 100;

	}

	public void die() {
		if ((petOilLevel <= 0) || (petBattery <= 0)) {
			super.die();
			System.out.println(getPetName() + " has rusted and sent to the junk yard for parts.");
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
			System.out.println("*** WARNING: " + getPetName() + " is dying! ***");

		}
	}

	public void updatePetOilLevelBar() {
		if (petOilLevel >= 90) {
			petOilLevelBar = "[••••]";
		}
		if (petOilLevel >= 66 && petOilLevel <= 89) {
			petOilLevelBar = "[••• ]";
		}
		if (petOilLevel >= 33 && petOilLevel <= 65) {
			petOilLevelBar = "[••  ]";
		}
		if (petOilLevel >= 1 && petOilLevel <= 32) {
			petOilLevelBar = "[•   ]";
		}

	}

	public void updatePetServiceLevelBar() {
		if (petServiceLevel >= 90) {
			petServiceLevelBar = "[••••]";
		}
		if (petServiceLevel >= 66 && petServiceLevel <= 89) {
			petServiceLevelBar = "[••• ]";
		}
		if (petServiceLevel >= 33 && petServiceLevel <= 65) {
			petServiceLevelBar = "[••  ]";
		}
		if (petServiceLevel >= 1 && petServiceLevel <= 32) {
			petServiceLevelBar = "[•   ]";
		}
		if (petServiceLevel == 0) {
			petServiceLevelBar = "[    ]";
		}
	}

	public void updatePetBatteryBar() {
		if (petBattery >= 90) {
			petBatteryBar = "[••••]";
		}
		if (petBattery >= 66 && petBattery <= 89) {
			petBatteryBar = "[••• ]";
		}
		if (petBattery >= 33 && petBattery <= 65) {
			petBatteryBar = "[••  ]";
		}
		if (petBattery >= 1 && petBattery <= 32) {
			petBatteryBar = "[•   ]";
		}
		if (petBattery == 0) {
			petBatteryBar = "[    ]";
		}

	}

	public void showPetStatus() {
		System.out.println("\t" + getPetName() + "'s status - Oil Level: \t" + petOilLevelBar + "\t Service Status: \t"
				+ petServiceLevelBar + "\t Battery: \t" + petBatteryBar);

	}

}
