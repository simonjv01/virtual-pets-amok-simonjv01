package virtualpetshelter;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RobotPetTest {
    VirtualPetShelter shelter = new VirtualPetShelter();
    RobotCat robotCat = new RobotCat("roboKitty","metal cat","cat",1,2,3,4);
    RobotDog robotDog = new RobotDog("roboDoggy","metal dog","dog",1,2,3,4);




    @Test
    public void shouldBeAbleToOilRoboticPets() {
        RobotDog.oilPet(robotDog);
        RobotCat.oilPet(robotCat);

        assertThat(robotDog.getOilLevel()).isEqualTo(8);
        assertThat(robotCat.getOilLevel()).isEqualTo(8);

    }








}
