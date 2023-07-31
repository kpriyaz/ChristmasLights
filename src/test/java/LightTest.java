import org.example.Light;
import org.example.LightImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LightTest {
    Light light;
    @BeforeEach
    void setUp(){
        light = new LightImpl();
    }

    @Test
    public void testLightInitialState(){
        Assertions.assertEquals(0, light.getBrightness());
    }

    @Test
    public void testLightToggleOnce(){
        light.toggle();
        Assertions.assertEquals(2, light.getBrightness());
    }

    @Test
    public void testLightTurnedOn() {
        light.turnOn();
        Assertions.assertEquals(1, light.getBrightness());
    }

    @Test
    public void testLightTurnedOff() {
        light.turnOn();
        light.turnOff();
        Assertions.assertEquals(0, light.getBrightness());
    }

    @Test
    public void testLightBrightnessShouldBeNonNegative() {
        light.turnOff();
        light.turnOff();
        Assertions.assertEquals(0, light.getBrightness());
    }
}
