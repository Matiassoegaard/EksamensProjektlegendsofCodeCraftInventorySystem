package Model;

import CustomException.NotEnoughSpaceInInventory;

import java.util.ArrayList;

public class Inventory {
    private double itemTotalWeight;
    private ArrayList<Item> itemsInInventory;
    private int maxInventorySize = 6;


    public Inventory() {
        this.itemTotalWeight = 0;
        this.itemsInInventory = new ArrayList<>();
        addStarterItems();

    }

    public void addStarterItems(){
        //Tilføjer 3 standard items, som alle karaktere får når de bliver lavet
        itemsInInventory.add(new Armor(Armor.ArmorType.CHESTPLATE, "Common Chestplate", Armor.ArmorSubType.CLOTH,12.5,1));
        itemsInInventory.add(new Weapon(Weapon.WeaponType.SWORD,"Common Sword", Weapon.WieldType.ONE_HAND,1.5,1));
        itemsInInventory.add(new Consumable(Consumable.ConsumableType.POTION, "Common Health Potion", 0.1, 1));
        calculateTotalWeight();
    }

    //Metode til at fjerne et item ved hjælp af navn.
    //Hvis item bliver fjernet returner den true, hvis ikke returner den false
    public boolean removeItemByName(String itemName){
        for (int i = 0; i < itemsInInventory.size(); i++) {
            if (itemsInInventory.get(i).getItemName().equals(itemName)){
                Item removedItem = itemsInInventory.remove(i);
                itemTotalWeight -= removedItem.getItemWeight();
                return true;
            }
        }
        return false;
    }

    //Udregner den samlede vægt af alle items i et inventory
    private void calculateTotalWeight(){
        itemTotalWeight = 0;
        for (Item item : itemsInInventory){
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
        //Gør til: Try catch til not custom exception handling
        try{
                if (item instanceof Consumable){
                    Consumable newConsumable = (Consumable) item;
                    for (Item existingItem : getItemsInInventory()){
                        if(existingItem instanceof Consumable){
                            Consumable existingConsumable = (Consumable) existingItem;

                            if(existingConsumable.isSameType(newConsumable)){
                                existingConsumable.addToStack(newConsumable.getStackSize());
                                itemTotalWeight += newConsumable.getItemWeight();
                                return true;
                            }
                        }
                    }
                }
            if (getItemsInInventory().size() >= getmaxInventorySize()){
                throw new NotEnoughSpaceInInventory();
            }

                itemsInInventory.add(item);
                itemTotalWeight += item.getItemWeight();
                return true;

        } catch (NotEnoughSpaceInInventory e){
            System.out.println(e.getMessage());
            return false;
        }



    }

    public ArrayList<Item> getItemsInInventory(){
        return itemsInInventory;
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
