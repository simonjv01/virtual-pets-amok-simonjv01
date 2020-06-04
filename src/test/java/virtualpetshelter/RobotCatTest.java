package virtualpetshelter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RobotCatTest {

    RobotCat robotCat = new RobotCat("roboKitty","metal cat","cat",1,2,3,4);


    @Test
    public void shouldReturnOilLevel() {
        Integer oilLevel = robotCat.getOilLevel();
        assertThat(oilLevel).isEqualTo(3);

    }

    @Test
    public void shouldReturnCatName() {
        String catName = robotCat.getName();
        assertThat(catName).isEqualTo("roboKitty");

    }

    @Test
    public void shouldReturnType() {
        String petType = robotCat.getType();
        assertThat(petType).isEqualTo("cat");

    }

    @Test
    public void shouldReturnHealth() {
        Integer healthLevel = robotCat.getHealth();
        assertThat(healthLevel).isEqualTo(2);
    }

    @Test
    public void shouldBeAbleToOilCatAndIncreaseHappinessAndHealth() {
        Integer beforeOilLevel = robotCat.getOilLevel();
        RobotPet.oilPet(robotCat);
        Integer afterOilLevel = robotCat.getOilLevel();
        Integer afterHappinessLevel = robotCat.getHappiness();
        Integer afterHealthLevel = robotCat.getHealth();
        assertThat(afterOilLevel - beforeOilLevel).isEqualTo(5);
        assertThat(afterHappinessLevel).isEqualTo(9);
        assertThat(afterHealthLevel).isEqualTo(7);
    }


}
