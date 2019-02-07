package virtualpet;

import java.util.HashMap;

public class PetShelter {

	private HashMap<String, Pet> pets = new HashMap<String, Pet>(); // <key, value>

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
		String petToRemove = "";
		for (Pet pet : pets.values()) {
			if (pet.getDeathValue() == -1) {
				petToRemove = pet.getPetName();
			}
		}
		pets.remove(petToRemove);
	}

	public void feedAllPets() {
		for (Pet pet : pets.values()) {
			if (pet instanceof Organic) {
				((Organic) pet).feedPet();
			} else {
				((Robotic) pet).addOil();
			}

		}
	}

	public void cleanAllPets() {
		for (Pet pet : pets.values()) {
			if (pet instanceof Organic) {
				((Organic) pet).cleanPet();
			} else {
				((Robotic) pet).maintainence();
			}

		}
	}

	public void playAllPets() {
		for (Pet pet : pets.values()) {
			if (pet instanceof Organic) {
				((Organic) pet).playPet();
			}

		}
	}

	public void sleepAllPets() {
		for (Pet pet : pets.values()) {
			if (pet instanceof Organic) {
				((Organic) pet).sleepPet();
			} else {
				((Robotic) pet).chargeBattery();
			}

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
				if (pet instanceof Organic) {
					System.out.println("**__Pet Status__**");
					System.out.println();
					System.out.println(pet.getPetName().toUpperCase() + " Current Status is:");
					System.out.println();
					pet.healthWarning();
					System.out.println((((Organic) pet).getPetFullness()) + " %\tFull");
					System.out.println(((Organic) pet).getPetCleanliness() + " %\tClean");
					System.out.println(((Organic) pet).getPetEnergy() + " %\tEnergy");
					System.out.println((((Organic) pet).getPetHappiness()) + " %\tHappier"); // create method
																								// petStatus?
					System.out.println(pet.getDeathValue() + "\thas died");
					System.out.println("-----------------------");
				} else {
					if (pet instanceof Robotic) {
						System.out.println("**__Current Pet Status__**");
						System.out.println();
						System.out.println(((Robotic) pet).getPetName().toUpperCase() + " Current Status is:");
						System.out.println();
						pet.healthWarning();
						System.out.println(((Robotic) pet).getPetOilLevel() + " %\tOil Level");
						System.out.println(((Robotic) pet).getPetCleanStatus() + " %\tMaintenance level");
						System.out.println(((Robotic) pet).getPetBattery() + " %\tBattery full");
						System.out.println(pet.getDeathValue() + "\thas died");
						System.out.println("-------------------");
					}
				}
			}

		}

	}

	public void petNameList() {
		for (Pet pet : pets.values()) {
//			if (pet instanceof Organic) {
//				System.out.println(pet.getPetName());
//			} else {
//				if (pet instanceof Robotic) {
			System.out.println(pet.getPetName());
		}
		return;
	}

	public void adoptPetOut(String petName) {
		pets.remove(petName);
		System.out.println(petName + " found a new home.");
	}

//		}
//	}
}
