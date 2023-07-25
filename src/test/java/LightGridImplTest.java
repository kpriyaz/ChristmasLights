import org.example.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LightGridImplTest {
    LightGrid grid;

    @BeforeEach
    void setUp(){
        grid = new LightGridImpl();
    }

    @Test
    public void testGridDimension(){
        Assertions.assertEquals(1000, grid.getMaxRows());
        Assertions.assertEquals(1000, grid.getMaxCols());
    }

    @Test
    public void testNumberOfLights(){
        Light[][] lights = grid.getLights();
        Assertions.assertEquals(1000, lights.length);
    }

    @Test
    public void testInitialLightState(){
        Light[][] lights = grid.getLights();
        Assertions.assertEquals(0, grid.countLitLights());
    }

    @Test
    public void testToggleGrid(){
        Coordinates topLeft = new Coordinates(0,0);
        Coordinates bottomLeft = new Coordinates(grid.getMaxRows()-1, grid.getMaxCols()-1);
        grid.toggleLights(topLeft, bottomLeft);
        Assertions.assertEquals(1000000, grid.countLitLights());
    }

    @Test
    public void testToggleGridInvalidInput(){
        Coordinates topLeft = new Coordinates(5,6);
        Coordinates bottomRight = new Coordinates(4, 9);
        Assertions.assertThrows(InvalidCoordinates.class, () -> grid.toggleLights(topLeft, bottomRight));
    }

    @Test
    public void testToggleGridSingleRow(){
        Coordinates topLeft = new Coordinates(0,0);
        Coordinates bottomRight = new Coordinates(0, 999);

        grid.toggleLights(topLeft, bottomRight);
        Assertions.assertEquals(1000, grid.countLitLights());
    }


    @Test
    public void testCountLitLights(){
        Assertions.assertEquals(0, grid.countLitLights());
    }

    @Test
    public void testCountLitLightsSingleCol(){

        Coordinates topLeft = new Coordinates(0,0);
        Coordinates bottomRight = new Coordinates(999, 0);

        grid.toggleLights(topLeft, bottomRight);
        Assertions.assertEquals(1000, grid.countLitLights());
    }

    @Test
    public void test2PartialGridToggled(){

        Coordinates topLeft = new Coordinates(887,9);
        Coordinates bottomRight = new Coordinates(959, 629);

        Coordinates topLeft2 = new Coordinates(454,398);
        Coordinates bottomRight2 = new Coordinates(844, 448);


        int count1 = getLightCountInGrid(topLeft, bottomRight);
        int count2 = getLightCountInGrid(topLeft2, bottomRight2);

        grid.toggleLights(topLeft, bottomRight);
        grid.toggleLights(topLeft2, bottomRight2);

        Assertions.assertEquals(count1+count2, grid.countLitLights());

    }

    private int getLightCountInGrid(Coordinates tl, Coordinates br){
        int rows = br.getRow() - tl.getRow() +1;
        int cols = br.getCol() - tl.getCol() +1;
        return rows*cols;
    }

}
