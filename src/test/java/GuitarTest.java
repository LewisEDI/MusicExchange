import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;
    Guitar guitar2;

    @Before
    public void Setup(){
        guitar = new Guitar("wood", "string", "red", "left", "electric", 100.00, 150.00, "fender", "strat", true);
        guitar2 = new Guitar("wood", "string", "red", "left", "electric", 100.00, 150.00, "fender", "strat", false);
    }

    @Test

    public void tunedStatusTrue(){
        assertEquals(true, guitar.isTuned());
    }

    @Test

    public void tunedStatusFalse(){
        assertEquals(false, guitar2.isTuned());
    }

    @Test

    public void canPlay(){
        assertEquals("playing Hendrix",guitar.play("Hendrix"));
    }

    @Test

    public void getMarkup(){
        assertEquals(50.00, guitar.calculateMarkup(), 0.1);
    }

}
