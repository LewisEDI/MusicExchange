package Instruments ;

import behaviours.IPlay;
import behaviours.ISell;
import behaviours.ITune;

public class Guitar extends Instrument implements ISell, IPlay, ITune {

    private String handed;
    private String typeOfGuitar;
    private double costPrice;
    private double sellPrice;
    private String guitarBrand;
    private String guitarModel;


    public Guitar(String material, String typeOfInstrument, String colour, String handed, String typeOfGuitar, double costPrice, double sellPrice, String guitarBrand, String guitarModel, boolean tuned) {
        super(material, typeOfInstrument, colour, tuned);
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
        this.handed = handed;
        this.typeOfGuitar = typeOfGuitar;
        this.guitarBrand = guitarBrand;
        this.guitarModel = guitarModel;

    }

    public String getHanded() {
        return handed;
    }

    public void setHanded(String handed) {
        this.handed = handed;
    }

    public String getTypeOfGuitar() {
        return typeOfGuitar;
    }

    public void setTypeOfGuitar(String typeOfGuitar) {
        this.typeOfGuitar = typeOfGuitar;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getGuitarBrand() {
        return guitarBrand;
    }

    public void setGuitarBrand(String guitarBrand) {
        this.guitarBrand = guitarBrand;
    }

    public String getGuitarModel() {
        return guitarModel;
    }

    public void setGuitarModel(String guitarModel) {
        this.guitarModel = guitarModel;
    }

    public void tune(){
        this.tuned = true;

    }

    public boolean isTuned(Instrument instrument) {
        return tuned;
    }

    public String play(String music) {
        return "playing " + music;
    }


    public String sell(Instrument instrument) {
        return null;
    }

    public double calculateMarkup() {
        double markup = this.sellPrice - this.costPrice;
        return markup;
    }

}
