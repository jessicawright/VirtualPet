package virtualpet;

import java.util.HashMap;

public class PetShelter {

	private HashMap<String, Pet> pets = new HashMap<String, Pet>();
	
	
	

	public void addPet(Pet virtualPet) {
		pets.put(virtualPet.getPetName(), virtualPet);

	}
	
	public Pet getPet(String petToGet) {
		return pets.get(petToGet);
	}

	public int getPetsLength() {
		return pets.size();
	}

	public void removePet(Pet underTestPet) {
		pets.remove(underTestPet.getPetName(), underTestPet);

	}
	
	public void feedAllPets() {
		for (Pet pet : pets.values()) {
			pet.feedPet();
		}
	}
	
	public void cleanAllPets() {
		for (Pet pet : pets.values()) {
			pet.cleanPet();
		}
	}
	
	public void playAllPets() {
		for (Pet pet : pets.values()) {
			pet.playPet();
		}
	}
	
	public void sleepAllPets() {
		for (Pet pet : pets.values()) {
			pet.sleepPet();
		}
	}
	
	public void incrementAllPets() {
		for (Pet pet : pets.values()) {
			pet.incrementStatus();
		}
	}
	
//	public void allPetStatus() {
//		for (Pet pet : pets.values()) {
//			System.out.println("The happiness level is " + pet.getPetHappiness);
//		}
//	System.out.println("Pet Status:");
//	System.out.println("Fullness = " + virtualPetShelter.getPetFullness());
//	System.out.println("Cleanliness = " + virtualPet.getPetCleanliness());
//	System.out.println("Energy = " + virtualPet.getPetEnergy());
//	System.out.println("Happiness = " + virtualPet.getPetHappiness()); // create method petStatus?
//	System.out.println("----------");
//	}
		
	

	}

}
