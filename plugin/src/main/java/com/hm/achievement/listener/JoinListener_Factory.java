package com.hm.achievement.listener;

import com.hm.achievement.AdvancedAchievements;
import com.hm.achievement.db.CacheManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
public final class JoinListener_Factory implements Factory {
      private final Provider advancedAchievementsProvider;
      private final Provider cacheManagerProvider;

      public JoinListener_Factory(Provider var1, Provider var2) {
            this.advancedAchievementsProvider = var1;
            this.cacheManagerProvider = var2;
      }

      public JoinListener get() {
            return newInstance((AdvancedAchievements)this.advancedAchievementsProvider.get(), (CacheManager)this.cacheManagerProvider.get());
      }

      public static JoinListener_Factory create(Provider var0, Provider var1) {
            return new JoinListener_Factory(var0, var1);
      }

      public static JoinListener newInstance(AdvancedAchievements var0, CacheManager var1) {
            return new JoinListener(var0, var1);
      }
}
