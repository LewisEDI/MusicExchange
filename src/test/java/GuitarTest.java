import Instruments.Guitar;
import Instruments.TypeOfInstrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;
    Guitar guitar2;


    @Before
    public void Setup(){
        guitar = new Guitar("wood", Instruments.TypeOfInstrument.STRING, "red", "left", "electric", 100.00, 150.00, "Fender", "Strat", true);
        guitar2 = new Guitar("wood", Instruments.TypeOfInstrument.STRING, "red", "left", "electric", 100.00, 150.00, "Fender", "Strat", false);
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
