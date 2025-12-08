package Model;

import java.util.ArrayList;

public class Inventory {
    private double itemTotalWeight;
    private ArrayList<Item> items;
    private int maxInventorySize = 32;

    public Inventory() {
        this.itemTotalWeight = 0;
        this.items = new ArrayList<>();
        addStarterItems();

    }

    public void addStarterItems(){
        //Tilføjer 3 standard items, som alle karaktere får når de bliver lavet
        items.add(new Armor(Armor.ArmorType.CHESTPLATE, "Common Chestplate", Armor.ArmorSubType.CLOTH,12.5,1));
        items.add(new Weapon(Weapon.WeaponType.SWORD,"Common Sword", Weapon.WieldType.ONE_HAND,1.5,1));
        items.add(new Consumable(Consumable.ConsumableType.POTION, "Common Health Potion", 0.1, 1));
        calculateTotalWeight();
    }

    //Metode til at fjerne et item ved hjælp af navn.
    //Hvis item bliver fjernet returner den true, hvis ikke returner den false
    public boolean removeItemByName(String itemName){
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItemName().equals(itemName)){
                Item removedItem = items.remove(i);
                itemTotalWeight -= removedItem.getItemWeight();
                return true;
            }
        }
        return false;
    }

    //Udregner den samlede vægt af alle items i et inventory
    private void calculateTotalWeight(){
        itemTotalWeight = 0;
        for (Item item : items){
            itemTotalWeight += item.getItemWeight();
        }
    }

    public void maxInventorySize(Player player){
        if (player.getPlayerLevel() == 2 ){
            setmaxInventorySize(64);
        }
        if (player.getPlayerLevel() == 3 ){
            setmaxInventorySize(96);
        }
        if (player.getPlayerLevel() == 4 ){
            setmaxInventorySize(128);
        }
        if (player.getPlayerLevel() == 5 ){
            setmaxInventorySize(160);
        }
        if (player.getPlayerLevel() == 6 ){
            setmaxInventorySize(192);
        }
    }

    //metode til at tilføje items
    public boolean addItem(Item item){
        if (items.size() >= getmaxInventorySize()){
            return false;
        }
        items.add(item);
        itemTotalWeight += item.getItemWeight();
        return true;
    }

    public ArrayList<Item> getItems(){
        return items;
    }
    public double getItemTotalWeight(){
        return itemTotalWeight;
    }
    public int getmaxInventorySize(){
        return maxInventorySize;
    }
    public void setmaxInventorySize(int maxInventorySize){
        this.maxInventorySize = maxInventorySize;
    }

}
