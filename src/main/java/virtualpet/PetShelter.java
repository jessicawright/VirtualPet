package virtualpet;

import java.util.HashMap;

public class PetShelter {

	private HashMap<String, Pet> pets = new HashMap<String, Pet>(); //<key, value>
	
	
	

	public void addPet(Pet virtualPet) {
		pets.put(virtualPet.getPetName(), virtualPet);

	}
	
	public Pet getPet(String petToGet) {
		return pets.get(petToGet);
	}

	public int getPetsLength() {
		return pets.size();
	}

	public void removePet() { 
		for (Pet pet : pets.values()) {
			if (((Organic) pet).getPetAlive() == false) {
				pets.remove(pet.getPetName());

				return;
			}
		}
			

	}
	
	public void feedAllPets() {
		for (Pet pet : pets.values()) {
			((Organic) pet).feedPet();
		}
	}
	
	public void cleanAllPets() {
		for (Pet pet : pets.values()) {
			((Organic) pet).cleanPet();
		}
	}
	
	public void playAllPets() {
		for (Pet pet : pets.values()) {
			((Organic) pet).playPet();
		}
	}
	
	public void sleepAllPets() {
		for (Pet pet : pets.values()) {
			((Organic) pet).sleepPet();
		}
	}
	
	public void incrementAllPets() {
		for (Pet pet : pets.values()) {
			pet.incrementStatus();
		}
	}
	
	public void allPetStatus() {
		for (Pet pet : pets.values()) {
			if (pet.getPetAlive()) {
				System.out.println("Alive");
			} else {
				System.out.println("Dead");
			}
			System.out.println("Pet Status:");
			System.out.println("For pet " + pet.getPetName());
			System.out.println("Fullness = " + (((Organic) pet).getPetFullness()));
			System.out.println("Cleanliness = " + ((Organic) pet).getPetCleanliness());
			System.out.println("Energy = " + ((Organic) pet).getPetEnergy());
			System.out.println("Happiness = " + (((Organic) pet).getPetHappiness())); // create method petStatus?
			System.out.println("----------");
		}
		
	
	}


}



	
