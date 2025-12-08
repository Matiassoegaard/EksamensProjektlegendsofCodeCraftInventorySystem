package Logik;

import Model.Player;

public class PlayerHandle {


    public void createPlayer(String playerName, int playerLevel, int playerId) {
        Player p = new Player(playerName,playerLevel,playerId);
    }


}
