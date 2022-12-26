package com.hm.achievement.runnable;

import com.hm.achievement.config.AchievementMap;
import com.hm.achievement.db.CacheManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
import org.bukkit.configuration.file.YamlConfiguration;

@DaggerGenerated
public final class AchieveDistanceRunnable_Factory implements Factory {
      private final Provider mainConfigProvider;
      private final Provider achievementMapProvider;
      private final Provider cacheManagerProvider;
      private final Provider disabledCategoriesProvider;

      public AchieveDistanceRunnable_Factory(Provider var1, Provider var2, Provider var3, Provider var4) {
            this.mainConfigProvider = var1;
            this.achievementMapProvider = var2;
            this.cacheManagerProvider = var3;
            this.disabledCategoriesProvider = var4;
      }

      public AchieveDistanceRunnable get() {
            return newInstance((YamlConfiguration)this.mainConfigProvider.get(), (AchievementMap)this.achievementMapProvider.get(), (CacheManager)this.cacheManagerProvider.get(), (Set)this.disabledCategoriesProvider.get());
      }

      public static AchieveDistanceRunnable_Factory create(Provider var0, Provider var1, Provider var2, Provider var3) {
            return new AchieveDistanceRunnable_Factory(var0, var1, var2, var3);
      }

      public static AchieveDistanceRunnable newInstance(YamlConfiguration var0, AchievementMap var1, CacheManager var2, Set var3) {
            return new AchieveDistanceRunnable(var0, var1, var2, var3);
      }
}
