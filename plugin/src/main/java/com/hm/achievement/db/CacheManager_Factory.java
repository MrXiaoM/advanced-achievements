package com.hm.achievement.db;

import com.hm.achievement.AdvancedAchievements;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
public final class CacheManager_Factory implements Factory {
      private final Provider advancedAchievementsProvider;
      private final Provider databaseManagerProvider;

      public CacheManager_Factory(Provider var1, Provider var2) {
            this.advancedAchievementsProvider = var1;
            this.databaseManagerProvider = var2;
      }

      public CacheManager get() {
            return newInstance((AdvancedAchievements)this.advancedAchievementsProvider.get(), (AbstractDatabaseManager)this.databaseManagerProvider.get());
      }

      public static CacheManager_Factory create(Provider var0, Provider var1) {
            return new CacheManager_Factory(var0, var1);
      }

      public static CacheManager newInstance(AdvancedAchievements var0, AbstractDatabaseManager var1) {
            return new CacheManager(var0, var1);
      }
}
