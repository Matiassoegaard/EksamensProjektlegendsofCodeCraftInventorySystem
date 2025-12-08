package Model;

import java.util.ArrayList;

public class Inventory {
    private double itemTotalWeight;

    public Inventory(double itemTotalWeight, Item items) {
        this.itemTotalWeight = itemTotalWeight;
        items.standardItem();

    }


}
