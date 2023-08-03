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
    void test_lightInitialState(){
        Assertions.assertFalse(light.isTurnedOn());
    }

    @Test
    void test_toggleLight(){
        light.toggle();

        Assertions.assertTrue(light.isTurnedOn());
    }

    @Test
    void test_toggleLightTwice(){
        light.toggle();
        light.toggle();
        Assertions.assertFalse(light.isTurnedOn());
    }

}
