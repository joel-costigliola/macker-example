package org.macker.example.dao;

import org.macker.example.domain.player.Player;

public class PlayerDAO {

   public Player findPlayerByName(String name) {
      return new Player(name);
   }
}
