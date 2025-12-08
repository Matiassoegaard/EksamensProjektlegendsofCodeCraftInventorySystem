package Logik;

import Model.Player;

public class Handle {


    public void createPlayer(String playerName, int playerLevel, int playerId) {
        Player p = new Player(playerName,playerLevel,playerId);
    }


}
