package virtualpetshelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {

        VirtualPetShelter shelterPets = new VirtualPetShelter();

        Scanner input = new Scanner(System.in);
        RobotDog robotDog1 = new RobotDog("Terminator", "He'll always come back!", "robot dog", 43, 66, 42, 34);
        RobotDog robotDog2 = new RobotDog("MetalHead", "head of metal", "robot dog", 43, 66, 42, 34);
        RobotCat robotCat1 = new RobotCat("Fluff Metal", "fluffy metal", "robot cat", 25, 88, 35, 30);
        RobotCat robotCat2 = new RobotCat("Laser Eyes", "metal cat", "robot cat", 30, 50, 40, 20);
        OrganicCat organicCat1 = new OrganicCat("Hairy Hair", "long haired cat", "cat", 33, 45, 55, 35, 35, 42, 45);
        OrganicCat organicCat2 = new OrganicCat("Messy Mess", "likes to eat", "cat", 55, 45, 55, 35, 35, 42, 45);
        OrganicDog organicDog1 = new OrganicDog("Bull Head", "heavy set bulldog", "dog", 30, 40, 50, 20, 60, 50, 40);
        OrganicDog organicDog2 = new OrganicDog("Red Bull", "red haired dog", "dog", 30, 40, 50, 20, 60, 50, 40);

        shelterPets.addPet(robotDog1);
        shelterPets.addPet(robotDog2);
        shelterPets.addPet(robotCat1);
        shelterPets.addPet(robotCat2);
        shelterPets.addPet(organicCat1);
        shelterPets.addPet(organicCat2);
        shelterPets.addPet(organicDog1);
        shelterPets.addPet(organicDog2);

        System.out.println("Thank you for visiting Big Al's Virtual Pet Shelter and Delicatessen!");
        System.out.println("This is the status of your pets:");
        System.out.println();
        System.out.println("  Name\t     |Health\t |Happiness  |Boredom    | Type");
        System.out.println("-------------|-----------|------------------------------");
        robotCat1.displayBalances();
        System.out.println();
        robotCat2.displayBalances();
        System.out.println();
        robotDog1.displayBalances();
        System.out.println();
        robotDog2.displayBalances();
        System.out.println();
        organicCat1.displayBalances();
        System.out.println();
        organicCat2.displayBalances();
        System.out.println();
        organicDog1.displayBalances();
        System.out.println();
        organicDog2.displayBalances();
        System.out.println();
        System.out.println();

        do {
            System.out.println("What would you like to do next?");
            System.out.println();
            System.out.println("1. Feed all organic pets");
            System.out.println("2. Water all organic pets");
            System.out.println("3. Play with a pet");
            System.out.println("4. Adopt a pet");
            System.out.println("5. Admit a pet");
            System.out.println("6. Oil all robot pets");
            System.out.println("7. Walk all dogs");
            System.out.println("8. Clean all dog cages");
            System.out.println("9. Clean all cat litter boxes");
            System.out.println("10. List all organic pets");
            System.out.println("11. List all robot pets");
            System.out.println("12. Exit");
            String option = input.nextLine();

            if (option.equals("1")) {
                System.out.println("You fed all pets.");
                shelterPets.feedAllOrganicPets();
                shelterPets.robotCatTick();
                shelterPets.robotDogTick();
                shelterPets.organicCatTick();
                shelterPets.organicDogTick();
            } else if (option.equals("2")) {
                System.out.println("You watered all pets.");
                shelterPets.waterAllOrganicPets();
                shelterPets.robotCatTick();
                shelterPets.robotDogTick();
                shelterPets.organicCatTick();
                shelterPets.organicDogTick();
            } else if (option.equals("3")) {
                System.out.println("Which pet do you want to play with? Please choose one:");
                System.out.println(shelterPets.getAllPets());
                String playWithPet = input.nextLine();
                System.out.println("You played with " + playWithPet);
                shelterPets.playPet(playWithPet);
                shelterPets.robotCatTick();
                shelterPets.robotDogTick();
                shelterPets.organicCatTick();
                shelterPets.organicDogTick();
            } else if (option.equals("4")) {
                System.out.println("Which pet would you like to adopt? Please choose one:");
                System.out.println(shelterPets.getAllPets());
                String adoptAPet = input.nextLine();
                shelterPets.findPet(adoptAPet);
                System.out.println("You adopted " + adoptAPet);
                shelterPets.removePet(shelterPets.findPet(adoptAPet));
                shelterPets.robotCatTick();
                shelterPets.robotDogTick();
                shelterPets.organicCatTick();
                shelterPets.organicDogTick();
            } else if (option.equals("5")) {
                System.out.println("What is the name of the pet you want to admit?");
                String admitAPet = input.nextLine();
                OrganicPet admitPet1 = new OrganicPet(admitAPet, "New pet", "pet", 25, 25,33,43,44,55);
                shelterPets.addPet(admitPet1);
            } else if (option.equals("6")) {
                System.out.println("You oiled all the robotic pets.");
                shelterPets.oilAllRobotPets();
                shelterPets.robotCatTick();
                shelterPets.robotDogTick();
                shelterPets.organicCatTick();
                shelterPets.organicDogTick();
            } else if(option.equals("7")) {
                System.out.println("You walked all dogs.");
                shelterPets.walkAllOrganicDogs();
                shelterPets.walkAllRobotDogs();
                shelterPets.robotCatTick();
                shelterPets.robotDogTick();
                shelterPets.organicCatTick();
                shelterPets.organicDogTick();
            } else if (option.equals("8")) {
                System.out.println("You cleaned all the dog cages.");
                shelterPets.cleanAllCages();
                shelterPets.robotCatTick();
                shelterPets.robotDogTick();
                shelterPets.organicCatTick();
            } else if (option.equals("9")) {
                System.out.println("You cleaned all the litter boxes.");
                shelterPets.cleanAllLitterBoxes();
                shelterPets.robotCatTick();
                shelterPets.robotDogTick();
                shelterPets.organicDogTick();
            } else if (option.equals("10")) {
                System.out.println("Here is the list of all organic pets.");
                System.out.println(shelterPets.listOrganicPets());
                shelterPets.cleanAllLitterBoxes();
                shelterPets.robotCatTick();
                shelterPets.robotDogTick();
                shelterPets.organicDogTick();
                shelterPets.organicCatTick();

            } else  if (option.equals("11")){
                System.out.println("Here is the list of all robot pets.");
                System.out.println(shelterPets.listRobotPets());
                shelterPets.robotCatTick();
                shelterPets.robotDogTick();
                shelterPets.organicDogTick();
                shelterPets.organicCatTick();
            } else {
                System.out.println("Thank you for visiting Virtual Pet Shelter, goodbye!");
                System.exit(0);

                }

        } while (true);
    }
}


