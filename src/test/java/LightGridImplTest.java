import org.example.Coordinates;
import org.example.impl.LightGridImpl;
import org.example.impl.LightImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LightGridImplTest {

    // 1M lights to be present
    // countLitLights return 0 initially
    // toggle 1 light - cll is 1
    // grid dimensions
    LightGridImpl lightGrid;

    @BeforeEach
    void setup(){
        lightGrid = new LightGridImpl();

    }
    @Test
    void testGridDimensions(){
        Assertions.assertEquals(1000, lightGrid.getMaxRows());
        Assertions.assertEquals(1000, lightGrid.getMaxCols());
    }

    @Test
    void testLightCount(){
        Assertions.assertEquals(1000, lightGrid.getLights().length);
        Assertions.assertEquals(1000, lightGrid.getLights()[0].length);
    }

    @Test
    void testInitialGridState(){
        LightImpl currentLight;
        for (int i = 0; i < lightGrid.getMaxRows(); i++) {
            for (int j = 0; j < lightGrid.getMaxCols(); j++) {
                currentLight = (LightImpl) lightGrid.getLights()[i][j];
                Assertions.assertNotNull(currentLight);
                Assertions.assertFalse(currentLight.isTurnedOn());
            }
        }
    }

    @Test
    void testCountLitLights(){
        Assertions.assertEquals(0, lightGrid.countLitLights());
    }

    @Test
    void testToggleOneLight(){
        lightGrid.getLights()[0][0].toggle();
        Assertions.assertEquals(1, lightGrid.countLitLights());
    }


    @Test
    void testTurnOnFullGrid(){
        Coordinates c1 = new Coordinates(0,0);
        Coordinates c2 = new Coordinates(999,999);
        lightGrid.turnOnGrid(c1, c2);
        Assertions.assertEquals(1000000, lightGrid.countLitLights());
    }

    @Test
    void testTurnOnSameGridTwice(){
        Coordinates c1 = new Coordinates(0,0);
        Coordinates c2 = new Coordinates(1,1);
        lightGrid.turnOnGrid(c1, c2);
        Assertions.assertEquals(4, lightGrid.countLitLights());
        lightGrid.turnOnGrid(c1, c2);
        Assertions.assertEquals(4, lightGrid.countLitLights());
    }
}
