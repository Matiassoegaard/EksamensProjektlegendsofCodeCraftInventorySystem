import Model.Player;
import Model.Item;

public class Test {
    public void main(String[]args){
        Item i = new Item();

        System.out.println(i.standardItem().toString());

        Player p = new Player("user1",1,1);
        System.out.println(p.showItems());
        System.out.println(p);

    }
}
