package virtualpet;

import java.util.Scanner;

public class Application {
	
	public static Scanner userInput = new Scanner(System.in);
	public static PetShelter virtualPetShelter = new PetShelter();

	public static void main(String[] args) {
		
//		String petName, String petType, int petFullness, boolean petAlive, int petCleanliness, int petHappiness, int petEnergy

		Pet pet1 = new Organic("dog", "Spot", true, 115,  80, 75, 75);
		Pet pet2 = new Organic("cat", "Happy", true, 50,  40, 60, 5);
		Pet pet3 = new Organic("rabbit", "Saddy", true, 25,  50, 50, 50);


		virtualPetShelter.addPet(pet1);
		virtualPetShelter.addPet(pet2);
		virtualPetShelter.addPet(pet3);
		System.out.println("Welcome! The current pet population is: " + virtualPetShelter.getPetsLength());


//		Pet virtualPet = createPet(userInput);
		System.out.println("*******************");
		System.out.println("1. feed pet.");
		System.out.println("2. play with pet");
		System.out.println("3. clean pet");
		System.out.println("4. Accept new pet");
		System.out.println("5. Let pet sleep");
		System.out.println("6. Select a pet");
		System.out.println();
		System.out.println("what would you like to do?");
		String userMenuChoice = userInput.nextLine();
		


		while (!userMenuChoice.equals("-1")) {//(virtualPet.petAlive()) {

			
			System.out.println(virtualPetShelter.getPetsLength());

			System.out.println("1. feed all pets");
			System.out.println("2. play with pets");
			System.out.println("3. clean pets");
			System.out.println("4. Accept new pet");
			System.out.println("5. Let pets sleep");
			System.out.println("6. Select a pet");
			System.out.println("7. Check the status of the pets");
			System.out.println();
			System.out.println("what would you like to do?");
			String userMenuChoice1 = userInput.nextLine();

			System.out.println(userMenuChoice1);
			switch (userMenuChoice1) {

			case "1":
				virtualPetShelter.feedAllPets();
				break;
			case "2":
				virtualPetShelter.playAllPets();
				break;
			case "3":
				virtualPetShelter.cleanAllPets();
				break;
			case "4":
				// test user created pet name
				System.out.println("Hello! Please enter a name for your new pet.");
				String userPetName = userInput.nextLine();
				System.out.println(userPetName + " is such a cute name");

				// test user chosen pet type from list
				System.out.println("Please choose a pet type");
				System.out.println("DOG, CAT, RABBIT");
				String userPetType = userInput.nextLine().toLowerCase().trim();
				// trim() method eliminates leading and trailing spaces

				while (!userPetType.equals("dog") && !userPetType.equals("cat") && !userPetType.equals("rabbit")) {
					System.out.println("Please try again...");
					userPetType = userInput.nextLine().toLowerCase().trim();
					}

				Pet virtualPet1 = new Organic(userPetType, userPetName, true, 115,  80, 75, 75);
				virtualPetShelter.addPet(virtualPet1);
				
				System.out.println();
				System.out.println("Say hello to " + virtualPet1.getPetName() + ", your new " + virtualPet1.getPetType() + ".");
				System.out.println("----------");
				// end user pet creation
				break;
			case "5":
				virtualPetShelter.sleepAllPets();
				break;
			case "6":
				System.out.println("not available yet");
				break;
			case "7":
				virtualPetShelter.allPetStatus(); 
			}
			
			virtualPetShelter.incrementAllPets();
			virtualPetShelter.removePet();
		}

		System.out.println("Your pet died.");


	}//close main method

	
}//close application class
