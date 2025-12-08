package Model;

public class Consumable extends Item{
    private ConsumableType itemType;

    @Override
    public String toString() {
        return  "Item: " + getItemName() +"\n" +
                "Level: " + getItemLevel() +"\n" +
                "Consumable: " + itemType + "\n";

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
