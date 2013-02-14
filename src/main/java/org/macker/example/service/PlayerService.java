package org.macker.example.service;

import org.macker.example.dao.PlayerDAO;
import org.macker.example.domain.player.Player;

public class PlayerService {

   PlayerDAO playerDao = new PlayerDAO();

   public Player findPlayer(String name) {
      return playerDao.findPlayerByName(name);
   }

}
