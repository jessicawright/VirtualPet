package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PetTest {

	Pet underTestPet = new Pet("Spot", "cat", 50);
	Pet underTestPet2 = new Pet("Shadow", "dog", 90);

	@Test
	public void aliveShouldReturnTrue() {
		boolean answer = underTestPet.getPetAlive();
		assertEquals(answer, true);

	}

	@Test
	public void cleanlinessShouldReturnZero() {
		int answer = underTestPet.getPetCleanliness();
		assertEquals(answer, 0);
	}

	@Test
	public void cleanlinessShouldReturnFifty() {
		underTestPet.cleanPet();
		int answer = underTestPet.getPetCleanliness();
		assertEquals(answer, 50);
	}

	@Test
	public void energyShouldReturnThirty() {
		int answer = underTestPet.getPetEnergy();
		assertEquals(answer, 30);
	}

	@Test
	public void energyShouldReturnFiftyFiveAfterSleeping() {
		underTestPet.sleepPet();
		int answer = underTestPet.getPetEnergy();
		assertEquals(answer, 55);
	}

	@Test
	public void playingShouldRetunEnergyOfTwenty() {
		underTestPet.playPet();
		int afterEnergy = underTestPet.getPetEnergy();
		assertEquals(afterEnergy, 20);
	}

}
