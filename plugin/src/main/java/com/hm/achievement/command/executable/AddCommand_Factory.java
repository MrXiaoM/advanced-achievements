package com.hm.achievement.command.executable;

import com.hm.achievement.config.AchievementMap;
import com.hm.achievement.db.AbstractDatabaseManager;
import com.hm.achievement.db.CacheManager;
import com.hm.achievement.utils.StatisticIncreaseHandler;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class AddCommand_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider langConfigProvider;
      private final Provider pluginHeaderProvider;
      private final Provider databaseManagerProvider;
      private final Provider cacheManagerProvider;
      private final Provider statisticIncreaseHandlerProvider;
      private final Provider achievementMapProvider;

      public AddCommand_Factory(Provider var1, Provider var2, Provider var3, Provider var4, Provider var5, Provider var6, Provider var7) {
            this.mainConfigProvider = var1;
            this.langConfigProvider = var2;
            this.pluginHeaderProvider = var3;
            this.databaseManagerProvider = var4;
            this.cacheManagerProvider = var5;
            this.statisticIncreaseHandlerProvider = var6;
            this.achievementMapProvider = var7;
      }

      public AddCommand get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (YamlConfiguration)this.langConfigProvider.get(), (StringBuilder)this.pluginHeaderProvider.get(), (AbstractDatabaseManager)this.databaseManagerProvider.get(), (CacheManager)this.cacheManagerProvider.get(), (StatisticIncreaseHandler)this.statisticIncreaseHandlerProvider.get(), (AchievementMap)this.achievementMapProvider.get());
      }

      public static AddCommand_Factory create(Provider var0, Provider var1, Provider var2, Provider var3, Provider var4, Provider var5, Provider var6) {
            return new AddCommand_Factory(var0, var1, var2, var3, var4, var5, var6);
      }

      public static AddCommand newInstance(YamlConfiguration var0, YamlConfiguration var1, StringBuilder var2, AbstractDatabaseManager var3, CacheManager var4, StatisticIncreaseHandler var5, AchievementMap var6) {
            return new AddCommand(var0, var1, var2, var3, var4, var5, var6);
      }
}
