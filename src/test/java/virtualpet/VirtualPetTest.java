package virtualpet;


import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {
	@Test
	public void shouldReturnOneAsNumber() {
		String answer = Pet.getAnswerFor(1);
		assertEquals(answer, "1");
	}

}
