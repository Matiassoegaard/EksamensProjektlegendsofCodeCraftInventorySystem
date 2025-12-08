import Logik.PlayerHandle;
import Model.Player;
import Model.Item;
import Model.Weapon;

public class Test {
    public static void main(String[] args){
        PlayerHandle p = new PlayerHandle();
        Player p1 = p.createPlayer("user1",1,1);

        System.out.println(p1.showItems());
        p1.getInventory().removeItemByName("Common Sword");
        System.out.println(p1.showItems());
        p1.getInventory().addItem(new Weapon(Weapon.WeaponType.GREATSWORD,"Rare Greatsword", Weapon.WieldType.TWO_HAND,1.3,1));
        System.out.println(p1.showItems());

    }
}
