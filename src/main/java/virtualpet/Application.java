package virtualpet;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

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

		Pet unnamed = new Pet(userPetName, userPetType, 50, true, 50, 50, 50); // 0 not hungry at all
		System.out.println("Say hello to " + unnamed.getPetName() + ", your new " + unnamed.getPetType() + ".");
		System.out.println("----------");
		// end user pet creation

		while (unnamed.petAlive()) {

			unnamed.incrementStatus();

			System.out.println("what would you like to do?");
			System.out.println();
			System.out.println("----------");
			System.out.println("Pet Status:");
			System.out.println("Fullness = " + unnamed.getPetFullness());
			System.out.println("Cleanliness = " + unnamed.getPetCleanliness());
			System.out.println("Energy = " + unnamed.getPetEnergy());
			System.out.println("Happiness = " + unnamed.getPetHappiness()); // create method petStatus?
			System.out.println("----------");
			System.out.println();
			System.out.println("1. feed pet.");
			System.out.println("2. play with pet");
			System.out.println("3. clean pet");
			System.out.println("4. Accept new pet");

			String userMenuChoice = userInput.nextLine();

			System.out.println(userMenuChoice);
			switch (userMenuChoice) {

			case "1":
				unnamed.feedPet();
				break;
			case "2":
				unnamed.playPet();
				break;
			case "3":
				unnamed.cleanPet();
				break;
			case "4":
				//System.out.println("Enter pet name");
				//userPetName = userInput.nextLine();
				//System.out.println(userPetName);

				// test user chosen pet type from list
				///System.out.println("Please choose a pet type");
				//System.out.println("DOG, CAT, RABBIT");
				//userPetType = userInput.nextLine().toLowerCase().trim();
				///trim() method eliminates leading and trailing spaces

				//while (!userPetType.equals("dog") && !userPetType.equals("cat") && !userPetType.equals("rabbit")) {
					//System.out.println("Please try again...");
					//userPetType = userInput.nextLine().toLowerCase().trim();
				System.out.println("Not available yet");
					break;

				}
			}

			System.out.println("Your pet died.");
		}
	}

