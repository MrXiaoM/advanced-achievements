package com.hm.achievement.api;

import com.hm.achievement.AdvancedAchievements;
import com.hm.achievement.config.AchievementMap;
import com.hm.achievement.db.AbstractDatabaseManager;
import com.hm.achievement.db.CacheManager;
import com.hm.achievement.utils.StatisticIncreaseHandler;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
public final class AdvancedAchievementsBukkitAPI_Factory implements Factory {
      private final Provider advancedAchievementsProvider;
      private final Provider cacheManagerProvider;
      private final Provider databaseManagerProvider;
      private final Provider statisticIncreaseHandlerProvider;
      private final Provider achievementMapProvider;

      public AdvancedAchievementsBukkitAPI_Factory(Provider var1, Provider var2, Provider var3, Provider var4, Provider var5) {
            this.advancedAchievementsProvider = var1;
            this.cacheManagerProvider = var2;
            this.databaseManagerProvider = var3;
            this.statisticIncreaseHandlerProvider = var4;
            this.achievementMapProvider = var5;
      }

      public AdvancedAchievementsBukkitAPI get() {
            return newInstance((AdvancedAchievements)this.advancedAchievementsProvider.get(), (CacheManager)this.cacheManagerProvider.get(), (AbstractDatabaseManager)this.databaseManagerProvider.get(), (StatisticIncreaseHandler)this.statisticIncreaseHandlerProvider.get(), (AchievementMap)this.achievementMapProvider.get());
      }

      public static AdvancedAchievementsBukkitAPI_Factory create(Provider var0, Provider var1, Provider var2, Provider var3, Provider var4) {
            return new AdvancedAchievementsBukkitAPI_Factory(var0, var1, var2, var3, var4);
      }

      public static AdvancedAchievementsBukkitAPI newInstance(AdvancedAchievements var0, CacheManager var1, AbstractDatabaseManager var2, StatisticIncreaseHandler var3, AchievementMap var4) {
            return new AdvancedAchievementsBukkitAPI(var0, var1, var2, var3, var4);
      }
}
