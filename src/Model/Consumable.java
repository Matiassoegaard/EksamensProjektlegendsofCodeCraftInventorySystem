package Model;

public class Consumable extends Item{
    private ConsumableType itemType;

    @Override
    public String toString() {
        return  "ItemName " + getItemName() +
                "Level " + getItemLevel() +
                "Consumable{" +
                "itemType=" + itemType +
                '}';
    }

    public Consumable(ConsumableType itemType, String itemName, double itemWeight, int itemLevel){
        super(itemName,itemWeight, itemLevel);
        this.itemType = itemType;
    }

    public enum ConsumableType{
        FOOD,
        DRINK,
        POTION
    }


}
