package virtualpet;

import java.util.Scanner;

public class Application {

	public static Scanner userInput = new Scanner(System.in);
	public static PetShelter virtualPetShelter = new PetShelter();

	public static void main(String[] args) {

//		String petName, String petType, int petFullness, boolean petAlive, int petCleanliness, int petHappiness, int petEnergy

		Pet pet1 = new Robotic("spot", "dog", true, 1, 20, 80, 75);
		Pet pet2 = new Robotic("happy", "rabbit", true, 1, 50, 40, 60);
		Pet pet3 = new Organic("saddy", "cat", true, 1, 10, 50, 50, 0);

		virtualPetShelter.addPet(pet1);
		virtualPetShelter.addPet(pet2);
		virtualPetShelter.addPet(pet3);

		System.out.println("Welcome! The current pet population is: " + virtualPetShelter.getPetsLength());

//		Pet virtualPet = createPet(userInput);
		System.out.println("*******************");
		System.out.println("Press any key to start.");
		int userMenuChoice = userInput.nextInt();

		while (userMenuChoice != 9) {// (virtualPet.petAlive()) {

			System.out.println(virtualPetShelter.getPetsLength());

			System.out.println("1. feed all pets");
			System.out.println("2. play with pets");
			System.out.println("3. clean pets");
			System.out.println("4. Accept new pet");
			System.out.println("5. Let pets sleep");
			System.out.println("6. Select a pet");
			System.out.println("7. Check the status of the pets");
			System.out.println("9. Exit");
			System.out.println();
			System.out.println("what would you like to do?");
			userMenuChoice = userInput.nextInt();

			System.out.println(userMenuChoice);
			
			switch (userMenuChoice) {

			case 1:
				virtualPetShelter.feedAllPets();
				virtualPetShelter.incrementAllPets();
				break;
			case 2:
				virtualPetShelter.playAllPets();
				virtualPetShelter.incrementAllPets();
				break;
			case 3:
				virtualPetShelter.cleanAllPets();
				virtualPetShelter.incrementAllPets();
				break;
			case 4:
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
				System.out.println("Is your " + userPetType + " 'organic' or 'robotic'?");
				String userPetOrgRob = userInput.nextLine().toLowerCase().trim();

          while (!userPetOrgRob.equals("organic") && !userPetOrgRob.equals("robotic")) {
					System.out.println("Please try again...");
					userPetOrgRob = userInput.nextLine().toLowerCase().trim();
				}
				if (userPetOrgRob.equals("organic")) {
					Pet newOrganic = new Organic(userPetName, userPetType, true, 1, 115, 80, 75, 75);
					if (newOrganic instanceof Organic) {
						virtualPetShelter.addPet(newOrganic);
					}

					System.out.println();
					System.out.println(
							"Say hello to " + newOrganic.getPetName() + ", your new " + newOrganic.getPetType() + ".");
					System.out.println("----------");
				}

				else if (userPetOrgRob.equals("robotic")) {
					Pet virtualPet1 = new Robotic(userPetName, userPetType, true, 1, 115, 80, 75);
					if (virtualPet1 instanceof Robotic)
						virtualPetShelter.addPet(virtualPet1);

					System.out.println();
					System.out.println("Say hello to " + virtualPet1.getPetName() + ", your new "
							+ virtualPet1.getPetType() + ".");
					System.out.println("----------");

					// end user pet creation
				}
				break;
			case 5:
				virtualPetShelter.sleepAllPets();
				virtualPetShelter.incrementAllPets();
				break;
			case 6:
				
				System.out.println("Select the pet you want to checkout");
				virtualPetShelter.petNameList();
				Pet x = virtualPetShelter.getPet(userInput.next());				
				
				String userMenuChoice1 = userInput.nextLine();
				while (!userMenuChoice1.equals("9")) {
					if (x instanceof Organic) {
						System.out.println("1. feed pet");
						System.out.println("2. play with pet");
						System.out.println("3. clean pet");
						System.out.println("4. Let pet sleep");
						System.out.println("5. Take pet to the Vet");
						System.out.println("9. Exit");
						System.out.println();
						// the next cases fall under Organic

						userMenuChoice1 = userInput.nextLine();
						switch (userMenuChoice1) {
						case "1":
							((Organic) x).feedPet();
							break;
						case "2":
							((Organic) x).playPet();
							break;
						case "3":
							((Organic) x).cleanPet();
							break;
						case "4":
							((Organic) x).sleepPet();
							break;
						case "5":
							x.sendToVet();
							break;
						case "9":
							break;
						default:
							System.out.println("Try again");
							break;
						}
					} else {
						if (x instanceof Robotic) {
							System.out.println("1. fill oil");
							System.out.println("2. charge battery");
							System.out.println("3. maintain pet");
							System.out.println("4. Take pet to the Vet");
							System.out.println("9. Exit");
							System.out.println();
							// the next cases fall under Organic
							userMenuChoice1 = userInput.nextLine();
							switch (userMenuChoice1) {
							case "1":
								((Robotic) x).addOil();
								break;
							case "2":
								((Robotic) x).chargeBattery();
								break;
							case "3":
								((Robotic) x).maintainence();
								break;
							case "4":
								x.sendToVet();
								break;
							case "9":
								break;
							default:
								System.out.println("Try again");
								break;
							}
						}
					}

				}
				virtualPetShelter.incrementAllPets();
				break;
			// still need to figure out where the proper placement for the break is
			case 7:
				virtualPetShelter.incrementAllPets();
				virtualPetShelter.removePet();
				virtualPetShelter.allPetStatus();
				break;
			case 8:
				break;
			case 9:
				break;
			default :
				System.out.println("Try again.");
				break;
			}
			virtualPetShelter.removePet();
			// virtualPetShelter.removeRoboticPet();

		}

		System.out.println("Shelter closed.");
		System.out.println("Goodbye.");

	}// close main method

}// close application class
