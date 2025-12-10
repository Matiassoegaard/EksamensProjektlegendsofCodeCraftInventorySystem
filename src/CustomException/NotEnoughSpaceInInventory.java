package CustomException;

public class NotEnoughSpaceInInventory extends Exception{
    public NotEnoughSpaceInInventory(){
        super("Not enough space in inventory. ");
    }
}
