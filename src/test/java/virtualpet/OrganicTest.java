package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrganicTest {
	
//	String petName, String petType, boolean petAlive, int deathValue, int petFullness,
//	int petCleanliness, int petHappiness, int petEnergy
	
	PetShelter underTestShelter = new PetShelter();
	Organic OrganicTestPet = new Organic("spotty", "dog", true, 1, 60, 60, 60, 60);
	Organic OrganicTestPet2 = new Organic("shadow", "dog", true, 1, 30, 30, 30, 30);
	

	@Test
	public void shouldReturnCleanlinessOf55() {
		OrganicTestPet.feedPet();
		int answer = OrganicTestPet.getPetCleanliness();
		int answer2 = OrganicTestPet.getPetFullness();
		assertEquals(answer, 55);
		assertEquals(answer2, 85);

	}
	
	@Test
	public void shouldReturnFullnessTo100() {
		Organic OrganicTestPet3 = new Organic("spotty", "dog", true, 1, 95, 60, 60, 60);
		OrganicTestPet3.feedPet();
		int answer = OrganicTestPet3.getPetFullness();
		assertEquals(answer, 100);

	}
	
	@Test
	public void shouldDecreaseValuesOnIncrement() {
		Organic OrganicTestPet3 = new Organic("spotty", "dog", true, 1, 95, 95, 95, 95);
		OrganicTestPet3.incrementStatus();
		int answer = OrganicTestPet3.getPetFullness();
		int answer1 = OrganicTestPet3.getPetHappiness();
		int answer2 = OrganicTestPet3.getPetCleanliness();
		assertEquals(answer, 90);
		assertEquals(answer1, 92);
		assertEquals(answer2, 90);

	}
	

	@Test
	public void cleanPetshouldIncreaseCleanlinessBy50() {
		Organic OrganicTestPet3 = new Organic("spotty", "dog", true, 1, 95, 20, 95, 95);
		OrganicTestPet3.cleanPet();
		int answer = OrganicTestPet3.getPetCleanliness();
		assertEquals(answer, 70);
	}
	
	@Test
	public void playPetshouldIncreaseHapinessAndDecreaseCleanliness() {
		Organic OrganicTestPet3 = new Organic("spotty", "dog", true, 1, 95, 20, 25, 95);
		OrganicTestPet3.playPet();
		int answer = OrganicTestPet3.getPetCleanliness();
		int answer1 = OrganicTestPet3.getPetEnergy();
		int answer2 = OrganicTestPet3.getPetHappiness();
		assertEquals(answer, 0);
		assertEquals(answer1, 85);
		assertEquals(answer2, 75);
	}
	
	@Test
	public void healthWarningShouldPrintLine() {
		Organic OrganicTestPet3 = new Organic("spotty", "dog", true, 1, 10, 20, 25, 95);
		OrganicTestPet3.healthWarning();
		
	}
	
	@Test
	public void sendToVetShouldMaxVitals() {
		Organic OrganicTestPet3 = new Organic("spotty", "dog", true, 1, 10, 20, 25, 95);
		OrganicTestPet3.sendToVet();
		int answer = OrganicTestPet3.getPetCleanliness();	
		int answer1 = OrganicTestPet3.getPetFullness();
		int answer2 = OrganicTestPet3.getPetHappiness();	
		int answer3 = OrganicTestPet3.getPetEnergy();
		assertEquals(answer, 100);
		assertEquals(answer1, 100);
		assertEquals(answer2, 100);
		assertEquals(answer3, 100);
	}
	
	@Test
	public void dieShouldFlipBooleanPetAlive() {
		Organic OrganicTestPet3 = new Organic("spotty", "dog", true, 1, 0, 20, 25, 95);
		OrganicTestPet3.die();
		int answer = OrganicTestPet3.getDeathValue();
		assertEquals(answer, -1);
		
	}
	

}