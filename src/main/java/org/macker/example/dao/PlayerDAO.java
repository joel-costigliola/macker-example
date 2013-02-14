package org.macker.example.dao;

import org.macker.example.model.Player;

public class PlayerDAO {

   public Player findPlayerByName(String name) {
      return new Player(name);
   }
}
