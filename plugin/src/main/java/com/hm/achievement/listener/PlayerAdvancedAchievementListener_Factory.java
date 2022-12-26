package com.hm.achievement.listener;

import com.hm.achievement.AdvancedAchievements;
import com.hm.achievement.command.executable.ToggleCommand;
import com.hm.achievement.config.AchievementMap;
import com.hm.achievement.config.RewardParser;
import com.hm.achievement.db.AbstractDatabaseManager;
import com.hm.achievement.db.CacheManager;
import com.hm.achievement.utils.FancyMessageSender;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.logging.Logger;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class PlayerAdvancedAchievementListener_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider langConfigProvider;
      private final Provider loggerProvider;
      private final Provider pluginHeaderProvider;
      private final Provider cacheManagerProvider;
      private final Provider advancedAchievementsProvider;
      private final Provider rewardParserProvider;
      private final Provider achievementMapProvider;
      private final Provider databaseManagerProvider;
      private final Provider toggleCommandProvider;
      private final Provider fancyMessageSenderProvider;

      public PlayerAdvancedAchievementListener_Factory(Provider var1, Provider var2, Provider var3, Provider var4, Provider var5, Provider var6, Provider var7, Provider var8, Provider var9, Provider var10, Provider var11) {
            this.mainConfigProvider = var1;
            this.langConfigProvider = var2;
            this.loggerProvider = var3;
            this.pluginHeaderProvider = var4;
            this.cacheManagerProvider = var5;
            this.advancedAchievementsProvider = var6;
            this.rewardParserProvider = var7;
            this.achievementMapProvider = var8;
            this.databaseManagerProvider = var9;
            this.toggleCommandProvider = var10;
            this.fancyMessageSenderProvider = var11;
      }

      public PlayerAdvancedAchievementListener get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (YamlConfiguration)this.langConfigProvider.get(), (Logger)this.loggerProvider.get(), (StringBuilder)this.pluginHeaderProvider.get(), (CacheManager)this.cacheManagerProvider.get(), (AdvancedAchievements)this.advancedAchievementsProvider.get(), (RewardParser)this.rewardParserProvider.get(), (AchievementMap)this.achievementMapProvider.get(), (AbstractDatabaseManager)this.databaseManagerProvider.get(), (ToggleCommand)this.toggleCommandProvider.get(), (FancyMessageSender)this.fancyMessageSenderProvider.get());
      }

      public static PlayerAdvancedAchievementListener_Factory create(Provider var0, Provider var1, Provider var2, Provider var3, Provider var4, Provider var5, Provider var6, Provider var7, Provider var8, Provider var9, Provider var10) {
            return new PlayerAdvancedAchievementListener_Factory(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      }

      public static PlayerAdvancedAchievementListener newInstance(YamlConfiguration var0, YamlConfiguration var1, Logger var2, StringBuilder var3, CacheManager var4, AdvancedAchievements var5, RewardParser var6, AchievementMap var7, AbstractDatabaseManager var8, ToggleCommand var9, FancyMessageSender var10) {
            return new PlayerAdvancedAchievementListener(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      }
}
