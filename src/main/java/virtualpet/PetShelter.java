package virtualpet;

import java.util.HashMap;

public class PetShelter {
	
	private HashMap<String, Pet> pets = new HashMap<String, Pet>();

	
	public void addPet(Pet underTestPet) {
		pets.put(underTestPet.getPetName(), underTestPet);
		
	}


	public int getPetsLength() {
	
		return pets.size();
	}


	public void removePet(Pet underTestPet) {
		pets.remove(underTestPet.getPetName(), underTestPet);
		
	}

}
