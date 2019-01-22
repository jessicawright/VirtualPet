package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PetTest {
	
	@Test
	public void hungerShouldReturn100() {
		// Arrange
		Pet underTest = new Pet("", "", 100);
		// Act
		int answer = underTest.getPetHunger();
		// Assert
		assertEquals(answer, 100);
		
	}
	
	@Test
	public void hungerShouldReturn90() {
		// Arrange
		Pet underTest = new Pet("", "", 100);
		// Act
		int answer = underTest.feedPet(10);
		// Assert
		assertEquals(answer, 90);
		
	}
}