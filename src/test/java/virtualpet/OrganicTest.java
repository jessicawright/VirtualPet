package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrganicTest {
	
//	String petName, String petType, boolean petAlive, int deathValue, int petFullness,
//	int petCleanliness, int petHappiness, int petEnergy

	PetShelter underTestShelter = new PetShelter();
	Organic OrganicTestPet = new Organic("Shadow", "dog", true, 1, 60, 60, 60, 60);
	Organic OrganicTestPet2 = new Organic("Lucky", "dog", true, 1, 75, 75, 75, 75);

	@Test
	public void shouldLowerCleanlinessTo55AndIncreaseFullnessBy25() {
		// act
		OrganicTestPet.feedPet();
		int answer = OrganicTestPet.getPetCleanliness();
		int answer2 = OrganicTestPet.getPetFullness();
		assertEquals(answer, 55);
		assertEquals(answer2, 85);

	}

}
