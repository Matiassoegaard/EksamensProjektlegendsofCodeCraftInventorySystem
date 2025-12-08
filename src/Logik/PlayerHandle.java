package Logik;

import Model.Inventory;
import Model.Player;

public class PlayerHandle {


    public Player createPlayer(String playerName, int playerLevel, int playerId) {
        Player player  = new Player(playerName,playerLevel,playerId);
        return player;
    }


}
