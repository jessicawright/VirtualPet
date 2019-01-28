package virtualpet;

import java.util.HashMap;

public class PetShelter {

	private HashMap<String, Pet> pets = new HashMap<String, Pet>();

	public void addPet(Pet virtualPet) {
		pets.put(virtualPet.getPetName(), virtualPet);

	}

	public int getPetsLength() {

		return pets.size();
	}

	public void removePet(Pet underTestPet) {
		pets.remove(underTestPet.getPetName(), underTestPet);

	}

}
