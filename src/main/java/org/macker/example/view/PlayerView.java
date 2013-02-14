package org.macker.example.view;

import org.macker.example.model.Player;
import org.macker.example.service.PlayerService;

public class PlayerView {

   PlayerService playerService = new PlayerService();

   public void displayPlayer(String name) {
      Player player = playerService.findPlayer(name);
      // uncomment to see macker violation in action (you also need to import PlayerDAO) 
      // player = new PlayerDAO().findPlayerByName(name);
      System.out.println("player : " + player);
   }
}
