import Instruments.Guitar;
import Instruments.Piano;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {


    Guitar guitarTuned;
    Guitar guitarUntuned;
    Piano piano;
    Shop shop;

    @Before
    public void setup(){
        guitarTuned = new Guitar("wood", Instruments.TypeOfInstrument.STRING, "red", "left", "electric", 100.00, 150.00, "Fender", "Strat", true);
        guitarUntuned = new Guitar("wood", Instruments.TypeOfInstrument.STRING, "red", "left", "electric", 100.00, 150.00, "Fender", "Strat", false);
        shop = new Shop();
    }

    @Test
    public void canAddGuitar(){
        shop.addStock(guitarTuned);
        assertEquals(1, shop.getStock());
    }

    @Test
    public void canSellTunedStock(){
        shop.addStock(guitarTuned);
        shop.sell(guitarTuned);
        assertEquals(0, shop.getStock());
    }

    @Test
    public void cantSellUntunedStock(){
        shop.addStock(guitarUntuned);
        shop.sell(guitarUntuned);
        assertEquals(1, shop.getStock());

    }

    @Test
    public void testTunedStockSaleConfirmationMessasge(){
        shop.addStock(guitarTuned);
        assertEquals("Instrument has been sold", shop.sell(guitarTuned));
    }

    @Test
    public void testUntunedStockErrorMessageWhenSaleAttempted(){
        shop.addStock(guitarUntuned);
        assertEquals("Instrument needs to be turned!", shop.sell(guitarUntuned));
    }

    @Test
    public void canTuneUntunedInstrumentAndSell(){
        guitarUntuned.tune();
        shop.addStock(guitarUntuned);
        shop.sell(guitarUntuned);
        assertEquals(0, shop.getStock());

    }

    @Test
    public void returnMarkupForTotalStock(){
        shop.addStock(guitarUntuned);
        shop.addStock(guitarTuned);
        assertEquals(100.00, shop.calculateMarkup(), 0.1);

    }


}



