package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PetShelterTest {

	PetShelter underTestShelter = new PetShelter();
	Pet underTestPet = new Pet("spotty", "", 100, true, 0, 0, 0);

	@Test
	public void shouldAddPetToShelter() {

		// arrange

		// actg
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

		// act
		underTestShelter.removePet(underTestPet);
		int answer = underTestShelter.getPetsLength();

		// assert
		assertEquals(answer, 0);

	}
}