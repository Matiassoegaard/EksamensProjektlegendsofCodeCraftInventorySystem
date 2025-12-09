package Model;

public class Consumable extends Item{
    private ConsumableType itemType;
    private int stackSize;

    public Consumable(ConsumableType itemType, String itemName, double itemWeight, int itemLevel){
        super(itemName,itemWeight, itemLevel);
        this.itemType = itemType;
        this.stackSize = 1;
    }

    @Override
    public String toString() {
        return  "Item: " + getItemName() + " x" + getStackSize() + "\n" +
                "Level: " + getItemLevel() +"\n" +
                "Consumable: " + itemType + "\n";

    }

    public void addToStack(int amount){
        this.stackSize += amount;
    }
    public void removeFromStack(int amount){
        this.stackSize -= amount;
    }

    public boolean isSameType(Consumable other){
        return this.getItemName().equals(other.getItemName())
                && this.getConsumableType().equals(other.getConsumableType());
    }





    public enum ConsumableType{
        FOOD,
        DRINK,
        POTION
    }
    public int getStackSize(){
        return stackSize;
    }
    public ConsumableType getConsumableType(){
        return itemType;
    }


}
