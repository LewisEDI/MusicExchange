package Instruments;

import behaviours.ISell;

public abstract class Instrument implements ISell {

    private String material;
    private String typeOfInstrument;
    private String colour;
    public boolean tuned;

    public Instrument(String material, String typeOfInstrument, String colour, boolean tuned){
        this.material = material;
        this.typeOfInstrument = typeOfInstrument;
        this.colour = colour;
        this.tuned = tuned;

    }

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return typeOfInstrument;
    }

    public String getColour() {
        return colour;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setType(String type) {
        this.typeOfInstrument = type;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isTuned() {
        return tuned;
    }

    public void setTuned(boolean tuned) {
        this.tuned = tuned;
    }

    public void tune(){
        this.tuned = true;
    }
}
