package Model;

import java.util.ArrayList;

public class Player {
    private Inventory inventory;
    private String playerName;
    private int playerLevel;
    private int playerId;


    public Player (String playerName, int playerLevel, int playerId){
        this.inventory = new Inventory();
        this.playerName = playerName;
        this.playerLevel = playerLevel;
        this.playerId = playerId;
    }

    @Override
    public String toString() {
        return "Player{" +
                ", playerName='" + getPlayerName() + '\'' +
                ", playerLevel=" + getPlayerLevel() +
                ", playerId=" + getPlayerId() +
                '}';
    }

    public String showItems(){
        String result = playerName + " Inventory: \n";
        for (Item item : inventory.getItems()){
            result += item.toString() + "\n";
        }
        result += "Total Weight: " + inventory.getItemTotalWeight() + " Kg\n";
        return result;
    }


    public Inventory getInventory() {
        return inventory;
    }
    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public int getPlayerLevel() {
        return playerLevel;
    }
    public void setPlayerLevel(int playerLevel) {
        this.playerLevel = playerLevel;
    }
    public int getPlayerId() {
        return playerId;
    }
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }


}
