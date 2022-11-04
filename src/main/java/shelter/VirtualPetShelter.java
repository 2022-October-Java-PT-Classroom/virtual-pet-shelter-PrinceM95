package shelter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class VirtualPetShelter {
    Map<String, VirtualPet> pets = new HashMap<>();

    public ArrayList<VirtualPet> getAllPets() {
        ArrayList<VirtualPet> petsInArray = new ArrayList <>(pets.values());
        return petsInArray;
    }

    public VirtualPet getPet(String name) {
        return pets.get(name);
    }

    public void add(VirtualPet addNewPet) {
        pets.put(addNewPet.getName(), addNewPet);
    }

    public void Adopt(VirtualPet pet) {
        pets.remove(pet.getName(), pet);
    }

    public void feedAllPets() {
        System.out.println("Okay, you'd like to feed the pets:");
        for(VirtualPet pet : pets.values()){
        pet.feedAll();
        System.out.println("Every pet thanked you for feeding them.\n");
        showPetNamesAndStats();
        }
    }

    public void waterAllPets() {
        System.out.println("Okay, you'd like to water the pets:");
        for (VirtualPet pet : pets.values()) {
        pet.waterAll();
        System.out.println("Every pet thanked you for watering them.\n");
        showPetNamesAndStats();
        }
    }

    public void playWithAPet(String name) {
        VirtualPet idlePet = getPet(name);
            idlePet.updateFields(-1, 2, -1, -1);
            System.out.println("Current stats:");
            showPetNamesAndStats();
            }

    public void showPetNamesAndStats() {
        System.out.printf("%-10s %-15s %-15s %-12s %-10s %n ","Name ", "Nutrition", "Happiness", "Energy", "Water");
        for (VirtualPet pet : pets.values()) {
        System.out.printf("%-10s %-15s %-15s %-12s %-10s %n ",  pet.getName(), pet.getNutrition(), pet.getHappiness(),
        pet.getEnergy(), pet.getWater());
        }
    }

    public void showPetNamesAndDescriptions() {
        for (VirtualPet pet : pets.values()) {
            System.out.println(" " + pet.getName() + " " + pet.getDescription());
        }
    }
}

