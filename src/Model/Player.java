package Model;

import java.util.ArrayList;

public class Player {
    private Inventory inventory;
    private String playerName;
    private int playerLevel;
    private int playerId;
    private ArrayList<Player> listOfPlayers;

    public Player() {}

    @Override
    public String toString() {
        return "Player{" +
                ", playerName='" + getPlayerName() + '\'' +
                ", playerLevel=" + getPlayerLevel() +
                ", playerId=" + getPlayerId() +
                '}';
    }



    public Player (String playerName, int playerLevel, int playerId){
        this.inventory = inventory;
        this.playerName = playerName;
        this.playerLevel = playerLevel;
        this.playerId = playerId;
        listOfPlayers = new ArrayList<Player>();
    }

    public Player createPlayer(String playerName, int playerLevel, int playerId){
        Player newPlayer = new Player(inventory, playerName, playerLevel, playerId);
        Item standardItem = new Item();
        standardItem.standardItem();
        return newPlayer;
    }

    public String showItems(){
        Item i = new Item();
        return i.standardItem().toString();
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
