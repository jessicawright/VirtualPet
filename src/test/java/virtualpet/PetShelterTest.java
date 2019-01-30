package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PetShelterTest {
	
	PetShelter underTestShelter = new PetShelter();
	Pet underTestPet3 = new Organic("Spotter", "cat", 30, true, 90, 80, 70);
	Pet underTestPet = new Organic("Spot", "cat", 30, false, 50, 0, 0);
	Pet underTestPet2 = new Robotic("Saddy", "dog", 40, false, 0, 25);

	@Test
	public void shouldAddPetToShelter() {
		underTestShelter.addPet(underTestPet);
		int answer = underTestShelter.getPetsLength();
		assertEquals(answer, 1);

	}

	@Test
	public void shouldAddSecondPetToShelter() {
		underTestShelter.addPet(underTestPet);
		underTestShelter.addPet(underTestPet2);
		int answer = underTestShelter.getPetsLength();
		assertEquals(answer, 2);

	}

	@Test
	public void shouldRemovePetFromShelter() {
		underTestShelter.addPet(underTestPet);
		underTestShelter.addPet(underTestPet2);
		System.out.println(underTestShelter.getPetsLength());
		underTestShelter.adoptPetOut("Spot");
		System.out.println(underTestShelter.getPetsLength());
		int answer = underTestShelter.getPetsLength();
		assertEquals(answer, 1);

	}
	
	@Test
	public void shouldRemoveDeadPetsFromShelter() {
		underTestShelter.addPet(underTestPet);
		underTestShelter.addPet(underTestPet2);
		underTestShelter.addPet(underTestPet3);
		underTestPet.die();
		underTestPet2.die();
		underTestShelter.removeDeadPets();
		int answer = underTestShelter.getPetsLength();
		assertEquals(answer, 1);
		
	}

	@Test
	public void shouldFeedallPets() {
		underTestShelter.addPet(underTestPet);
		underTestShelter.addPet(underTestPet2);
		underTestShelter.feedAllPets();
		int answer = ((Organic) underTestPet).getPetFullness();
		int answer2 = ((Robotic) underTestPet2).getOilLevel();
		assertEquals(answer, 70);
		assertEquals(answer2, 75);

	}
}