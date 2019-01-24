package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PetTest {

	@Test
	public void hungerShouldReturn100() {
		// Arrange
		Pet underTest = new Pet("", "", 100, true, 100);
		// Act
		int answer = underTest.getPetFullness();
		// Assert 
		assertEquals(answer, 100); 
		
	}

	@Test
	public void hungerShouldReturn125() {
		// Arrange
		Pet underTest = new Pet("", "",100, true, 100);
		// Act
		int answer = underTest.feedPet();
		// Assert
		assertEquals(answer, 125);
	}
	
	@Test
	public void oneHundredHungerShouldReturnTrue() {
			// Arrange
			Pet underTest = new Pet("", "", 100, true, 100);
			// Act
			boolean answer = underTest.petAlive();
			// Assert
			assertEquals(answer, true);
	}
	
	@Test
	public void petCleanlinessRetuns100() {
		// Arrange
		Pet underTest = new Pet("", "", 100, true, 100);
		// Act
		int answer = underTest.getPetCleanliness();
		// Assert
		assertEquals(answer, 100);
	}
				
	
	@Test
	public void cleanPetShouldRetuns100() {
		// Arrange
		Pet underTest = new Pet("", "", 100, true, 50);
		// Act
		int answer = underTest.cleanPet();
		// Assert
		assertEquals(answer, 100);
	}
	
	@Test
<<<<<<< HEAD
	public void zeroHungerShouldReturnFalse() {
		// Arrange
		Pet underTest = new Pet("", "", 0, true);
		// Act
		boolean answer = underTest.petAlive();
		// Assert
		assertEquals(answer, false);

	}
	
	@Test
	public void feedWhenHungerEquals0ShouldReturn0() {
		// Arrange
		Pet underTest = new Pet("", "", 0, true);
		// Act
		int answer = underTest.feedPet();
		// Assert
		assertEquals(answer, 0);

	}
}
