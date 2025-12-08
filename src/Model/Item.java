package Model;

import java.util.ArrayList;

public class Item {


    private String itemName;
    private double itemWeight;
    private int itemLevel;


    public Item(){}


    public Item (String itemName, double itemWeight, int itemLevel) {
        this.itemName = itemName;
        this.itemWeight = itemWeight;
        this.itemLevel = itemLevel;
    }


    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public void setItemWeight(double itemWeight) {
        this.itemWeight = itemWeight;
    }
    public void setItemLevel(int itemLevel) {
        this.itemLevel = itemLevel;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemWeight() {
        return itemWeight;
    }
    public int getItemLevel() {
        return itemLevel;
    }





}
