package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PetShelterTest {

	PetShelter underTestShelter = new PetShelter();
	Pet underTestPet = new Pet("spotty", "", 50, true, 0, 0, 0);
	Pet underTestPet2 = new Pet("saddy", "", 25, true, 0, 0, 0);

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
	public void shouldAddSecondPetToShelter() {

		// arrange
		Pet underTestPet2 = new Pet("spotty2", "", 100, true, 0, 0, 0);
		// act
		underTestShelter.addPet(underTestPet);
		underTestShelter.addPet(underTestPet2);
		int answer = underTestShelter.getPetsLength();

		// assert
		assertEquals(answer, 2);

	}

	@Test
	public void shouldRemovePetFromShelter() {

		// arrange
//		Pet underTestDeadPet = new Pet ("","",100,true,0,0,0); // Bini added this while reviewing
		// act
		underTestShelter.removePet(underTestPet); // will change the naming when i work on my own
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
		System.out.println(underTestPet2.getPetFullness());
		
		underTestShelter.feedAllPets();
		
		int answer = underTestPet.getPetFullness();
		int answer2 = underTestPet2.getPetFullness();
		
		// assert
		assertEquals(answer, 75);
		assertEquals(answer2, 50);

	}
}