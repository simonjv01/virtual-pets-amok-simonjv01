package virtualpetshelter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RobotDogTest {
    RobotDog robotDog = new RobotDog("roboDoggy","metal dog","dog",1,2,3,4);


    @Test
    public void shouldReturnOilLevel() {
        Integer oilLevel = robotDog.getOilLevel();
        assertThat(oilLevel).isEqualTo(3);

    }

    @Test
    public void shouldReturnCatName() {
        String dogName = robotDog.getName();
        assertThat(dogName).isEqualTo("roboDoggy");

    }

    @Test
    public void shouldReturnType() {
        String petType = robotDog.getType();
        assertThat(petType).isEqualTo("dog");

    }

    @Test
    public void shouldReturnHealth() {
        Integer healthLevel = robotDog.getHealth();
        assertThat(healthLevel).isEqualTo(2);
    }

    @Test
    public void shouldBeAbleToOilDogAndIncreaseHappinessAndHealth() {
        Integer beforeOilLevel = robotDog.getOilLevel();
        RobotPet.oilPet(robotDog);
        Integer afterOilLevel = robotDog.getOilLevel();
        Integer afterHappinessLevel = robotDog.getHappiness();
        Integer afterHealthLevel = robotDog.getHealth();
        assertThat(afterOilLevel - beforeOilLevel).isEqualTo(5);
        assertThat(afterHappinessLevel).isEqualTo(9);
        assertThat(afterHealthLevel).isEqualTo(7);
    }






}
