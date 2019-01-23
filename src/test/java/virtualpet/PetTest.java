package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PetTest {

	@Test
	public void hungerShouldReturn100() {
		// Arrange
		Pet underTest = new Pet("", "", 100, true);
		// Act
		int answer = underTest.getPetHunger();
		// Assert
		assertEquals(answer, 100);

	}

	@Test
	public void hungerShouldReturn90() {
		// Arrange
		Pet underTest = new Pet("", "", 100,true);
		// Act
		int answer = underTest.feedPet();
		// Assert
		assertEquals(answer, 95);
	}
	
	@Test
	public void zerHungerShouldReturnFalse() {
			// Arrange
			Pet underTest = new Pet("", "",0, true);
			// Act
			boolean answer = underTest.petAlive();
			// Assert
			assertEquals(answer, true);

	}
	
	@Test
	public void feedWhenHungerEqualsOneShouldReturn0() {
			// Arrange
			Pet underTest = new Pet("", "",3, true);
			// Act
			int answer = underTest.feedPet();
			// Assert
			assertEquals(answer, 3);

	}
}