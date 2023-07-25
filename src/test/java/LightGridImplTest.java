import org.example.Light;
import org.example.LightGrid;
import org.example.LightGridImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LightGridImplTest {

    @Test
    public void testGridDimension(){
        LightGrid grid = new LightGridImpl();
        Assertions.assertEquals(1000, grid.getMaxRows());
        Assertions.assertEquals(1000, grid.getMaxCols());
    }

    @Test
    public void testNumberOfLights(){
        LightGrid grid = new LightGridImpl();
        Light[][] lights = grid.getLights();
        Assertions.assertEquals(1000, lights.length);
    }
}
