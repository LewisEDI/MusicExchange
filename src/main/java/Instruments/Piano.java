package Instruments;

import behaviours.IPlay;
import behaviours.ISell;
import behaviours.ITune;

public class Piano extends Instrument implements IPlay, ITune, ISell {

    private String pianoBrand;
    private String pianoModel;
    private double costPrice;
    private double sellPrice;

    public Piano(String material, TypeOfInstrument typeOfInstrument, String colour, String pianoBrand, String pianoModel, boolean tuned, double costPrice, double sellPrice) {
        super(material, typeOfInstrument.KEYS, colour, tuned);
        this.pianoBrand = pianoBrand;
        this.pianoModel = pianoModel;
        this.sellPrice = sellPrice;
        this.costPrice = costPrice;
    }

    public String getPianoBrand() {
        return pianoBrand;
    }

    public void setPianoBrand(String pianoBrand) {
        this.pianoBrand = pianoBrand;
    }

    public String getPianoModel() {
        return pianoModel;
    }

    public void setPianoModel(String pianoModel) {
        this.pianoModel = pianoModel;
    }

    public boolean isTuned() {
        return tuned;
    }

    public String play(String music){
        return "playing " + music;
    }


    public String tune(String music){
        this.tuned = true;
        play(music);
        return "Piano has been tuned!";

    }

    public void sell(ISell item) {

    }

    public String sell(Instrument instrument) {
        return null;
    }

    public double calculateMarkup() {
        double markup = this.sellPrice - this.costPrice;
        return markup;
    }

    public boolean isTuned(Instrument instrument) {
        return false;
    }
}
