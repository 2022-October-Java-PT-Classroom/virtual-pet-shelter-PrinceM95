package shelter;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userChoice;

        VirtualPetShelter myShelter = new VirtualPetShelter();
        VirtualPet pet = new VirtualPet("Henry", "He's always happy", 50, 50, 50, 50);
        VirtualPet pet1 = new VirtualPet("Huey", "He's a bit shy",50,50,50,50);
        VirtualPet pet2 = new VirtualPet("Hugh", "Loves to eat",50, 50, 50,50);
        VirtualPet pet3 = new VirtualPet("Halle", "Enjoys sleeping",50, 50, 50,50);

        myShelter.add(pet);
        myShelter.add(pet1);
        myShelter.add(pet2);
        myShelter.add(pet3);

        System.out.println("Thank you for volunteering at the Shelter For Horses\n");
        System.out.println("This is the status of your pets:\n");

        do {
            myShelter.showPetNamesAndStats();
            System.out.println();
            System.out.println("What would you like to do next?");
            System.out.println("1. Feed the pets");
            System.out.println("2. Water the pets");
            System.out.println("3. Play with a pet");
            System.out.println("4. Adopt a pet");
            System.out.println("5. Admit a pet");
            System.out.println("6: Quit");
            userChoice = input.nextLine();


            if (userChoice.equals("1")) {
                myShelter.feedAllPets();
                System.out.println("Every pet thanked you for feeding them.\n");
            } else if (userChoice.equals("2")) {
                myShelter.waterAllPets();
                System.out.println("Every pet thanked you for watering them.\n");
            } else if (userChoice.equals("3")) {
                System.out.println("You'd like to play with a pet, please choose one by typing their name:");
                myShelter.showPetNamesAndDescriptions();
                String petName = input.nextLine();
                myShelter.playWithAPet(petName);
            } else if (userChoice.equals("4")) {
                System.out.println("You'd like to adopt a pet, please choose one by typing their name:\n");
                System.out.println("Here are the pets:\n");
                myShelter.showPetNamesAndDescriptions();

                String petToAdopt = input.nextLine();
                ArrayList<VirtualPet> petsInArray = myShelter.getAllPets();
                for (VirtualPet petName : petsInArray) {
                    if (petName.getName().equalsIgnoreCase(petToAdopt)) {
                        myShelter.Adopt(petName);
                    }
                }
                System.out.println("\nSuccessfully adopted: " + petToAdopt);

            } else if (userChoice.equals("5")) {
                System.out.println("You'd like to admit a pet. Please provide their name");
                String newPetName = input.nextLine();
                System.out.println("Please provide a brief description of " + newPetName);
                String newDescription = input.nextLine();
                System.out.println("Rest easy, we'll take good care of " + newPetName + ": " + newDescription + "!\n");
                myShelter.add(new VirtualPet(newPetName, newDescription));
            }
            for (VirtualPet vp : myShelter.getAllPets()) {
                vp.tick();
            }

        }while(!userChoice.equals("6"));
        System.out.println("Thanks for stopping by. Take care!");
    }
}
