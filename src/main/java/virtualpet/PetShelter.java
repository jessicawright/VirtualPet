package virtualpet;

import java.util.HashMap;

public class PetShelter {

	private HashMap<String, Pet> pets = new HashMap<String, Pet>();

	public void addPet(Pet petToAdd) {
		pets.put(petToAdd.getPetName(), petToAdd);

	}

	public Pet getPet(String petToGet) {
		return pets.get(petToGet);
	}

	public int getPetsLength() {
		return pets.size();
	}

	public void removeDeadPet() {
		for (Pet pet : pets.values()) {
			if (pet.getPetAlive() == false) {
				pets.remove(pet.getPetName());
				System.out.println(pet.getPetName() + " died.");
			}
		}
	}

	public void adoptPetOut(Pet petToAdopt) {
		pets.remove(petToAdopt);
		System.out.println(petToAdopt.getPetName() + " found a new home.");
	}

	public void feedAllPets() {
		for (Pet pet : pets.values()) {
			pet.feedPet();
			return;
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

	public void allPetStatus() {
		for (Pet pet : pets.values()) {
			if (pet.getPetAlive()) {
				System.out.println("Alive");
			} else {
				System.out.println("Dead");
			}
			System.out.println("Pet Status:");
			if (pet instanceof Organic) {
				System.out.println("For " + pet.getPetName() + " the " + pet.getPetType() + ":");
				System.out.println("Fullness = " + ((Organic) pet).getPetFullness());
				System.out.println("Cleanliness = " + pet.getPetCleanliness());
				System.out.println("Energy = " + ((Organic) pet).getPetEnergy());
				System.out.println("Happiness = " + ((Organic) pet).getPetHappiness()); // create method petStatus?
				System.out.println("----------");
		}
			if (pet instanceof Robotic) {
				System.out.println("For " + pet.getPetName() + " the " + pet.getPetType() + ":");
				System.out.println("Cleanliness = " + pet.getPetCleanliness());
				System.out.println("Battery Life = " + ((Robotic) pet).getBatteryLife());
				System.out.println("Oil Level = " + ((Robotic) pet).getOilLevel());
				System.out.println("----------");
			}

	}
}
}
