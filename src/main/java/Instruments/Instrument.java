package Instruments;

import behaviours.ISell;

public abstract class Instrument implements ISell {

    private String material;
    private TypeOfInstrument typeOfInstrument;
    private String colour;
    public boolean tuned;

    public Instrument(String material, TypeOfInstrument typeOfInstrument, String colour, boolean tuned){
        this.material = material;
        this.typeOfInstrument = typeOfInstrument;
        this.colour = colour;
        this.tuned = tuned;

    }

    public String getMaterial() {
        return material;
    }


    public String getColour() {
        return colour;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public TypeOfInstrument getTypeOfInstrument() {
        return typeOfInstrument;
    }

    public void setTypeOfInstrument(TypeOfInstrument typeOfInstrument) {
        this.typeOfInstrument = typeOfInstrument;
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
