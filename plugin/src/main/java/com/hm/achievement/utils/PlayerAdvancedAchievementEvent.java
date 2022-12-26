package com.hm.achievement.utils;

import com.hm.achievement.domain.Achievement;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerAdvancedAchievementEvent extends Event implements Cancellable {
      private static final HandlerList HANDLERS = new HandlerList();
      private final Player player;
      private final Achievement achievement;
      private boolean cancelled;

      public PlayerAdvancedAchievementEvent(Player var1, Achievement var2) {
            this.player = var1;
            this.achievement = var2;
            this.cancelled = false;
      }

      public HandlerList getHandlers() {
            return HANDLERS;
      }

      public static HandlerList getHandlerList() {
            return HANDLERS;
      }

      public boolean isCancelled() {
            return this.cancelled;
      }

      public void setCancelled(boolean var1) {
            this.cancelled = var1;
      }

      public Player getPlayer() {
            return this.player;
      }

      public Achievement getAchievement() {
            return this.achievement;
      }
}
