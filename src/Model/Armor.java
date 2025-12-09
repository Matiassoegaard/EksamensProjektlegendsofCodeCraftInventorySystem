package Model;

public class Armor extends Item {
    private ArmorType armorType;
    private ArmorSubType armorSubType;


    @Override
    public String toString() {
        return  "Item: " + getItemName() + "\n" +
                "Level: " + getItemLevel() + "\n" +
                "Type: " + armorType + "\n" +
                "Material: " + armorSubType + "\n";
    }

    public Armor(Armor.ArmorType armorType, String itemName, Armor.ArmorSubType armorSubType, double itemWeight, int itemLevel){
        super(itemName,itemWeight, itemLevel);
        this.armorType = armorType;
        this.armorSubType = armorSubType;
    }

    public enum ArmorType {
        CHESTPLATE,
        HELMET,
        PANTS,
        BOOTS,
        BELT,
        GLOVES
    }

    public enum ArmorSubType {
        MAIL,
        LEATHER,
        CLOTH
    }



}
