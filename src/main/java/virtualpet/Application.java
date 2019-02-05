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

		s("*************************************");
		s(" Welcome! to The Thr33 Pets Shelter\n   Our Shelter Curruntly Holds " + virtualPetShelter.getPetsLength()+" Pets");
		s("*************************************");
//		Pet virtualPet = createPet(userInput);
		
		s("Press 1 + Enter to Enter The Game");
		s("*************************************");
		int userMenuChoice = userInput.nextInt();
		userInput.nextLine();
		

		while (userMenuChoice != 9) {// (virtualPet.petAlive()) {

			System.out.println(virtualPetShelter.getPetsLength());

			s("1. feed all pets");
			s("2. play with pets");
			s("3. clean pets");
			s("4. Accept new pet");
			s("5. Let pets sleep");
			s("6. Select a pet");
			s("7. Check the status of the pets");
			s("8. Adopt a pet out");
			s("9. Exit");
			s("------------------------------");
			s("what would you like to do?");
			
			s("*************************************");
			userMenuChoice = userInput.nextInt();
			userInput.nextLine();

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
				s("Hello! Please enter a name for your new pet.");
				String userPetName = userInput.nextLine();
				s(userPetName + " is such a cute name");

				// test user chosen pet type from list
				s("Please choose a pet type");
				s("DOG, CAT, RABBIT");
				String userPetType = userInput.nextLine().toLowerCase().trim();
				// trim() method eliminates leading and trailing spaces

				while (!userPetType.equals("dog") && !userPetType.equals("cat") && !userPetType.equals("rabbit")) {
					s("Please try again...");
					userPetType = userInput.nextLine().toLowerCase().trim();
				}
				s("Is your " + userPetType + " 'organic' or 'robotic'?");
				String userPetOrgRob = userInput.nextLine().toLowerCase().trim();

          while (!userPetOrgRob.equals("organic") && !userPetOrgRob.equals("robotic")) {
					s("Please try again...");
					userPetOrgRob = userInput.nextLine().toLowerCase().trim();
				}
				if (userPetOrgRob.equals("organic")) {
					Pet newOrganic = new Organic(userPetName, userPetType, true, 1, 115, 80, 75, 75);
					if (newOrganic instanceof Organic) {
						virtualPetShelter.addPet(newOrganic);
					}

					System.out.println();
					s(
							"Say hello to " + newOrganic.getPetName() + ", your new " + newOrganic.getPetType() + ".");
					System.out.println("--------------------------------");
				}

				else if (userPetOrgRob.equals("robotic")) {
					Pet virtualPet1 = new Robotic(userPetName, userPetType, true, 1, 115, 80, 75);
					if (virtualPet1 instanceof Robotic)
						virtualPetShelter.addPet(virtualPet1);

					System.out.println();
					s("Say hello to " + virtualPet1.getPetName() + ", your new "
							+ virtualPet1.getPetType() + ".");
					s("-------------------------------");

					// end user pet creation
				}
				break;
			case 5:
				virtualPetShelter.sleepAllPets();
				virtualPetShelter.incrementAllPets();
				break;
			case 6:
				
				s("Select the pet you want to checkout");
				virtualPetShelter.petNameList();
				Pet x = virtualPetShelter.getPet(userInput.next());				
				
				String userMenuChoice1 = userInput.nextLine();
				while (!userMenuChoice1.equals("9")) {
					if (x instanceof Organic) {
						s("1. feed pet");
						s("2. play with pet");
						s("3. clean pet");
						s("4. Let pet sleep");
						s("5. Take pet to the Vet");
						s("9. Exit");
						
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
							s("1. fill oil");
							s("2. charge battery");
							s("3. maintain pet");
							s("4. Take pet to the Vet");
							s("9. Exit");
							
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
				s("Please select a pet to adopt by entering their name: ");
				String petToAdopt = userInput.nextLine();
				Pet adoptedPet = virtualPetShelter.getPet(petToAdopt);
				virtualPetShelter.adoptPetOut(adoptedPet.getPetName());
				break;
			case 9:
				break;
			default :
				s("Try again.");
				break;
			}
			virtualPetShelter.removePet();
			// virtualPetShelter.removeRoboticPet();

		}

		s("\tShelter Closed.");
		s("\t   Goodbye.");
		s("\t______***________");

	}// close main method
	
	private static void s(String s) {
		System.out.println(s);

	}

}// close application class
