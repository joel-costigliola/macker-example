package org.macker.example.model;

public class Player {
   private String name;

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
   
   
}
