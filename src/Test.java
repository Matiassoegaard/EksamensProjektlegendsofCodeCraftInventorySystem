import CustomException.NotEnoughSpaceInInventory;
import Logik.PlayerHandle;
import Model.Consumable;
import Model.Player;
import Model.Item;
import Model.Weapon;

public class Test {
    public static void main(String[] args){
        PlayerHandle p = new PlayerHandle();
        Player p1 = new Player("user1",1,1);

        //        System.out.println(p1.showItems());
        p1.getInventory().removeItemByName("Common Sword");
//        System.out.println(p1.showItems());
        p1.getInventory().addItem(new Weapon(Weapon.WeaponType.GREATSWORD,"Rare Greatsword", Weapon.WieldType.TWO_HAND,1.3,1));
//        System.out.println(p1.showItems());
        Consumable po1 = new Consumable(Consumable.ConsumableType.POTION,"Common Mana Potion",0.1,1);
        Consumable po2 = new Consumable(Consumable.ConsumableType.POTION,"Common Mana Potion",0.1,1);
        Consumable po3 = new Consumable(Consumable.ConsumableType.POTION,"Common Mana Potion",0.1,1);
        Consumable po4 = new Consumable(Consumable.ConsumableType.POTION,"Common Health Potion",0.1,1);
        p1.getInventory().addItem(new Weapon(Weapon.WeaponType.GREATSWORD,"asdsadad Greatsword", Weapon.WieldType.TWO_HAND,1.3,1));
        p1.getInventory().addItem(new Weapon(Weapon.WeaponType.GREATSWORD,"EDedadaedeadaeadad Greatsword", Weapon.WieldType.TWO_HAND,1.3,1));

        // 3 "not enough space in inventory".
        // 2 fra added items i Test.java og 1 fra exception.
        p1.getInventory().addItem(po1);
        p1.getInventory().addItem(po2);
        p1.getInventory().addItem(po3);
        p1.getInventory().addItem(po4);
        p1.getInventory().addItem(new Weapon(Weapon.WeaponType.GREATSWORD,"Long Greatsword", Weapon.WieldType.TWO_HAND,1.3,1));
        p1.getInventory().addItem(new Weapon(Weapon.WeaponType.GREATSWORD,"YESASA Greatsword", Weapon.WieldType.TWO_HAND,1.3,1));
        p1.getInventory().addItem(new Weapon(Weapon.WeaponType.GREATSWORD,"YEasdasdasdsadSASA Greatsword", Weapon.WieldType.TWO_HAND,1.3,1));
        System.out.println(p1.showItems());
    }

}
