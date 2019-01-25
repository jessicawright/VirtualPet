package virtualpet;

import java.util.Scanner;

public class Application {
	
	public static Scanner userInput = new Scanner(System.in);
	public static PetShelter virtualPetShelter = new PetShelter();

	public static void main(String[] args) {


		Pet virtualPet = createPet(userInput);

		while (virtualPet.petAlive()) {

			virtualPet.incrementStatus();

			System.out.println("----------");
			
			System.out.println(virtualPetShelter.getPetsLength());
			System.out.println("Pet Status:");
			System.out.println("Fullness = " + virtualPet.getPetFullness());
			System.out.println("Cleanliness = " + virtualPet.getPetCleanliness());
			System.out.println("Energy = " + virtualPet.getPetEnergy());
			System.out.println("Happiness = " + virtualPet.getPetHappiness()); // create method petStatus?
			System.out.println("----------");
			System.out.println();
			System.out.println("1. feed pet.");
			System.out.println("2. play with pet");
			System.out.println("3. clean pet");
			System.out.println("4. Accept new pet");
			System.out.println("5. Select different pet");
			System.out.println();
			System.out.println("what would you like to do?");
			String userMenuChoice = userInput.nextLine();

			System.out.println(userMenuChoice);
			switch (userMenuChoice) {

			case "1":
				virtualPet.feedPet();
				break;
			case "2":
				virtualPet.playPet();
				break;
			case "3":
				virtualPet.cleanPet();
				break;
			case "4":
				createPet(userInput);
				break;

			case "5":
				System.out.println("not available yet");
			}
		}

		System.out.println("Your pet died.");

	}

	// method for pet creation
	private static Pet createPet(Scanner userInput) {
		// test user created pet name
		System.out.println("Hello! Please enter a name for your new pet.");
		String userPetName = userInput.nextLine();
		System.out.println(userPetName);

		// test user chosen pet type from list
		System.out.println("Please choose a pet type");
		System.out.println("DOG, CAT, RABBIT");
		String userPetType = userInput.nextLine().toLowerCase().trim();
		// trim() method eliminates leading and trailing spaces

		while (!userPetType.equals("dog") && !userPetType.equals("cat") && !userPetType.equals("rabbit")) {
			System.out.println("Please try again...");
			userPetType = userInput.nextLine().toLowerCase().trim();
		}

		Pet virtualPet = new Pet(userPetName, userPetType, 50, true, 50, 50, 50); // 0 not hungry at all
		virtualPetShelter.addPet(virtualPet);
		
		System.out.println();
		System.out.println("Say hello to " + virtualPet.getPetName() + ", your new " + virtualPet.getPetType() + ".");
		System.out.println("----------");
		// end user pet creation
		return virtualPet;
	}
}
