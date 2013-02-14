package org.macker.example.domain.player;

import java.util.Collection;
import java.util.Vector;

import org.macker.example.domain.stats.PlayerStatistics;

public class Player {
   private String name;
   private String team;
   private Collection<String> previousTeams = new Vector<String>();
   private PlayerStatistics stats;

   public Player(String name) {
      super();
      this.name = name;
   }

   public String getName() {
      return name;
   }

   @Override
   public String toString() {
      return "Player[name=" + name + "]";
   }

   public String getTeam() {
      return team;
   }

   public Collection<String> getPreviousTeams() {
      return previousTeams;
   }

}
