package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fizzbuzz.FizzBuzz;

public class VirtualPetTest {
	
	@Test
	public void shouldReturnSpotAsSpot() {
		Pet testDrive = new Pet("Spot", "dog");
		String answer = testDrive.getPetName();
		assertEquals("spot", answer);
	}
	
	@Test
	public void shouldReturnDogAsDog() {
		Pet testDrive = new Pet("Spot", "x");
		String answer = testDrive.getPetType();
		assertEquals("x", answer);
	}
}