package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoboticTest {
	
//	(String petName, String petType, boolean petAlive, int deathValue, int petOilLevel, int petBattery,
//			int petCleanStatus) {
//		super(petName, petType, petAlive, deathValue);
	
	PetShelter underTestShelter = new PetShelter();
	Robotic RoboticTestPet = new Robotic("spotty", "dog", true, 1, 60, 60, 60);
	Robotic RoboticTestPet2 = new Robotic("shadow", "dog", true, 1, 30, 30, 30);
	
	
	@Test
	public void shouldReturnOilLevelTo100() {
		Robotic RoboticTestPet3 = new Robotic("spotty", "dog", true, 1, 95, 60, 60);
		RoboticTestPet3.addOil();
		int answer = RoboticTestPet3.getPetOilLevel();
		assertEquals(answer, 100);

	}
	
	@Test
	public void shouldDecreaseValuesOnIncrement() {
		Robotic RoboticTestPet3 = new Robotic("spotty", "dog", true, 1, 95, 95, 95);
		RoboticTestPet3.incrementStatus();
		int answer = RoboticTestPet3.getPetOilLevel();
		int answer1 = RoboticTestPet3.getPetBattery();
		int answer2 = RoboticTestPet3.getPetCleanStatus();
		assertEquals(answer, 90);
		assertEquals(answer1, 92);
		assertEquals(answer2, 90);

	}
	
	@Test
	public void shouldIncreaseBatteryBy20() {
		Robotic RoboticTestPet3 = new Robotic("spotty", "dog", true, 1, 95, 75, 95);
		int batteryBeforeCharge = RoboticTestPet3.getPetBattery();
		RoboticTestPet3.chargeBattery();
		int batteryAfterCharge = RoboticTestPet3.getPetBattery();
		assertEquals(batteryBeforeCharge +20, batteryAfterCharge);
	}

	@Test
	public void cleanPetshouldIncreaseCleanStatusBy20() {
		Robotic RoboticTestPet3 = new Robotic("spotty", "dog", true, 1, 95, 20, 50);
		RoboticTestPet3.maintainence();
		int answer = RoboticTestPet3.getPetCleanStatus();
		assertEquals(answer, 70);
	}
	
	
	@Test
	public void healthWarningShouldPrintLine() {
		Robotic RoboticTestPet3 = new Robotic("spotty", "dog", true, 1, 10, 20, 25);
		RoboticTestPet3.healthWarning();
		
	}
	
	@Test
	public void sendToVetShouldMaxVitals() {
		Robotic RoboticTestPet3 = new Robotic("spotty", "dog", true, 1, 10, 20, 25);
		RoboticTestPet3.sendToVet();
		int answer = RoboticTestPet3.getPetOilLevel();
		int answer1 = RoboticTestPet3.getPetBattery();
		int answer2 = RoboticTestPet3.getPetCleanStatus();
		assertEquals(answer, 100);
		assertEquals(answer1, 100);
		assertEquals(answer2, 100);

	}
	
	@Test
	public void dieShouldFlipBooleanPetAlive() {
		Robotic RoboticTestPet3 = new Robotic("spotty", "dog", true, 1, 0, 20, 25);
		RoboticTestPet3.die();
		int answer = RoboticTestPet3.getDeathValue();
		assertEquals(answer, -1);
		
	}
	

}