import org.example.Coordinates;
import org.example.Light;
import org.example.impl.LightGridImpl;
import org.example.impl.LightImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LightGridImplTest {

    LightGridImpl grid;
    @BeforeEach
    void setup(){
        grid = new LightGridImpl();
    }

    @Test
    void test_GridDimensions(){
        Assertions.assertEquals(1000, grid.getMaxRows());
        Assertions.assertEquals(1000, grid.getMaxCols());
    }

    @Test
    void test_LightExists(){
        Light light = grid.getLights()[0][0];
        Assertions.assertNotNull(light);
    }

    @Test
    void test_initialGridState(){
        Light[][] lights = grid.getLights();

        for (int i = 0; i < grid.getMaxRows(); i++) {
            for (int j = 0; j < grid.getMaxCols(); j++) {
                Assertions.assertFalse(lights[i][j].isTurnedOn());
            }
        }
    }

    @Test
    void test_countLitLights(){
        Assertions.assertEquals(0, grid.countLitLights());
    }

    @Test
    void test_test_countLitLights_oneLightOn(){
        Coordinates coordinate = new Coordinates(0,0);
        toggleLightsInGrid(List.of(coordinate));
        Assertions.assertEquals(1, grid.countLitLights());
    }

    @Test
    void test_test_countLitLights_oneLightToggledTwice(){
        Coordinates c1 = new Coordinates(0,0);
        toggleLightsInGrid(List.of(c1, c1));

        Assertions.assertEquals(0, grid.countLitLights());
    }

    @Test
    void test_test_countLitLights_twoLightsToggled(){
        Coordinates c1 = new Coordinates(0,5);
        Coordinates c2 = new Coordinates(100,679);
        toggleLightsInGrid(List.of(c1, c2));

        Assertions.assertEquals(2, grid.countLitLights());
    }


    private void toggleLightsInGrid(List<Coordinates> coordinatesList){

        for (Coordinates c: coordinatesList) {
            grid.getLights()[c.getRow()][c.getCol()].toggle();
        }

    }


}
