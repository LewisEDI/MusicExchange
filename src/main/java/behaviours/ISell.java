package behaviours;

import Instruments.Instrument;

public interface ISell {

    String sell(Instrument instrument);

    double calculateMarkup();

    boolean isTuned(Instrument instrument);
}
