package org.macker.example.domain.stats;

import org.macker.example.domain.player.Player;

public class PlayerStatistics {

   private Player player;
   private int assists;
   private int pointsPerGame;

   public PlayerStatistics(Player player) {
      super();
      this.player = player;
   }

   public int getAssists() {
      return assists;
   }

   public void setAssists(int assists) {
      this.assists = assists;
   }

   public int getPointsPerGame() {
      return pointsPerGame;
   }

   public void setPointsPerGame(int pointsPerGame) {
      this.pointsPerGame = pointsPerGame;
   }
   
   public Player getPlayer() {
      return player;
   }

}
