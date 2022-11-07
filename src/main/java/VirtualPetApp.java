import shelter.VirtualPet;

import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {

        //user input
        int userInput;
        Scanner input = new Scanner(System.in);

        //pet info and properties
        VirtualPet pet = new VirtualPet("Henry", 50, 50, 50, 50);
        System.out.println(pet.getName());
        pet.showPetStats();
        System.out.println();

        do {
            System.out.println("What would you like to do with Henry?");
            System.out.println("1. Feed " + pet.getName());
            System.out.println("2. Give " + pet.getName() + " a nap ");
            System.out.println("3. Play with " + pet.getName() + "!");
            System.out.println("4. Nothing. Do you Henry.");
            System.out.println("5. Water " + pet.getName());
            System.out.println("6. I'm done here. Good luck Henry! Exit game please.");
            userInput = input.nextInt();

            if (userInput > 6) {
                System.out.println("** Please select a number between 1 and 6. Try again, Henry's waiting: ");
                System.out.println();
                continue;

            } else if (userInput == 1) {
                if (pet.getNutrition() > 100) {
                    System.out.println(" Hunger levels are good. Peak satisfaction! ");
                    System.out.println();
                    continue;
                }
                System.out.println(" " + pet.getName() + " says thank you for the treat! ");
                System.out.println();
                pet.updateFields(13, 8, -1, -1);
                pet.tick();
                pet.showPetStats();
                System.out.println();


            } else if (userInput == 2) {
                if (pet.getEnergy() > 100) {
                    System.out.println(" Energy bar looks good. Henry's wide awake. ");
                    System.out.println();
                    continue;
                }
                System.out.println(" " + pet.getName() + " says thank you for the nap ");
                System.out.println();
                pet.updateFields(9, -1, -3, -1);
                pet.tick();
                pet.showPetStats();
                System.out.println();

            } else if (userInput == 3) {
                if (pet.getHappiness() > 100) {
                    System.out.println(" Henry's in great spirits! ");
                    System.out.println();
                    continue;
                }
                System.out.println(" " + pet.getName() + " says thank you for taking them out for a run! ");
                System.out.println();
                pet.updateFields(-6, 9, -3, -3);
                pet.showPetStats();
                System.out.println();

            } else if (userInput == 4) {
                System.out.println(" " + pet.getName() + " Henry's lost ");
                System.out.println();
                pet.updateFields(-3, -3, -5, -1);
                pet.showPetStats();
                System.out.println();

            } else if (userInput == 5) {
                if (pet.getEnergy() > 100) {
                    System.out.println(" Water levels look good. Henry's not thirsty. ");
                    System.out.println();
                    continue;
                }
                System.out.println(" " + pet.getName() + " says thank you for the water ");
                System.out.println();
                pet.updateFields(2, -1, -3, 9);
                pet.tick();
                pet.showPetStats();
                System.out.println();
            }

        }while (userInput != 6);
            System.out.println(" Henry thanks you for your time and says goodbye ");
        }
    }


