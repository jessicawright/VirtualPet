package virtualpet;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		

		// test user created pet name
		System.out.println("Enter pet name");
		String userPetName = userInput.nextLine();
		System.out.println(userPetName);

		// test user chosen pet type from list
		System.out.println("Please choose a pet type");
		System.out.println("DOG, CAT, RABBIT");
		String userPetType = userInput.nextLine().toLowerCase().trim();
		while (!userPetType.equals("dog") && !userPetType.equals("cat") && !userPetType.equals("rabbit")) {
			System.out.println("Please try again...");
			userPetType = userInput.nextLine().toLowerCase().trim();
		}

		Pet unnamed = new Pet(userPetName, userPetType, 10, true); // 0 not hungry at all
		System.out.println(unnamed.getPetName() + " " + unnamed.getPetType() + " " + unnamed.getPetHunger());
		// end user pet creation

		while (unnamed.petAlive()) {

			unnamed.incrementStatus();
			
			System.out.println("what would you like to do?");
			System.out.println("1. check pet status");
			System.out.println("2. feed pet");
			System.out.println("3. play with pet");
			System.out.println("4. clean pet");

			System.out.println("Press 2 to feed");
			int userMenuChoice = userInput.nextInt();

			System.out.println(userMenuChoice);
			if (userMenuChoice == 2) {
				unnamed.feedPet();
				System.out.println("new hunger status: " + unnamed.getPetHunger());
			
			}
		}
		
		System.out.println("Your pet died");
	}
	

}
