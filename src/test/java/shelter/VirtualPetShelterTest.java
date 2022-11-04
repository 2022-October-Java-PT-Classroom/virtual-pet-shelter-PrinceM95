package shelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class VirtualPetShelterTest {
    VirtualPetShelter underTest;
    VirtualPet pet;
    VirtualPet pet1;
    VirtualPet pet2;
    VirtualPet pet3;


    @BeforeEach
    public void setUp() {
        underTest = new VirtualPetShelter();
        pet = new VirtualPet("Henry", "is always happy", 50, 50, 50, 50);
        pet1 = new VirtualPet("Huey", "is a bit shy", 50, 50, 50, 50);
        pet2 = new VirtualPet("Hugh", "loves to eat", 50, 50, 50, 50);
        pet3 = new VirtualPet("Halle", "enjoys sleeping", 50, 50, 50, 50);
    }

    @Test
    public void shouldBeAbleToAddAPet() {
        underTest.add(pet);
        VirtualPet retrievedPet = underTest.getPet("Henry");
        assertEquals(retrievedPet, pet);
    }

    @Test
    public void shouldBeAbleToAdoptAPet() {
        underTest.add(pet);
        underTest.Adopt(pet);
        VirtualPet retrievedPet = underTest.getPet("Henry");
        assertEquals(retrievedPet, null);
    }

    @Test
    public void shouldBeAbleToAdmitAPet() {
        underTest.add(pet);
        underTest.Adopt(pet);
        VirtualPet retrievedPet = underTest.getPet("Henry");
        assertEquals(retrievedPet, null);

    }

    @Test
    public void shouldBeAbleToWaterAllOfThePets() {
        underTest.add(pet);
        underTest.waterAllPets();
        assertNotEquals(50, pet.getWater());
    }

    @Test
    public void shouldBeAbleToFeedAllOfThePets() {
        underTest.add(pet);
        underTest.feedAllPets();
        assertNotEquals(50, pet.getNutrition());
    }

    @Test
    public void shouldBeAbleToPlayWithAPet() {
        underTest.add(pet);
        underTest.playWithAPet("Henry");
        assertEquals(52, pet.getHappiness());
    }

    @Test
    public void shouldBeAbleToPlayWithANewlyAdmittedPet() {
        underTest.add(pet);
        underTest.Adopt(pet);
//        underTest(new VirtualPet("John", "loves to eat"));
        assertEquals(52, pet.getHappiness());
    }
}

