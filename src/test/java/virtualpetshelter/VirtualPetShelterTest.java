package virtualpetshelter;


import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;



public class VirtualPetShelterTest {
    VirtualPetShelter shelter = new VirtualPetShelter();
    RobotDog robotDog;
    RobotCat robotCat;
    OrganicDog organicDog;
    OrganicCat organicCat;

    @Before
    public void setUp() {
        shelter = new VirtualPetShelter();
        robotCat = new RobotCat("fluff metal", "cat", "cat", 10, 3, 4, 4);
        robotDog = new RobotDog("r2d2", "dog", "dog", 10, 3, 20, 10);
        organicCat = new OrganicCat("bingo", "cat", "cat", 10, 3, 4, 5, 6, 25, 50);
        organicDog = new OrganicDog("terminator", "dog", "dog", 15, 3, 4, 5, 10, 25, 50);
    }

    @Test
    public void shouldBeAbleToAddPet() {
        shelter.addPet(robotDog);
        Collection<VirtualPet> check = shelter.getAllPets();
        assertThat(check).containsAnyOf(robotDog);
    }

    @Test
    public void shouldBeAbleToRetrievePet() {
        shelter.addPet(robotDog);
        VirtualPet retrievePet = shelter.findPet(robotDog.getName());
        assertThat(retrievePet).isEqualTo(robotDog);
    }

    @Test
    public void shouldBeAbleToPlayWithAPet() {
        shelter.addPet(robotCat);
        shelter.playPet(robotCat.getName());
        assertThat(robotCat.getBoredom()).isEqualTo(5);
    }


    @Test
    public void shouldBeAbleToAddOrganicPet() {
        OrganicPet organicDog = new OrganicPet("", "", "animal", 4, 5, 6, 7, 8, 4);
        shelter.addPet(organicDog);
        Collection<VirtualPet> check = shelter.getAllPets();

        assertThat(check).containsExactly(organicDog);

    }

    @Test
    public void shouldBeAbleToAddRobotAndOrganicPets() {
        OrganicPet organicDog = new OrganicPet("spot", "dog", "dog", 45, 32, 34, 22, 12, 3);
        shelter.addPet(organicDog);
        shelter.addPet(robotCat);
        Collection<VirtualPet> check = shelter.getAllPets();

        assertThat(check).contains(organicDog, robotCat);
    }

    @Test
    public void shouldBeAbleToRetrieveAllPets() {
        shelter.addPet(robotCat);
        shelter.addPet(robotDog);
        shelter.addPet(organicCat);
        shelter.addPet(organicDog);
        Collection<VirtualPet> shelterPets = shelter.getAllPets();

        assertThat(shelterPets).contains(robotCat, robotDog, organicCat, organicDog);
    }


    @Test
    public void shouldBeAbleToAdoptAPet() {
        shelter.addPet(robotDog);
        shelter.removePet(robotDog);
        VirtualPet retrieveAccount = shelter.findPet(robotDog.getName());

        assertThat(retrieveAccount).isNull();
    }

    @Test
    public void shouldBeAbleToFeedOrganicPets() {
        OrganicPet.feedPet(organicDog);
        OrganicPet.feedPet(organicCat);

        assertThat(organicDog.getHungerLevel()).isEqualTo(10);
        assertThat(organicCat.getHungerLevel()).isEqualTo(10);

    }

    @Test
    public void shouldBeAbleToFeedAllOrganicPets() {
        shelter.addPet(robotDog);
        shelter.addPet(robotCat);
        shelter.addPet(organicDog);
        shelter.addPet(organicCat);
        Collection<VirtualPet> shelterPets = shelter.getAllPets();
        shelter.feedAllOrganicPets();

        assertThat(organicDog.getHungerLevel()).isEqualTo(10);
        assertThat(organicCat.getHungerLevel()).isEqualTo(10);
        assertThat(shelterPets.size()).isEqualTo(4);
    }


    @Test
    public void shouldBeAbleToWaterAllOrganicPets() {
        shelter.addPet(robotDog);
        shelter.addPet(robotCat);
        shelter.addPet(organicDog);
        shelter.addPet(organicCat);
        Collection<VirtualPet> shelterPets = shelter.getAllPets();
        shelter.waterAllOrganicPets();

        assertThat(organicDog.getThirstLevel()).isEqualTo(15);
        assertThat(organicCat.getThirstLevel()).isEqualTo(11);
        assertThat(shelterPets.size()).isEqualTo(4);
    }

    @Test
    public void shouldBeAbleToListOrganicPets() {
        shelter.addPet(robotCat);
        shelter.addPet(robotDog);
        shelter.addPet(organicCat);
        shelter.addPet(organicDog);
        Collection<OrganicPet> shelterPets = shelter.listOrganicPets();

        assertThat(shelterPets).contains(organicCat, organicDog);
        assertThat(shelterPets.size()).isEqualTo(2);
    }

    @Test
    public void shouldBeAbleToListRobotPets() {
        shelter.addPet(robotCat);
        shelter.addPet(robotDog);
        shelter.addPet(organicCat);
        shelter.addPet(organicDog);
        Collection<RobotPet> shelterPets = shelter.listRobotPets();

        assertThat(shelterPets).contains(robotDog, robotCat);
        assertThat(shelterPets.size()).isEqualTo(2);
    }

    @Test
    public void shouldBeAbleToOilAllRobotPets() {
        shelter.addPet(robotDog);
        shelter.addPet(robotCat);
        shelter.addPet(organicDog);
        shelter.addPet(organicCat);
        Collection<VirtualPet> shelterPets = shelter.getAllPets();
        shelter.oilAllRobotPets();

        assertThat(robotDog.getOilLevel()).isEqualTo(25);
        assertThat(robotCat.getOilLevel()).isEqualTo(9);
        assertThat(shelterPets.size()).isEqualTo(4);

    }

    @Test
    public void shouldBeAbleToWalkAllOrganicDogs() {
        shelter.addPet(robotDog);
        shelter.addPet(robotCat);
        shelter.addPet(organicDog);
        shelter.addPet(organicCat);
        Integer beforeHealthLevel = organicDog.getHealth();
        Collection<VirtualPet> shelterPets = shelter.getAllPets();
        shelter.walkAllOrganicDogs();
        Integer afterHealthLevel = organicDog.getHealth();

        assertThat(beforeHealthLevel + afterHealthLevel).isEqualTo(11);
        assertThat(organicDog.getWasteLevel()).isEqualTo(20);
        assertThat(organicDog.getHungerLevel()).isEqualTo(10);
        assertThat(organicDog.getThirstLevel()).isEqualTo(5);
        assertThat(organicDog.getHappiness()).isEqualTo(9);
        assertThat(organicDog.getCageCleanliness()).isEqualTo(48);


    }

    @Test
    public void shouldBeAbleToWalkAllRobotDogs() {
        shelter.addPet(robotDog);
        shelter.addPet(robotCat);
        shelter.addPet(organicDog);
        shelter.addPet(organicCat);
        Integer beforeHealthLevel = robotDog.getHealth();
        Collection<VirtualPet> shelterPets = shelter.getAllPets();
        shelter.walkAllRobotDogs();
        Integer afterHealthLevel = robotDog.getHealth();

        assertThat(beforeHealthLevel + afterHealthLevel).isEqualTo(11);
        assertThat(robotDog.getHappiness()).isEqualTo(15);
        assertThat(robotDog.getOilLevel()).isEqualTo(19);


    }

    @Test
    public void shouldBeAbleToCleanAllOrganicDogCages() {
        OrganicDog organicDog2 = new OrganicDog("lulu", "dog", "dog", 4, 5, 4, 3, 4, 35, 40);
        shelter.addPet(organicDog);
        shelter.addPet(organicDog2);
        Collection<VirtualPet> shelterPets = shelter.getAllPets();
        shelter.cleanAllCages();

        assertThat(organicDog.getCageCleanliness()).isEqualTo(35);
        assertThat(organicDog.getHappiness()).isEqualTo(19);
        assertThat(organicDog.getHealth()).isEqualTo(18);
        assertThat(organicDog.getWasteLevel()).isEqualTo(10);
        assertThat(organicDog2.getCageCleanliness()).isEqualTo(25);
        assertThat(organicDog2.getHappiness()).isEqualTo(19);
        assertThat(organicDog2.getHealth()).isEqualTo(20);
        assertThat(organicDog2.getWasteLevel()).isEqualTo(20);
    }

    @Test
    public void shouldBeAbleToCleanAllLitterBoxes() {
        OrganicCat organicCat2 = new OrganicCat("fluff", "cat2", "cat", 4, 5, 4, 3, 4, 35, 40);
        shelter.addPet(organicCat);
        shelter.addPet(organicCat2);
        Collection<VirtualPet> shelterPets = shelter.getAllPets();
        shelter.cleanAllLitterBoxes();

        assertThat(organicCat.getLitterLevel()).isEqualTo(35);
        assertThat(organicCat.getHappiness()).isEqualTo(19);
        assertThat(organicCat.getHealth()).isEqualTo(18);
        assertThat(organicCat.getWasteLevel()).isEqualTo(10);
        assertThat(organicCat2.getLitterLevel()).isEqualTo(25);
        assertThat(organicCat2.getHappiness()).isEqualTo(19);
        assertThat(organicCat2.getHealth()).isEqualTo(20);
        assertThat(organicCat2.getWasteLevel()).isEqualTo(20);


    }

    @Test
    public void shouldBeAbleToOrganicDogTick() {
        shelter.addPet(organicDog);
        Collection<VirtualPet> shelterPets = shelter.getAllPets();
        shelter.organicDogTick();

        assertThat(organicDog.getCageCleanliness()).isEqualTo(55);
        assertThat(organicDog.getHappiness()).isEqualTo(6);
        assertThat(organicDog.getHealth()).isEqualTo(8);
        assertThat(organicDog.getWasteLevel()).isEqualTo(30);
        assertThat(organicDog.getBoredom()).isEqualTo(20);
        assertThat(organicDog.getThirstLevel()).isEqualTo(15);
        assertThat(organicDog.getHungerLevel()).isEqualTo(10);
    }

    @Test
    public void shouldBeAbleToOrganicCatTick() {
        OrganicCat organicCat1 = new OrganicCat("bluey","blue cat","cat",1,1,1,1,1,1,1);
        shelter.addPet(organicCat1);
        Collection<VirtualPet> shelterPets = shelter.getAllPets();
        shelter.organicCatTick();

        assertThat(organicCat1.getLitterLevel()).isEqualTo(6);
        assertThat(organicCat1.getHappiness()).isEqualTo(3);
        assertThat(organicCat1.getHealth()).isEqualTo(6);
        assertThat(organicCat1.getWasteLevel()).isEqualTo(6);
        assertThat(organicCat1.getBoredom()).isEqualTo(6);
        assertThat(organicCat1.getThirstLevel()).isEqualTo(6);
        assertThat(organicCat1.getHungerLevel()).isEqualTo(6);
    }
    @Test
    public void shouldBeAbleToRobotCatTick() {
        RobotCat robotCat1 = new RobotCat("bluey","blue cat","cat",1,1,1,1);
        shelter.addPet(robotCat1);
        Collection<VirtualPet> shelterPets = shelter.getAllPets();
        shelter.robotCatTick();


        assertThat(robotCat1.getHappiness()).isEqualTo(3);
        assertThat(robotCat1.getHealth()).isEqualTo(6);
        assertThat(robotCat1.getOilLevel()).isEqualTo(6);
        assertThat(robotCat1.getBoredom()).isEqualTo(6);

    }

    @Test
    public void shouldBeAbleToRobotDogTick() {
        RobotDog robotDog1 = new RobotDog("bluey","blue cat","cat",1,1,1,1);
        shelter.addPet(robotDog1);
        Collection<VirtualPet> shelterPets = shelter.getAllPets();
        shelter.robotDogTick();


        assertThat(robotDog1.getHappiness()).isEqualTo(3);
        assertThat(robotDog1.getHealth()).isEqualTo(6);
        assertThat(robotDog1.getOilLevel()).isEqualTo(6);
        assertThat(robotDog1.getBoredom()).isEqualTo(6);

    }



}



