import org.example.impl.LightImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LightImplTest {
    LightImpl light;
    @BeforeEach
    void setup(){
        light = new LightImpl();
    }

    @Test
    void testInitialState(){
        Assertions.assertFalse(light.isTurnedOn());
    }

    @Test
    void testToggle(){
        light.toggle();
        Assertions.assertTrue(light.isTurnedOn());
    }

    @Test
    void testToggleTwice(){
        light.toggle();
        light.toggle();
        Assertions.assertFalse(light.isTurnedOn());
    }
}
