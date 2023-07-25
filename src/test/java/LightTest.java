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
        Assertions.assertFalse(light.isLightOn());
    }

    @Test
    public void testLightToggleOnce(){
        light.toggle();
        Assertions.assertTrue(light.isLightOn());
    }

    @Test
    public void testLightToggleTwice(){
        light.toggle();
        light.toggle();
        Assertions.assertFalse(light.isLightOn());
    }
}
