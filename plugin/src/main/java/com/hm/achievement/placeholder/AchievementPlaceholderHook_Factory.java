package com.hm.achievement.placeholder;

import com.hm.achievement.AdvancedAchievements;
import com.hm.achievement.config.AchievementMap;
import com.hm.achievement.db.CacheManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
public final class AchievementPlaceholderHook_Factory implements Factory {
      private final Provider advancedAchievementsProvider;
      private final Provider cacheManagerProvider;
      private final Provider achievementMapProvider;

      public AchievementPlaceholderHook_Factory(Provider var1, Provider var2, Provider var3) {
            this.advancedAchievementsProvider = var1;
            this.cacheManagerProvider = var2;
            this.achievementMapProvider = var3;
      }

      public AchievementPlaceholderHook get() {
            return newInstance((AdvancedAchievements)this.advancedAchievementsProvider.get(), (CacheManager)this.cacheManagerProvider.get(), (AchievementMap)this.achievementMapProvider.get());
      }

      public static AchievementPlaceholderHook_Factory create(Provider var0, Provider var1, Provider var2) {
            return new AchievementPlaceholderHook_Factory(var0, var1, var2);
      }

      public static AchievementPlaceholderHook newInstance(AdvancedAchievements var0, CacheManager var1, AchievementMap var2) {
            return new AchievementPlaceholderHook(var0, var1, var2);
      }
}
