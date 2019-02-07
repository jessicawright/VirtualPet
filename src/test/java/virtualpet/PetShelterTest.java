package virtualpet;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class PetShelterTest {


	PetShelter underTestShelter = new PetShelter();
	Organic underTestPet = new Organic("spotty", "dog", true, 1, 50, 50, 50, 50);
	Robotic underTestPet2 = new Robotic("saddy", "cat", true, 1, 50, 50, 50);

	@Test
	public void shouldAddPetToShelter() {

		// arrange

		// act
		underTestShelter.addPet(underTestPet);
		int answer = underTestShelter.getPetsLength();

		// assert
		assertEquals(answer, 1);

	}
	
	@Test
	public void shouldGetPet() {
		underTestShelter.addPet(underTestPet);
		underTestShelter.getPet(underTestPet.getPetName());
		assertEquals("spotty", underTestPet.getPetName());
		
	}

	@Test
	public void shouldAddSecondPetToShelter() {

		// arrange
		Organic underTestPet2 = new Organic("spotty2", "dog", true, 1, 50, 50, 50, 50);
		// act
		underTestShelter.addPet(underTestPet);
		underTestShelter.addPet(underTestPet2);
		int answer = underTestShelter.getPetsLength();

		// assert
		assertEquals(answer, 2);

	}

	@Test
	public void shouldRemovePetFromShelter() {
		Organic underTestPet = new Organic("spotty", "dog", true, 1, 5, 50, 50, 50);
		underTestPet.incrementStatus();
		underTestPet.die();
		underTestShelter.removePet(); // will change the naming when i work on my own
		int answer = underTestShelter.getPetsLength();
		

		// assert
		assertEquals(answer, 0);

	}

	@Test
	public void shouldFeedallPets() {

		// arrange

		// act
		underTestShelter.addPet(underTestPet);
		underTestShelter.addPet(underTestPet2);
		
		System.out.println(underTestPet.getPetFullness());
		System.out.println(underTestPet2.getPetOilLevel());
		
		underTestShelter.feedAllPets();
		
		int answer = underTestPet.getPetFullness();
		int answer2 = underTestPet2.getPetOilLevel();
		
		// assert
		assertEquals(answer, 75);
		assertEquals(answer2, 70);
	}
	
	@Test
	public void shouldCleanallPets() {

		// arrange

		// act
		underTestShelter.addPet(underTestPet);
		underTestShelter.addPet(underTestPet2);
		
		System.out.println(underTestPet.getPetCleanliness());
		System.out.println(underTestPet2.getPetCleanStatus());
		
		underTestShelter.cleanAllPets();
		
		int answer = underTestPet.getPetCleanliness();
		int answer2 = underTestPet2.getPetCleanStatus();
		
		// assert
		assertEquals(answer, 100);
		assertEquals(answer2, 70);
	}
	
	@Test
	public void shouldSleepAllPets() {

		// arrange

		// act
		underTestShelter.addPet(underTestPet);
		underTestShelter.addPet(underTestPet2);
		
		System.out.println(underTestPet.getPetEnergy());
		System.out.println(underTestPet2.getPetBattery());
		
		underTestShelter.sleepAllPets();
		
		int answer = underTestPet.getPetEnergy();
		int answer2 = underTestPet2.getPetBattery();
		
		// assert
		assertEquals(answer, 75);
		assertEquals(answer2, 70);
	}
	
}