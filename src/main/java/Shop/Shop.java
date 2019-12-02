package Shop;

import Instruments.Instrument;
import behaviours.ISell;

import java.util.ArrayList;



public class Shop implements ISell {

    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<ISell>();

    }


    public String sell(Instrument instrument) {
      if(instrument.isTuned()){
            int index = stock.indexOf(instrument);
            stock.remove(index);
            return "Instrument has been sold";
        }

        return "Instrument needs to be turned!";

    }

    public void addStock(ISell item){
        stock.add(item);
    }

    
    public double calculateMarkup() {
        double total = 0;
        double markUp = 0;

        for (ISell instrument: stock)
              {markUp = instrument.calculateMarkup();
              total += markUp;
        }
        return total;
    }

    public boolean isTuned(Instrument instrument) {
        return false;
    }

    public int getStock(){
        return stock.size();
    }


}
