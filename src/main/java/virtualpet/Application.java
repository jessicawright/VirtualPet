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

		Pet unnamed = new Pet(userPetName, userPetType);
		System.out.println(unnamed.getPetName() + " " + unnamed.getPetType());

		

		
	}
}