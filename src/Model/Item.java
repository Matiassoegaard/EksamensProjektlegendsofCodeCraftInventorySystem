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


    public ArrayList<Item> standardItem(){
        ArrayList<Item> standardItems = new ArrayList<>();
        standardItems.add(new Armor(Armor.ArmorType.CHESTPLATE, "Common Chestplate", Armor.ArmorSubType.CLOTH,12.5,1));
        standardItems.add(new Weapon(Weapon.WeaponType.SWORD,"Common Sword", Weapon.WieldType.ONE_HAND,1.5,1));
        standardItems.add(new Consumable(Consumable.ConsumableType.POTION, "Common Potion", 0.1, 1));
        return standardItems;
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
