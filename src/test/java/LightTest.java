import org.example.Light;
import org.example.LightImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LightTest {

    @Test
    public void testInitialState(){
        Light light = new LightImpl();
        Assertions.assertEquals(false, light.isLightOn());
    }

    @Test
    public void testToggleToOn(){
        Light light = new LightImpl();
        light.toggle();
        Assertions.assertEquals(true, light.isLightOn());
    }

    @Test
    public void testToggleTwice(){
        Light light = new LightImpl();
        light.toggle();
        light.toggle();
        Assertions.assertEquals(false, light.isLightOn());
    }
}
