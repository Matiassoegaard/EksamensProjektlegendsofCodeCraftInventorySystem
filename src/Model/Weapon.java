package Model;

public class Weapon extends Item {
    private WeaponType weaponType;
    private WieldType weaponSubType;

    @Override
    public String toString() {
        return  "ItemName " + getItemName() +
                "Level " + getItemLevel() +
                "Weapon{" +
                "weaponType=" + weaponType +
                ", weaponSubType=" + weaponSubType +
                '}';
    }

    public Weapon(WeaponType weaponType, String itemName, WieldType weaponSubType, double itemWeight, int itemLevel){
        super(itemName, itemWeight, itemLevel);
        this.weaponType = weaponType;
        this.weaponSubType = weaponSubType;
    }

    public enum WeaponType {
        SWORD,
        AXE,
        HAMMER,
        GREATSWORD,
        GREATAXE,
        GREATHAMMER,
        DAGGER,
        STAFF
    }
    public enum WieldType{
        ONE_HAND,
        TWO_HAND
    }

}
