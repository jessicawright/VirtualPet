package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fizzbuzz.FizzBuzz;

public class PetTest {
	
	@Test
	public void hungerShouldReturnAs100() {
		// Arrange
		Pet underTest = new Pet("", "", 100);
		// Act
		int answer = underTest.getPetHunger();
		// Assert
		assertEquals(answer, 100);
	}
}