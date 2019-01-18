package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fizzbuzz.FizzBuzz;

public class VirtualPetTest {
	
	@Test
	public void shouldReturnNineAsFizz() {
		Object userPet;
		String answer = Application.getAnswerFor(userPet);
		assertEquals(answer, "Fizz");
	}
}