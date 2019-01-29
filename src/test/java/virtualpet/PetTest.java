package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PetTest {

	@Test
	public void hungerShouldReturn100() {
		// Arrange
		Pet underTest = new Pet("", "", 100, true, 100,100,100);
		// Act
		int answer = underTest.getPetFullness();
		// Assert 
		assertEquals(answer, 100); 
		
	}

	@Test
	public void hungerShouldReturn125() {
		// Arrange
		Pet underTest = new Pet("", "",100, true, 100,100,100);
		// Act
		int answer = underTest.feedPet();
		// Assert
		assertEquals(answer, 125);
	}
	
	@Test
	public void oneHundredHungerShouldReturnTrue() {
			// Arrange
			Pet underTest = new Pet("", "", 100, true, 100,100,100);
			// Act
			boolean answer = underTest.petAlive();
			// Assert
			assertEquals(answer, true);
	}
	
	@Test
	public void petCleanlinessRetuns100() {
		// Arrange
		Pet underTest = new Pet("", "", 100, true, 100,100,100);
		// Act
		int answer = underTest.getPetCleanliness();
		// Assert
		assertEquals(answer, 100);
	}
				
	
	@Test
	public void uncleanPetShouldRetuns0() {
		// Arrange
		Pet underTest = new Pet("", "", 100, true, 0, 100, 100);
		// Act
		int answer = underTest.cleanPet();
		// Assert
		assertEquals(answer, 50);
	}
	
	@Test
	public void shouldReturnEnergyOf50AfterSleeping() {
		// Arrange
		Pet underTest = new Pet("", "", 100, true, 0, 100, 25);
		// Act
		int answer = underTest.sleepPet();
		// Assert
		assertEquals(answer, 50);
	}
	
	@Test
	public void shouldReturnEnergyOf50AfterPlaying() {
		// Arrange
		Pet underTest = new Pet("", "", 100, true, 0, 100, 60);
		// Act
		int answer = underTest.playPet();
		// Assert
		assertEquals(answer, 50);
	}
	
	@Test
	public void shouldReturnHappinessOf50AfterPlaying() {
		// Arrange
		Pet underTest = new Pet("", "", 100, true, 0, 25, 60);
		// Act
		int answer = underTest.playPet();
		// Assert
		assertEquals(answer, 50);
	}

}
