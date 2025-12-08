package Logik;

import java.util.ArrayList;

public class Player {
    private Inventory inventory;
    private String playerName;
    private int playerLevel;
    private int playerId;
    private ArrayList<Player> listOfPlayers;

    public Player (Inventory inventory, String playerName, int playerLevel, int playerId){
        this.inventory = inventory;
        this.playerName = playerName;
        this.playerLevel = playerLevel;
        this.playerId = playerId;
        listOfPlayers = new ArrayList<Player>();
    }



}
